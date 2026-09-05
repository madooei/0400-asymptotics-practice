package asymptotics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Tests for the remove-duplicates problem. Each test is one scenario from
 * the notes, checked against both solutions: the two-pointer solution and
 * the brute-force solution must agree on every input. Both solutions modify
 * the array in place, so each gets its own copy of the input.
 */
public class RemoveDuplicatesTest {

  @Test
  public void twoUniquesThenOneDuplicate() {
    assertEquals(2, RemoveDuplicates.removeDuplicates(new int[] { 1, 1, 2 }));
    assertEquals(2, RemoveDuplicates.removeDuplicatesBruteForce(new int[] { 1, 1, 2 }));
  }

  @Test
  public void mixedDuplicatesCollapseToFiveUniques() {
    assertEquals(5, RemoveDuplicates.removeDuplicates(
        new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
    assertEquals(5, RemoveDuplicates.removeDuplicatesBruteForce(
        new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
  }

  @Test
  public void interiorRunOfDuplicates() {
    assertEquals(3, RemoveDuplicates.removeDuplicates(new int[] { 0, 1, 1, 1, 4 }));
    assertEquals(3, RemoveDuplicates.removeDuplicatesBruteForce(new int[] { 0, 1, 1, 1, 4 }));
  }

  @Test
  public void singleElement() {
    assertEquals(1, RemoveDuplicates.removeDuplicates(new int[] { 5 }));
    assertEquals(1, RemoveDuplicates.removeDuplicatesBruteForce(new int[] { 5 }));
  }

  @Test
  public void noDuplicates() {
    assertEquals(4, RemoveDuplicates.removeDuplicates(new int[] { 1, 2, 3, 4 }));
    assertEquals(4, RemoveDuplicates.removeDuplicatesBruteForce(new int[] { 1, 2, 3, 4 }));
  }

  @Test
  public void allDuplicates() {
    assertEquals(1, RemoveDuplicates.removeDuplicates(new int[] { 2, 2, 2, 2 }));
    assertEquals(1, RemoveDuplicates.removeDuplicatesBruteForce(new int[] { 2, 2, 2, 2 }));
  }

  @Test
  public void emptyArray() {
    assertEquals(0, RemoveDuplicates.removeDuplicates(new int[] {}));
    assertEquals(0, RemoveDuplicates.removeDuplicatesBruteForce(new int[] {}));
  }

  @Test
  public void twoDuplicates() {
    assertEquals(1, RemoveDuplicates.removeDuplicates(new int[] { 1, 1 }));
    assertEquals(1, RemoveDuplicates.removeDuplicatesBruteForce(new int[] { 1, 1 }));
  }

  @Test
  public void twoUniques() {
    assertEquals(2, RemoveDuplicates.removeDuplicates(new int[] { 1, 2 }));
    assertEquals(2, RemoveDuplicates.removeDuplicatesBruteForce(new int[] { 1, 2 }));
  }
}
