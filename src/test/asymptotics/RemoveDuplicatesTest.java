package asymptotics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Tests for the remove-duplicates problem. Each test is one scenario from
 * the notes. The scenarios are written once here; each solution gets its own
 * subclass that says which method to call, so you can run the suite for one
 * solution at a time.
 */
public abstract class RemoveDuplicatesTest {

  // Calls the solution under test.
  protected abstract int removeDuplicates(int[] nums);

  @Test
  public void twoUniquesThenOneDuplicate() {
    assertEquals(2, removeDuplicates(new int[] { 1, 1, 2 }));
  }

  @Test
  public void mixedDuplicatesCollapseToFiveUniques() {
    assertEquals(5, removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
  }

  @Test
  public void interiorRunOfDuplicates() {
    assertEquals(3, removeDuplicates(new int[] { 0, 1, 1, 1, 4 }));
  }

  @Test
  public void singleElement() {
    assertEquals(1, removeDuplicates(new int[] { 5 }));
  }

  @Test
  public void noDuplicates() {
    assertEquals(4, removeDuplicates(new int[] { 1, 2, 3, 4 }));
  }

  @Test
  public void allDuplicates() {
    assertEquals(1, removeDuplicates(new int[] { 2, 2, 2, 2 }));
  }

  @Test
  public void emptyArray() {
    assertEquals(0, removeDuplicates(new int[] {}));
  }

  @Test
  public void twoDuplicates() {
    assertEquals(1, removeDuplicates(new int[] { 1, 1 }));
  }

  @Test
  public void twoUniques() {
    assertEquals(2, removeDuplicates(new int[] { 1, 2 }));
  }
}
