package asymptotics;

/** Runs the Two Sum scenarios against the binary-search solution. */
public class TwoSumIIBinarySearchTest extends TwoSumIITest {

  @Override
  protected int[] twoSum(int[] numbers, int target) {
    return TwoSumII.twoSumBinarySearch(numbers, target);
  }
}
