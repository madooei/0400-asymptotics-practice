package asymptotics;

/** Runs the Two Sum scenarios against the binary-search solution. */
public class TwoSumBinarySearchTest extends TwoSumTest {

  @Override
  protected int[] twoSum(int[] numbers, int target) {
    return TwoSum.twoSumBinarySearch(numbers, target);
  }
}
