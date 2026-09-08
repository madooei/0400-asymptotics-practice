package asymptotics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Tests for the Two Sum problem. Each test is one scenario from the notes.
 * The scenarios are written once here; each solution gets its own subclass
 * that says which method to call, so you can run the suite for one solution
 * at a time.
 */
public abstract class TwoSumTest {

  // Calls the solution under test.
  protected abstract int[] twoSum(int[] numbers, int target);

  @Test
  public void answerAtTheFront() {
    int[] numbers = { 2, 7, 11, 15 };
    assertPair(0, 1, twoSum(numbers, 9));
  }

  @Test
  public void endsMeet() {
    int[] numbers = { 2, 3, 4 };
    assertPair(0, 2, twoSum(numbers, 6));
  }

  @Test
  public void answerAtTheBack() {
    int[] numbers = { 2, 3, 4 };
    assertPair(1, 2, twoSum(numbers, 7));
  }

  @Test
  public void minimumSizeInput() {
    int[] numbers = { -1, 0 };
    assertPair(0, 1, twoSum(numbers, -1));
  }

  @Test
  public void allNegativeTarget() {
    int[] numbers = { -3, -1, 0, 2, 5 };
    assertPair(0, 1, twoSum(numbers, -4));
  }

  @Test
  public void tinyArray() {
    int[] numbers = { 1, 2 };
    assertPair(0, 1, twoSum(numbers, 3));
  }

  @Test
  public void leftPointerClimbs() {
    int[] numbers = { 1, 3, 4, 5, 7, 11 };
    assertPair(4, 5, twoSum(numbers, 18));
  }

  // Asserts that actual is a two-element array holding the expected indices.
  private static void assertPair(int expectedFirst, int expectedSecond, int[] actual) {
    assertEquals(2, actual.length);
    assertEquals(expectedFirst, actual[0]);
    assertEquals(expectedSecond, actual[1]);
  }
}
