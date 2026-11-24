package demo;

import asymptotics.RemoveDuplicatesTwoPointers;
import java.util.Arrays;

/** A demo of RemoveDuplicatesTwoPointers on the example the notes walk through. */
public final class RemoveDuplicatesTwoPointersDemo {

  private RemoveDuplicatesTwoPointersDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] nums = {0, 1, 1, 1, 4};
    System.out.println("nums: " + Arrays.toString(nums));

    // Expect k = 3, with [0, 1, 4] in the first three slots.
    int k = RemoveDuplicatesTwoPointers.removeDuplicates(nums);
    System.out.println("k: " + k);
    System.out.println("first k slots: " + Arrays.toString(Arrays.copyOf(nums, k)));
  }
}
