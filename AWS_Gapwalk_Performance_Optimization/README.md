# AWS Gapwalk Performance Optimization Power

This Power teaches Kiro to identify and fix performance bottlenecks in batch jobs modernized through AWS Transform for mainframe refactor. It targets the AWS Gapwalk runtime's native APIs — `SQLExecutorBuilder` for SQL-level optimization and `addRecordToBatch()`/`batchWriteDirect()` for bulk DAO operations.

## File Descriptions

### POWER.md

The front door. It declares the Power's metadata and trigger keywords (`performance`, `optimize`, `slow`, `batch`, `SQLExecutorBuilder`, `hotspot`, `latency`) and ships two decision matrices — which technique to apply and database-level vs. application-level processing — plus quick-reference tables for JDBCType and SQLCODE. It contains no implementation detail; it routes the agent to the relevant steering file.

### hotspot-identification.md

Teaches Kiro to see the problem. It catalogues four recurring anti-patterns in batch jobs:

1. Repeated DAO reads in a loop
2. DAO writes/updates in a loop (including the indirect case where the write is hidden in a helper)
3. Java-side aggregation that belongs in SQL
4. The 1+N parent-then-children fetch

It closes with a code-review red-flag checklist and, critically, a "when NOT to batch" section covering immediate-consistency operations, dependent inserts, and same-row collisions. This guardrail prevents over-eager optimization.

### sqlexecutorbuilder-guide.md

The implementation reference for SQL-level fixes. It covers required imports, the `Sqlca` plumbing the program context must expose, the cursor-row `RecordEntity` shape, and the `PROG_n=` SQL file format. It then doubles down on the parts LLMs typically get wrong — most notably an explicit "do this, not that" on `SQLParameterBuilder` value sources:

- `getXxxReference()` from a RecordEntity
- Raw Java values
- A whole RecordEntity for FETCH output

Never the standalone `Alphanumeric`/`PackedDecimal` utility classes.

Worked examples cover SELECT INTO, parameterized cursors, INSERT/UPDATE/DELETE, and the pre-load HashMap cache pattern.

### batch-operations-guide.md

Handles the second remediation track: collapsing a loop of `dao.write()` or `dao.update()` calls into a single round-trip via `addRecordToBatch()` + `batchWriteDirect()`/`batchUpdateDirect()`. It enforces three rules that prevent silent correctness bugs:

1. Instantiate a new RecordEntity per batch add
2. Copy all fields for updates because the PK drives the row match
3. Treat writes hidden inside helper methods as batch candidates too

A short note on DAO lock semantics keeps the agent from "optimizing away" a `retrieve()` that exists to acquire a lock.