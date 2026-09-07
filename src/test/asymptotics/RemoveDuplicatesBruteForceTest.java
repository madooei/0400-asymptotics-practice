package asymptotics;

/** Runs the remove-duplicates scenarios against the brute-force solution. */
public class RemoveDuplicatesBruteForceTest extends RemoveDuplicatesTest {

  @Override
  protected int removeDuplicates(int[] nums) {
    return RemoveDuplicates.removeDuplicatesBruteForce(nums);
  }
}
