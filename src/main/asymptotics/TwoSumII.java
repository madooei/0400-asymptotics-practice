package asymptotics;

/** Solutions to the Two Sum practice problem for a sorted array. */
public final class TwoSumII {

  private TwoSumII() {
    // This class should not be instantiated!
  }

  // Assumes numbers is sorted in non-decreasing order and a solution exists.
  // Converges two pointers from both ends toward the target sum.
  public static int[] twoSum(int[] numbers, int target) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes numbers is sorted in non-decreasing order and a solution exists.
  // Checks every pair with two nested loops.
  public static int[] twoSumBruteForce(int[] numbers, int target) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes numbers is sorted in non-decreasing order and a solution exists.
  // Binary-searches for each element's complement in the sorted tail.
  public static int[] twoSumBinarySearch(int[] numbers, int target) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes arr is sorted. Binary search for target in arr[start..arr.length-1].
  // Returns the index of target, or -1 if absent.
  private static int lookup(int[] arr, int target, int start) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }
}
