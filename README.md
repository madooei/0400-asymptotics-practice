# Asymptotic Analysis — Practice: Remove Duplicates and Two Sum II

The companion code for two practice problems: removing duplicates from a
sorted array, and Two Sum on a sorted array, each implemented in every
variant the practice pages develop, with a JUnit scenario suite that checks
all variants against the same inputs.

## Prerequisites

- JDK 17+ (JUnit 6 requires it).
- The JUnit jar is already vendored in `lib/`; there is nothing to download.

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  lib/
    junit-platform-console-standalone-6.1.0.jar
  src/
    main/
      asymptotics/                 # the two practice problems
        RemoveDuplicates.java      # two-pointer and shift-on-duplicate brute force
        TwoSumII.java              # two-pointer, binary search, and brute force
    test/
      asymptotics/
        RemoveDuplicatesTest.java
        TwoSumIITest.java
  scripts/
    test.sh                        # compile everything and run the full JUnit suite
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite: every
  scenario is checked against every variant of each problem, so all the
  solutions must agree on every input.

## What's here

- `asymptotics.RemoveDuplicates` — the remove-duplicates practice problem:
  `removeDuplicates`, the O(n) two-pointer solution, and
  `removeDuplicatesBruteForce`, the O(n^2) shift-on-duplicate solution.
- `asymptotics.TwoSumII` — the Two Sum practice problem: `twoSum`, the O(n)
  two-pointer solution; `twoSumBinarySearch`, the O(n log n) binary-search
  solution; and `twoSumBruteForce`, the O(n^2) nested-loop solution.
