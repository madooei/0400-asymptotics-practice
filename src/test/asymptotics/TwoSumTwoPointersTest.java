package asymptotics;

/** Runs the Two Sum scenarios against the two-pointer solution. */
public class TwoSumTwoPointersTest extends TwoSumTest {

  @Override
  protected int[] twoSum(int[] numbers, int target) {
    return TwoSum.twoSum(numbers, target);
  }
}
