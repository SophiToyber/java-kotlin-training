# Coding Standards

This document contains baseline coding standards for this training repository.

## General principles

Prefer code that is:

- clear;
- explicit;
- testable;
- easy to change;
- small enough to understand;
- not more abstract than needed.

## Java baseline

- Use Java 21.
- Prefer immutable objects for domain values.
- Prefer clear constructors or static factory methods.
- Validate inputs early.
- Keep methods small, but do not split code mechanically.
- Prefer composition over inheritance.
- Prefer interfaces at boundaries, not everywhere by default.
- Avoid returning `null` from public APIs.
- Use `Optional` carefully and mainly for return values where absence is expected.

## Naming

Names should express intent.

Good names explain domain meaning, not implementation details.

Prefer:

```text
Money
ExchangeRate
CurrencyConverter
DiscountPolicy
OrderLine
```

Avoid vague names:

```text
Manager
Processor
Helper
Util
Data
Info
```

Use vague names only when there is a strong reason and the role is genuinely generic.

## Tests

Use JUnit 5 and AssertJ.

Test names should describe behavior:

```java
shouldAddMoneyWithSameCurrency()
shouldRejectAddingMoneyWithDifferentCurrency()
```

Prefer behavior-focused tests over implementation-focused tests.

Each meaningful rule should have at least one test.

## Exceptions

Use exceptions for exceptional situations, not for regular control flow.

Prefer standard exceptions when they fit:

- `IllegalArgumentException`
- `IllegalStateException`
- `NullPointerException` through `Objects.requireNonNull` when appropriate

Create custom exceptions only when they add real domain value.

## BigDecimal and money-like values

- Do not use `double` or `float` for money.
- Prefer `BigDecimal`.
- Be explicit about scale and rounding when the task requires it.
- Avoid hidden rounding rules.

## Streams

Streams are acceptable when they improve readability.

Do not use streams just to look modern.

Prefer normal loops when they make the code clearer.

## Spring guideline

Spring should be introduced later as infrastructure around already understood domain logic.

Do not use Spring annotations to hide weak modeling, unclear responsibilities, or missing tests.
