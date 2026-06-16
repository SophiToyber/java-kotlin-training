# Task Authoring Protocol

This document defines how learning tasks are created, clarified, planned, and reviewed in this repository.

## Purpose

Tasks must be understandable as small product or domain problems before they become code.

A task should not start with package names, class names, or implementation details. It should start with the problem being solved and the behavior expected from the system.

## AI role

AI acts as a task orchestrator, mentor, and reviewer.

AI should:

- describe the problem clearly;
- define the scenario and business rules;
- explain the learning focus;
- provide constraints and acceptance criteria;
- review the developer's proposed naming and design;
- review the final pull request.

AI should not:

- provide the final branch name as a fact;
- provide the final PR title as a fact;
- force exact class names too early;
- generate the full implementation before the first manual attempt.

## Developer role

The repository owner should actively participate in task framing.

For each learning task, the developer should propose:

- task title;
- branch name;
- PR title;
- package name;
- main domain types;
- public API shape;
- test structure;
- unclear questions or doubts.

This is part of the learning process. Naming and scope definition are engineering skills, not administrative noise.

## Task lifecycle

### 1. Task brief

AI creates a task brief using the standard task template.

The brief should describe:

- what is being built;
- why it exists;
- a realistic scenario;
- business rules;
- out-of-scope items;
- technical boundaries;
- acceptance criteria.

### 2. Developer planning response

Before writing code, the developer writes a short planning response using the planning template.

The goal is to show understanding before implementation.

### 3. Planning review

AI reviews the proposed naming, package, types, API direction, test plan, and scope.

The review should happen before the first implementation attempt.

### 4. Scaffolding

A local agent may create routine scaffolding:

- task markdown files;
- empty package directories;
- empty placeholder files if needed.

The local agent should not implement production code or completed tests for learning tasks.

### 5. Manual implementation

The developer writes the first implementation manually.

AI may answer clarification questions, but should avoid generating the complete solution.

### 6. Pull request review

AI reviews the pull request as a senior reviewer.

Review should focus on correctness, tests, naming, responsibilities, API design, simplicity, and learning value.

### 7. Handoff update

If the task changes project state or reveals important learning notes, update:

```text
docs/PROJECT_STATE.md
docs/SESSION_HANDOFF.md
```

## Standard task structure

Each task should follow:

```text
Problem
Scenario
Goal
Learning focus
Business rules
Out of scope
Technical boundaries
Design decisions for the developer
Possible domain concepts
Suggested tests
Acceptance criteria
Learning rule
```

## Standard planning structure

Each developer planning response should follow:

```text
My understanding
Proposed naming
Proposed technical placement
Proposed design
Test plan
Questions / doubts
```
