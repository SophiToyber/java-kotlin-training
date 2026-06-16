# Decisions

This document records stable project decisions so future sessions do not need to rediscover them.

## ADR-001: Use Java 21 as the baseline

Status: accepted

Java 21 is used as the main Java version.

Reasoning:

- it is a modern LTS release;
- it is suitable for current backend development;
- it gives more future-proof practice than Java 17;
- it remains conservative enough for Spring and Gradle ecosystem compatibility.

## ADR-002: Use Gradle multi-module project structure

Status: accepted

The repository uses Gradle multi-module structure.

Initial modules:

```text
modules/java-core
modules/java-domain
```

Reasoning:

- separates language mechanics from domain modeling;
- prepares the project for future Spring and Kotlin modules;
- avoids mixing all learning concerns in one source set.

## ADR-003: Do not use JPMS initially

Status: accepted

The project does not use `module-info.java` initially.

Reasoning:

- JPMS adds complexity that does not directly help the current learning goal;
- Gradle modules are enough for the intended separation;
- the current focus is coding mechanics, tests, and design.

## ADR-004: Do not add Spring in the bootstrap phase

Status: accepted

Spring modules are not added during bootstrap.

Reasoning:

- Spring can create an illusion of backend progress through annotations;
- the first phase should strengthen pure Java and domain modeling;
- Spring should wrap already tested domain logic later.

## ADR-005: Use PR-based learning workflow

Status: accepted

Work should happen through small branches and pull requests.

Reasoning:

- mirrors real engineering workflow;
- makes code review natural;
- keeps the history and learning notes visible;
- helps the user practice explaining changes.

## ADR-006: Use repository docs as the source of truth

Status: accepted

Repository docs are the primary context source between AI sessions.

Reasoning:

- long AI sessions become noisy over time;
- new sessions need stable context;
- `PROJECT_STATE.md` and `SESSION_HANDOFF.md` should make continuation predictable.
