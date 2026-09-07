package asymptotics;

/** Runs the Two Sum scenarios against the two-pointer solution. */
public class TwoSumIITwoPointersTest extends TwoSumIITest {

  @Override
  protected int[] twoSum(int[] numbers, int target) {
    return TwoSumII.twoSum(numbers, target);
  }
}
