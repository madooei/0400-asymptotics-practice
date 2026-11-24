package demo;

import asymptotics.TwoSumBruteForce;
import java.util.Arrays;

/** A demo of TwoSumBruteForce on the example the notes trace. */
public final class TwoSumBruteForceDemo {

  private TwoSumBruteForceDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] numbers = {2, 7, 11, 15};
    int target = 26;
    System.out.println("numbers: " + Arrays.toString(numbers) + ", target = " + target);

    // 11 + 15 = 26, the pair at the very end. Expect [2, 3].
    int[] indices = TwoSumBruteForce.twoSum(numbers, target);
    System.out.println("indices: " + Arrays.toString(indices));
  }
}
