# Review Guidelines

This document defines how pull requests should be reviewed in this repository.

## Review priorities

Review should focus on learning value and code quality, not only on whether tests pass.

Main review areas:

1. Correctness
2. Test coverage and test naming
3. Domain model clarity
4. API design
5. Naming
6. Responsibility boundaries
7. Immutability
8. Error handling
9. Simplicity
10. Refactoring opportunities

## Review tone

Review comments should be direct but constructive.

Prefer explaining why something matters instead of only saying that it is wrong.

## What to check in Java tasks

- Are value objects immutable where possible?
- Are constructors and factory methods clear?
- Are invalid states prevented early?
- Are method names intention-revealing?
- Are exceptions meaningful and not over-engineered?
- Are collections exposed safely?
- Are BigDecimal and money-like values handled carefully?
- Are streams used only when they improve readability?
- Are tests focused on behavior rather than implementation details?

## What to avoid

Avoid approving code only because it works.

Also check whether the solution is:

- easy to read;
- easy to change;
- not over-abstracted;
- not framework-driven too early;
- consistent with the task's learning goal.

## Review output format

A useful review should usually include:

```text
Summary
Strengths
Issues / risks
Suggested changes
Learning notes
Next action
```

For large PRs, group comments by topic rather than listing every small issue separately.
