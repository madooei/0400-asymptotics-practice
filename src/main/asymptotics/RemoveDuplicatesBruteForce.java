package asymptotics;

/** Practice problem: remove the duplicates from a sorted array by shifting the tail left. */
public final class RemoveDuplicatesBruteForce {

  private RemoveDuplicatesBruteForce() {
    // This class should not be instantiated!
  }

  // Assumes nums is sorted in non-decreasing order. Removes the duplicates
  // by shifting the tail left every time a duplicate is found and returns
  // the count of unique elements, kept at the front of the array.
  public static int removeDuplicates(int[] nums) {
    int n = nums.length;  // number of valid elements; shrinks as we remove duplicates
    for (int i = 1; i < n; i++) {
      if (nums[i] == nums[i - 1]) {
        shiftLeft(nums, i, nums[i]);
        n--;  // one fewer valid element
        i--;  // stay at the same index to check the new element
      }
    }

    return n;
  }

  // Shift every element from start one place to the left, then park the
  // duplicate at the end.
  private static void shiftLeft(int[] nums, int start, int duplicate) {
    for (int i = start; i < nums.length - 1; i++) {
      nums[i] = nums[i + 1];
    }
    nums[nums.length - 1] = duplicate;  // or any value, since it will be ignored
  }
}
