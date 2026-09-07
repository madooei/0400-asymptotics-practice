package asymptotics;

/** Runs the Two Sum scenarios against the brute-force solution. */
public class TwoSumIIBruteForceTest extends TwoSumIITest {

  @Override
  protected int[] twoSum(int[] numbers, int target) {
    return TwoSumII.twoSumBruteForce(numbers, target);
  }
}
