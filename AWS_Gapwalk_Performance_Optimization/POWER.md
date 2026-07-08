---
name: aws-gapwalk-performance-optimization
version: 1.0.0
description: Performance optimization guidance for applications modernized with AWS Transform for mainframe refactor (AWS Gapwalk runtime)
keywords:
  - performance
  - optimization
  - optimize
  - slow
  - batch
  - SQLExecutorBuilder
  - hotspot
  - latency
---

# AWS Gapwalk Performance Optimization

This power provides comprehensive guidance for identifying and implementing performance optimizations in applications modernized from AS/400/iSeries using AWS Transform for mainframe refactor (running on the AWS Gapwalk runtime).

## Overview

Modernized applications often carry performance bottlenecks from patterns that worked on mainframes but don't translate well to Java/RDBMS. This power helps identify these hotspots and implement optimizations using:

- **SQLExecutorBuilder** — Execute custom SQL, cursors, aggregations, and joins directly
- **DAO Batch Operations** — Batch multiple writes/updates into single database round-trips
- **Pre-load Caching** — Replace repeated lookups with HashMap-based caching

## When to Use Each Technique

| Technique | Use Case |
|-----------|----------|
| SQLExecutorBuilder | Custom SQL, cursors, aggregations, joins, set-based operations |
| Batch writes/updates | Multiple INSERTs or UPDATEs to same table in a loop |
| Pre-load cache | Repeated lookups of reference data |

## Database-Level vs Application-Level Processing

**Use SQLExecutorBuilder (database level) when:**
- Aggregations (SUM, COUNT, AVG, GROUP BY)
- Filtering large datasets (WHERE clauses)
- Joining multiple tables
- Sorting large result sets
- Complex calculations on many rows

**Keep at application level when:**
- Business logic is complex and procedural
- Results need to be cached for multiple uses
- Processing requires external service calls

## Steering Files

This power includes detailed implementation guides:

- `hotspot-identification.md` — How to identify performance bottlenecks in code
- `sqlexecutorbuilder-guide.md` — Complete SQLExecutorBuilder API reference and examples
- `batch-operations-guide.md` — DAO batch write/update patterns and rules

## JDBCType Reference

| JDBCType | Java Type | SQL Type |
|----------|-----------|----------|
| `VARCHAR` | String | VARCHAR, CHAR |
| `INTEGER` | int, Integer | INT, INTEGER |
| `BIGINT` | long, Long | BIGINT |
| `DECIMAL` | BigDecimal | DECIMAL, NUMERIC |
| `DATE` | LocalDate, String | DATE |
| `TIMESTAMP` | Timestamp, String | TIMESTAMP |
| `TIME` | LocalTime, String | TIME |