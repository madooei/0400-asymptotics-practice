package demo;

import asymptotics.TwoSumBinarySearch;
import java.util.Arrays;

/** A demo of TwoSumBinarySearch on the example the notes trace. */
public final class TwoSumBinarySearchDemo {

  private TwoSumBinarySearchDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] numbers = {2, 7, 11, 15};
    int target = 9;
    System.out.println("numbers: " + Arrays.toString(numbers) + ", target = " + target);

    // 2 + 7 = 9. Expect [0, 1].
    int[] indices = TwoSumBinarySearch.twoSum(numbers, target);
    System.out.println("indices: " + Arrays.toString(indices));
  }
}
