package asymptotics;

/** Practice problem: Two Sum on a sorted array by checking every pair. */
public final class TwoSumBruteForce {

  private TwoSumBruteForce() {
    // This class should not be instantiated!
  }

  // Assumes numbers is sorted in non-decreasing order and a solution exists.
  public static int[] twoSum(int[] numbers, int target) {
    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] + numbers[j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return new int[0];  // unreachable: the problem guarantees a solution exists
  }
}
