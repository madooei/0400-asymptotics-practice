# Asymptotic Notation — Practice: Remove Duplicates and Two Sum II

The companion code for two practice problems: removing duplicates from a sorted array, and Two Sum on a sorted array, each implemented in every variant the practice pages develop, with a JUnit scenario suite for each problem that you can run against one variant at a time or all of them.

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
      asymptotics/                         # the two practice problems
        RemoveDuplicatesBruteForce.java    # shift the tail left on every duplicate
        RemoveDuplicatesTwoPointers.java   # one pass with two pointers
        TwoSumBruteForce.java              # check every pair
        TwoSumBinarySearch.java            # binary search for each complement
        TwoSumTwoPointers.java             # one pass with two pointers
    test/
      asymptotics/
        RemoveDuplicatesTest.java              # the scenarios, written once
        RemoveDuplicatesBruteForceTest.java    # runs them against RemoveDuplicatesBruteForce
        RemoveDuplicatesTwoPointersTest.java   # runs them against RemoveDuplicatesTwoPointers
        TwoSumTest.java                        # the scenarios, written once
        TwoSumBruteForceTest.java              # runs them against TwoSumBruteForce
        TwoSumBinarySearchTest.java            # runs them against TwoSumBinarySearch
        TwoSumTwoPointersTest.java             # runs them against TwoSumTwoPointers
  scripts/
    test.sh                                # compile everything and run the JUnit tests
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite: every scenario is checked against every variant of each problem, so all the solutions must agree on every input.
- `scripts/test.sh asymptotics.TwoSumBruteForceTest` — compiles everything and runs the scenarios against one variant only. Use this while you are working on one solution and the others are still empty. The class names are listed in the layout above.

Each problem's scenarios live in one abstract test class (`TwoSumTest`, `RemoveDuplicatesTest`). The small classes that extend it do nothing but say which class to call, so the same scenarios run against every variant without being copied.

## What's here

Each solution is its own class, and every class for one problem has the same method name.

- `asymptotics.RemoveDuplicatesBruteForce` — `removeDuplicates`, the O(n^2) solution that shifts the tail left on every duplicate.
- `asymptotics.RemoveDuplicatesTwoPointers` — `removeDuplicates`, the O(n) solution with two pointers.
- `asymptotics.TwoSumBruteForce` — `twoSum`, the O(n^2) solution that checks every pair with two nested loops.
- `asymptotics.TwoSumBinarySearch` — `twoSum`, the O(n log n) solution that binary searches for each complement.
- `asymptotics.TwoSumTwoPointers` — `twoSum`, the O(n) solution with two pointers.
