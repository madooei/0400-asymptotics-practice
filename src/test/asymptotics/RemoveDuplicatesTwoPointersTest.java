package asymptotics;

/** Runs the remove-duplicates scenarios against the two-pointer solution. */
public class RemoveDuplicatesTwoPointersTest extends RemoveDuplicatesTest {

  @Override
  protected int removeDuplicates(int[] nums) {
    return RemoveDuplicates.removeDuplicates(nums);
  }
}
