# Asymptotic Notation — Practice: Remove Duplicates and Two Sum II

The companion code for two practice problems: removing duplicates from a
sorted array, and Two Sum on a sorted array, each implemented in every
variant the practice pages develop, with a JUnit scenario suite for each
problem that you can run against one variant at a time or all of them.

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
        TwoSum.java                # two-pointer, binary search, and brute force
    test/
      asymptotics/
        RemoveDuplicatesTest.java              # the scenarios, written once
        RemoveDuplicatesTwoPointersTest.java   # runs them against the two-pointer solution
        RemoveDuplicatesBruteForceTest.java    # runs them against the brute-force solution
        TwoSumTest.java                        # the scenarios, written once
        TwoSumTwoPointersTest.java             # runs them against the two-pointer solution
        TwoSumBinarySearchTest.java            # runs them against the binary-search solution
        TwoSumBruteForceTest.java              # runs them against the brute-force solution
  scripts/
    test.sh                        # compile everything and run the JUnit tests
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite: every
  scenario is checked against every variant of each problem, so all the
  solutions must agree on every input.
- `scripts/test.sh asymptotics.TwoSumBruteForceTest` — compiles everything
  and runs the scenarios against one variant only. Use this while you are
  working on one solution and the others are still empty. The class names
  are listed in the layout above.

Each problem's scenarios live in one abstract test class (`TwoSumTest`,
`RemoveDuplicatesTest`). The small classes that extend it do nothing but say
which method to call, so the same scenarios run against every variant
without being copied.

## What's here

- `asymptotics.RemoveDuplicates` — the remove-duplicates practice problem:
  `removeDuplicates`, the O(n) two-pointer solution, and
  `removeDuplicatesBruteForce`, the O(n^2) shift-on-duplicate solution.
- `asymptotics.TwoSum` — the Two Sum practice problem: `twoSum`, the O(n)
  two-pointer solution; `twoSumBinarySearch`, the O(n log n) binary-search
  solution; and `twoSumBruteForce`, the O(n^2) nested-loop solution.
