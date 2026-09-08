package asymptotics;

/** Solutions to the Two Sum practice problem for a sorted array. */
public final class TwoSum {

  private TwoSum() {
    // This class should not be instantiated!
  }

  // Assumes numbers is sorted in non-decreasing order and a solution exists.
  // Converges two pointers from both ends toward the target sum.
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

  // Assumes numbers is sorted in non-decreasing order and a solution exists.
  // Checks every pair with two nested loops.
  public static int[] twoSumBruteForce(int[] numbers, int target) {
    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] + numbers[j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return new int[0];  // unreachable: the problem guarantees a solution exists
  }

  // Assumes numbers is sorted in non-decreasing order and a solution exists.
  // Binary-searches for each element's complement in the sorted tail.
  public static int[] twoSumBinarySearch(int[] numbers, int target) {
    for (int i = 0; i < numbers.length - 1; i++) {
      int complement = target - numbers[i];
      int j = lookup(numbers, complement, i + 1);
      if (j != -1) {
        return new int[] { i, j };
      }
    }
    return new int[0];  // unreachable: the problem guarantees a solution exists
  }

  // Assumes arr is sorted. Binary search for target in arr[start..arr.length-1].
  // Returns the index of target, or -1 if absent.
  private static int lookup(int[] arr, int target, int start) {
    int left = start;
    int right = arr.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }
}
