# Learning Protocol

This document defines how work is done in this repository.

## Session strategy

One AI session should usually cover one or two tasks maximum.

At the beginning of a new session, the AI should read:

```text
docs/AI_CONTEXT.md
docs/PROJECT_STATE.md
docs/SESSION_HANDOFF.md
docs/DECISIONS.md
```

If there is an active pull request, the AI should also read the PR diff and comments.

At the end of a working session, update when needed:

```text
docs/PROJECT_STATE.md
docs/SESSION_HANDOFF.md
```

## Branch naming

Use simple branch names without external ticket numbers.

Format:

```text
<type>/<short-description>
```

Examples:

```text
chore/bootstrap-training-repo
docs/update-learning-protocol
task/001-money
fix/001-money-rounding
refactor/001-money-api
test/001-money-edge-cases
experiment/collections-api-design
```

## Pull request naming

Use a simple Conventional Commits style:

```text
<type>: <short description>
```

Examples:

```text
chore: bootstrap training repository
docs: update learning protocol
task: implement money domain model
fix: correct money rounding
refactor: simplify currency converter API
test: add edge cases for currency conversion
```

## Work process

For learning tasks:

1. Create a small task description.
2. Create a task branch.
3. Think through the model and tests before implementation.
4. Write the first implementation manually.
5. Open a pull request.
6. Ask AI for review.
7. Apply fixes manually.
8. Merge after the solution is clean enough.
9. Update project state and session handoff if needed.

## Pull request size

Prefer small pull requests.

A pull request should usually focus on one of these:

- project infrastructure;
- one learning task;
- one refactoring;
- one fix;
- one documentation update.

Do not mix a new task, refactoring, and unrelated infrastructure changes in one PR.

## AI review flow

When reviewing a PR, AI should check:

- correctness;
- tests;
- edge cases;
- naming;
- responsibilities;
- immutability;
- API design;
- simplicity;
- unnecessary abstractions;
- consistency with repository standards.
