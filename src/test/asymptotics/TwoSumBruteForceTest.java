package asymptotics;

/** Runs the Two Sum scenarios against the brute-force solution. */
public class TwoSumBruteForceTest extends TwoSumTest {

  @Override
  protected int[] twoSum(int[] numbers, int target) {
    return TwoSum.twoSumBruteForce(numbers, target);
  }
}
