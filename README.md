# architecture2026 — SOLID & GRASP refactoring sandbox

Teaching sandbox for a software architecture lecture. Every sample models a
small, realistic situation from a **university information system** (students,
courses, enrollments, grades, transcripts, tuition, scholarships, library,
payroll). External dependencies are mocked — a database is an in-memory
`List`/`Map`, e-mail / SMS is a `System.out` line, an HTTP payment API is a stub
that logs. Each sample has a `Demo` with a `main()` that prints a narrative
console log showing the system either working correctly or misbehaving because a
principle is violated.

## Branches

| Branch   | State                                                       | Use                          |
|----------|------------------------------------------------------------|------------------------------|
| `master` | scaffold only (`pom.xml`, this README, `common/Console`)   | shared base                  |
| `bad`    | every sample with the principle **violated**              | refactor live in the lecture |
| `good`   | every sample **refactored** (branched from `bad`)         | reference / safety net       |

Because `good` is branched from `bad`, the solution for a single sample is just
its diff:

```bash
git diff bad good -- src/main/java/ua/edu/chnu/solid/ocp
```

## Running a demo

```bash
# one sample
mvn -q compile exec:java -Dexec.mainClass=ua.edu.chnu.solid.ocp.OcpDemo

# every sample, back to back
mvn -q compile exec:java -Dexec.mainClass=ua.edu.chnu.AllDemos
```

## Samples

### SOLID — `ua.edu.chnu.solid`

| Package | Principle | Demo | Scenario |
|---------|-----------|------|----------|
| `srp`   | Single Responsibility | `SrpDemo` | one enrollment "god class" persists, validates, prices, formats letters, e-mails, audits |
| `ocp`   | Open/Closed           | `OcpDemo` | final-grade calculator with a `switch` per grading scheme, repeated three times |
| `lsp`   | Liskov Substitution   | `LspDemo` | `OnlineSection` subclass breaks the `CourseSection.enroll` contract |
| `isp`   | Interface Segregation | `IspDemo` | one fat `UniversityMember` interface; `Student` throws on teaching methods |
| `dip`   | Dependency Inversion  | `DipDemo` | `ScholarshipService` news up its own Postgres / SMTP / clock |

### GRASP — `ua.edu.chnu.grasp`

| Package | Principle | Demo | Scenario |
|---------|-----------|------|----------|
| `informationexpert`  | Information Expert   | `InformationExpertDemo`  | GPA math done by a service reaching through getters; two services disagree |
| `creator`            | Creator             | `CreatorDemo`            | `Enrollment` built outside `Course`; roster count goes stale |
| `controller`         | Controller          | `ControllerDemo`        | two UIs each orchestrate registration; behaviour has drifted |
| `lowcoupling`        | Low Coupling        | `LowCouplingDemo`       | `DegreeAuditService` wired to six concrete infrastructure classes |
| `highcohesion`       | High Cohesion       | `HighCohesionDemo`      | `UniversityAdminFacade` does registration, payroll, library, scheduling, safety |
| `polymorphism`       | Polymorphism        | `PolymorphismDemo`      | notification channel `if/else` type-switch repeated in three methods |
| `purefabrication`    | Pure Fabrication    | `PureFabricationDemo`   | `Student` entity carries its own JDBC `saveToDatabase()` |
| `indirection`        | Indirection         | `IndirectionDemo`       | billing service calls two payment vendor APIs directly |
| `protectedvariations`| Protected Variations| `ProtectedVariationsDemo`| grade-classification thresholds hard-coded in three consumers |

Each sample package has its own `README.md` with the smell, the task, and hints.
