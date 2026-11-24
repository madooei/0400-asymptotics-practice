package demo;

import asymptotics.RemoveDuplicatesBruteForce;
import java.util.Arrays;

/** A demo of RemoveDuplicatesBruteForce on the example the notes trace. */
public final class RemoveDuplicatesBruteForceDemo {

  private RemoveDuplicatesBruteForceDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] nums = {1, 1, 1, 2, 3, 3};
    System.out.println("nums: " + Arrays.toString(nums));

    // Expect k = 3, with [1, 2, 3] in the first three slots.
    int k = RemoveDuplicatesBruteForce.removeDuplicates(nums);
    System.out.println("k: " + k);
    System.out.println("first k slots: " + Arrays.toString(Arrays.copyOf(nums, k)));
  }
}
