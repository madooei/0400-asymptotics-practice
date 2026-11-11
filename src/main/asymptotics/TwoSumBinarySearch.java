package asymptotics;

/** Practice problem: Two Sum on a sorted array with a binary search for each complement. */
public final class TwoSumBinarySearch {

  private TwoSumBinarySearch() {
    // This class should not be instantiated!
  }

  // Assumes numbers is sorted in non-decreasing order and a solution exists.
  public static int[] twoSum(int[] numbers, int target) {
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
