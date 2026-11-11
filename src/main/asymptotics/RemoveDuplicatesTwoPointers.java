package asymptotics;

/** Practice problem: remove the duplicates from a sorted array with two pointers. */
public final class RemoveDuplicatesTwoPointers {

  private RemoveDuplicatesTwoPointers() {
    // This class should not be instantiated!
  }

  // Assumes nums is sorted in non-decreasing order. Removes the duplicates
  // in place with two pointers in a single pass and returns the count of
  // unique elements, kept at the front of the array.
  public static int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    int slow = 0;  // last slot of the unique prefix
    for (int fast = 1; fast < nums.length; fast++) {
      if (nums[fast] != nums[slow]) {
        slow++;
        nums[slow] = nums[fast];
      }
    }

    return slow + 1;
  }
}
