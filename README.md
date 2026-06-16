# Java Kotlin Training

A training repository for rebuilding and strengthening manual coding skills in Java, Kotlin, and backend development.

The goal of this repository is not to collect generated solutions. The goal is to practice the full engineering loop manually:

```text
understand task -> design model -> write tests -> implement -> refactor -> review -> document lessons
```

## Current focus

The initial focus is Java 21, Gradle multi-module projects, clean code, unit testing, and domain modeling without Spring.

Spring, Kotlin, persistence, and integration testing will be added later as separate phases.

## Project structure

```text
.github/
  pull_request_template.md

docs/
  AI_CONTEXT.md
  LEARNING_PROTOCOL.md
  PROJECT_STATE.md
  REVIEW_GUIDELINES.md
  CODING_STANDARDS.md
  DECISIONS.md
  SESSION_HANDOFF.md

gradle/
  libs.versions.toml

modules/
  java-core/
  java-domain/
```

## Modules

### `modules:java-core`

Small Java practice tasks focused on language mechanics: collections, strings, dates, BigDecimal, Optional, streams, exceptions, generics, and unit tests.

### `modules:java-domain`

Pure domain logic without Spring: value objects, entities, policies, services, interfaces, and tests.

## Requirements

- Java 21
- Gradle Wrapper from this repository

## Useful commands

Run all tests:

```bash
./gradlew test
```

Run tests for one module:

```bash
./gradlew :modules:java-core:test
./gradlew :modules:java-domain:test
```

## Workflow

Work is done through small pull requests.

Branch naming examples:

```text
chore/bootstrap-training-repo
docs/update-learning-protocol
task/001-money
fix/001-money-rounding
refactor/001-money-api
```

Pull request titles should follow a simple Conventional Commits style:

```text
chore: bootstrap training repository
task: implement money domain model
docs: update learning protocol
fix: correct money rounding
refactor: simplify currency converter API
```

## AI usage rule

AI is used as a mentor and reviewer, not as the primary code author.

AI may explain concepts, suggest review comments, help design tasks, and review pull requests. For learning tasks, the first implementation attempt should be written manually before asking AI for a full review.
