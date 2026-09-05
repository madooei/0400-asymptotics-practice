package asymptotics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Tests for the Two Sum problem. Each test is one scenario from the notes,
 * checked against all three solutions: the two-pointer, brute-force, and
 * binary-search solutions must agree on every input.
 */
public class TwoSumIITest {

  @Test
  public void answerAtTheFront() {
    int[] numbers = { 2, 7, 11, 15 };
    assertPair(0, 1, TwoSumII.twoSum(numbers, 9));
    assertPair(0, 1, TwoSumII.twoSumBruteForce(numbers, 9));
    assertPair(0, 1, TwoSumII.twoSumBinarySearch(numbers, 9));
  }

  @Test
  public void endsMeet() {
    int[] numbers = { 2, 3, 4 };
    assertPair(0, 2, TwoSumII.twoSum(numbers, 6));
    assertPair(0, 2, TwoSumII.twoSumBruteForce(numbers, 6));
    assertPair(0, 2, TwoSumII.twoSumBinarySearch(numbers, 6));
  }

  @Test
  public void answerAtTheBack() {
    int[] numbers = { 2, 3, 4 };
    assertPair(1, 2, TwoSumII.twoSum(numbers, 7));
    assertPair(1, 2, TwoSumII.twoSumBruteForce(numbers, 7));
    assertPair(1, 2, TwoSumII.twoSumBinarySearch(numbers, 7));
  }

  @Test
  public void minimumSizeInput() {
    int[] numbers = { -1, 0 };
    assertPair(0, 1, TwoSumII.twoSum(numbers, -1));
    assertPair(0, 1, TwoSumII.twoSumBruteForce(numbers, -1));
    assertPair(0, 1, TwoSumII.twoSumBinarySearch(numbers, -1));
  }

  @Test
  public void allNegativeTarget() {
    int[] numbers = { -3, -1, 0, 2, 5 };
    assertPair(0, 1, TwoSumII.twoSum(numbers, -4));
    assertPair(0, 1, TwoSumII.twoSumBruteForce(numbers, -4));
    assertPair(0, 1, TwoSumII.twoSumBinarySearch(numbers, -4));
  }

  @Test
  public void tinyArray() {
    int[] numbers = { 1, 2 };
    assertPair(0, 1, TwoSumII.twoSum(numbers, 3));
    assertPair(0, 1, TwoSumII.twoSumBruteForce(numbers, 3));
    assertPair(0, 1, TwoSumII.twoSumBinarySearch(numbers, 3));
  }

  @Test
  public void leftPointerClimbs() {
    int[] numbers = { 1, 3, 4, 5, 7, 11 };
    assertPair(4, 5, TwoSumII.twoSum(numbers, 18));
    assertPair(4, 5, TwoSumII.twoSumBruteForce(numbers, 18));
    assertPair(4, 5, TwoSumII.twoSumBinarySearch(numbers, 18));
  }

  // Asserts that actual is a two-element array holding the expected indices.
  private static void assertPair(int expectedFirst, int expectedSecond, int[] actual) {
    assertEquals(2, actual.length);
    assertEquals(expectedFirst, actual[0]);
    assertEquals(expectedSecond, actual[1]);
  }
}
