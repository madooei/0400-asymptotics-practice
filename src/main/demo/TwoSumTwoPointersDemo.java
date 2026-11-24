package demo;

import asymptotics.TwoSumTwoPointers;
import java.util.Arrays;

/** A demo of TwoSumTwoPointers on the example the notes trace. */
public final class TwoSumTwoPointersDemo {

  private TwoSumTwoPointersDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] numbers = {2, 7, 11, 15};
    int target = 9;
    System.out.println("numbers: " + Arrays.toString(numbers) + ", target = " + target);

    // 2 + 7 = 9. Expect [0, 1].
    int[] indices = TwoSumTwoPointers.twoSum(numbers, target);
    System.out.println("indices: " + Arrays.toString(indices));
  }
}
