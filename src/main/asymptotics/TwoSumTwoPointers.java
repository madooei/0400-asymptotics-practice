package asymptotics;

/** Practice problem: Two Sum on a sorted array with two pointers. */
public final class TwoSumTwoPointers {

  private TwoSumTwoPointers() {
    // This class should not be instantiated!
  }

  // Assumes numbers is sorted in non-decreasing order and a solution exists.
  public static int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;

    while (left < right) {
      int sum = numbers[left] + numbers[right];

      if (sum == target) {
        return new int[] { left, right };
      } else if (sum < target) {
        left++;
      } else {
        right--;
      }
    }

    return new int[0];  // unreachable: the problem guarantees a solution exists
  }
}
