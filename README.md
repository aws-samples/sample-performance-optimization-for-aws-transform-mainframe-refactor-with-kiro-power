# CardDemo AWS Transform Mainframe Refactor Performance Optimization Sample

This repository demonstrates AI-assisted performance optimization of applications modernized using AWS Transform for mainframe refactor, using Kiro IDE and a purpose-built AWS Transform Mainframe Refactor Performance Optimization Power.

## Overview

CardDemo is a credit card management system modernized from AS/400 through the AWS Transform for mainframe refactor pattern. It includes online transaction processing and batch jobs.

This sample provides:
- An unoptimized batch job (CDBALC01) that replicates mainframe sequential processing patterns
- A Kiro Power with AWS Gapwalk runtime-specific optimization patterns (SQLExecutorBuilder, batch writes, pre-load caching)

Run the Kiro Power against the sample to generate optimizations and measure the performance gains for yourself.

> **Cost Note:** This sample runs locally (Tomcat, PostgreSQL, local build). The primary cost is Kiro usage for running the optimization Power. Refer to Kiro pricing for details.

## Prerequisites

- Java 17+
- Maven 3.6+
- PostgreSQL 13+
- Apache Tomcat 10.1+ with AWS Gapwalk runtime (v5.74.0), the managed runtime component of AWS Transform for mainframe refactor
- Kiro IDE (for running optimizations)

## Repository Structure

```
carddemo-as400-pom/          # Application source (multi-module Maven)
├── carddemo-as400-entities/ # Data models, context classes, record entities
├── carddemo-as400-service/  # Business logic, batch job implementations
├── carddemo-as400-tools/    # Utility components
└── carddemo-as400-web/      # Angular frontend (optional)
database/                    # SQL schemas and test data
server/                      # Tomcat runtime configuration
└── conf/                    # External application configuration
```

## Quick Start

### 1. Clone and Build

```bash
git clone <repo-url>
cd carddemo-as400-pom
mvn clean package -DskipTests
```

### 2. Database Setup

This sample assumes you already have the modernized CardDemo application and its PostgreSQL database up and running. Apply the additional schema and test data needed for the CDBALC01 demo against your existing database:

```bash
# Additional table required by the CDBALC01 demo
psql -U <user> -d <database> -f database/outstanding_Balance.sql

# Supporting view
psql -U <user> -d <database> -f database/views/CDTRNR03.lf.sql

# Test data for the demo
psql -U <user> -d <database> -f database/test_data_5000_customers.sql
psql -U <user> -d <database> -f database/transactions_test_data.sql
```

### 3. Deploy to Tomcat

Copy the built WAR to your Tomcat webapps directory:

```bash
cp carddemo-as400-service/target/carddemo-as400-service.war <TOMCAT_HOME>/webapps/
```

### 4. Configure

Edit `server/conf/application-cdbalc01.yml` to set the date range and card limit:

```yaml
cdbalc01:
  process-start-date: "2025-11-01"
  process-end-date: "2025-11-30"
  card-limit: 1000
```

### 5. Run the Batch Job

Trigger the CDBALC01 batch job via the AWS Gapwalk runtime script endpoint:

```
POST http://localhost:8080/gapwalk-application/scripts/run/CDBALC01-BATCH
```

### 6. Verify Execution

Check the batch job completed successfully:

```bash
# Check Tomcat logs for completion message
tail -f <TOMCAT_HOME>/logs/catalina.out | grep CDBALC01

# Verify outstanding_balance table was updated
psql -U <user> -d <database> -c "SELECT COUNT(*) FROM outstanding_balance WHERE process_date = '2025-11-30';"
```

## Using the Kiro Power for Optimization

### Install the Power

Copy the AWS_Transform_Mainframe_Refactor_Performance_Optimization Power to your Kiro powers directory:

```bash
cp -r AWS_Transform_Mainframe_Refactor_Performance_Optimization Power ~/.kiro/powers/installed/
```

### Run Optimization

Open the project in Kiro and prompt:

```
Optimize batch job CDBALC01 for performance
```

Kiro will analyze the code, identify hotspots, and propose optimizations using AWS Gapwalk runtime-specific patterns (SQLExecutorBuilder, batch writes, bulk operations).

## Batch Jobs

| Job | Program | Function |
|-----|---------|----------|
| CDBPL011M | Transaction Posting | Posts pending transactions to accounts |
| CDBPL012M | Interest Calculation | Calculates monthly interest charges |
| CDBALC01 | Balance Calculation | Computes outstanding balances across all cards |

## Test Data

All test data is synthetically generated. No real customer data is used. SSNs use invalid 000-prefix, phone numbers use fictional 555 range.

- `test_data_5000_customers.sql` — 5000 customers, 10000 accounts, 10000 cards
- `transactions_test_data.sql` — Transaction history for the configured date range

## Cleanup

To remove all resources created by this sample:

### 1. Stop and Remove Tomcat Deployment

```bash
rm <TOMCAT_HOME>/webapps/carddemo-as400-service.war
rm -rf <TOMCAT_HOME>/webapps/carddemo-as400-service/
```

### 2. Remove CDBALC01 Demo Tables and Test Data

Since this sample shares the modernized CardDemo database, drop only the tables and test data added by this demo rather than the whole database:

```bash
psql -U <user> -d <database> -c "DROP TABLE IF EXISTS CDBALP_CDBALP CASCADE;"
```

If you also want to remove the test data loaded for this demo, restore your prior dataset or truncate the affected tables per your environment's needs.

### 3. Remove Configuration Files

```bash
rm server/conf/application-cdbalc01.yml
```

### 4. Verify Cleanup

- Confirm no WAR file exists in Tomcat webapps
- Confirm the demo-specific tables are removed from your PostgreSQL database

## License

This sample is provided for demonstration purposes.