import com.shashi.MaximumSumSubArrayFinder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSumSubArrayFinderTest {

    private MaximumSumSubArrayFinder classUnderTest;

    @BeforeEach
    public void setUp() {
        classUnderTest = new MaximumSumSubArrayFinder();
    }

    @Test
    public void givenAnEmptyInputArrayWhenFindMaximumSumSubArrayThenReturnInvalid() {
        int[] input = {};
        int k = 4;

        String calculatedMaximumSum = classUnderTest.findMaximumSumSubArray(input, k);

        assertEquals("Invalid", calculatedMaximumSum);

    }

    @Test
    public void given_k_IsGreaterThanInputArraySizeWhenFindMaximumSumSubArrayThenReturnInvalid() {
        int[] input = {2, 3};
        int k = 3;
        String calculatedMaximumSum = classUnderTest.findMaximumSumSubArray(input, k);

        assertEquals("Invalid", calculatedMaximumSum);

    }

    @Test
    public void given_k_IsNegativeWhenFindMaximumSumSubArrayThenReturnInvalid() {
        int[] input = {1, 2, 3, 7, 4};
        int k = -3;

        String calculatedMaximumSum = classUnderTest.findMaximumSumSubArray(input, k);

        assertEquals("Invalid", calculatedMaximumSum);

    }

    @Test
    public void given_k_IsZeroWhenFindMaximumSumSubArrayThenReturnInvalid() {
        int[] input = {1, 3};
        int k = 0;

        String calculatedMaximumSum = classUnderTest.findMaximumSumSubArray(input, k);

        assertEquals("Invalid", calculatedMaximumSum);

    }

    @Test
    public void givenANonEmptyArrayAndKis2WhenFindMaximumSumSubArrayThenReturn700() {
        int[] input = {100, 200, 300, 400};
        int k = 2;

        String calculatedMaximumSum = classUnderTest.findMaximumSumSubArray(input, k);

        assertEquals("700", calculatedMaximumSum);

    }

    @Test
    public void givenANonEmptyArrayAnd_k_is2WhenFindMaximumSumSubArrayThenReturn500() {
        int[] input = {100, 200, 300, 50};
        int k = 2;

        String calculatedMaximumSum = classUnderTest.findMaximumSumSubArray(input, k);

        assertEquals("500", calculatedMaximumSum);

    }

    @Test
    public void givenANonEmptyArrayAnd_k_is4WhenFindMaximumSumSubArrayThenReturn39() {
        int[] input = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;

        String calculatedMaximumSum = classUnderTest.findMaximumSumSubArray(input, k);

        assertEquals("39", calculatedMaximumSum);

    }

    @Test
    public void givenANonEmptyArrayAnd_k_is5WhenFindMaximumSumSubArrayThenReturn19() {
        int[] input = {7, 15, 2, -2, -3, 1, 0, 20};
        int k = 5;

        String calculatedMaximumSum = classUnderTest.findMaximumSumSubArray(input, k);

        assertEquals("19", calculatedMaximumSum);

    }

    @Test
    public void givenANonEmptyArrayAnd_k_is5WhenFindMaximumSumSubArrayThenReturn16() {
        int[] input = {1, 4, 2, -2, -3, 1, 0, 20};
        int k = 5;

        String calculatedMaximumSum = classUnderTest.findMaximumSumSubArray(input, k);

        assertEquals("16", calculatedMaximumSum);

    }

    @Test
    public void givenANonEmptyArrayAnd_k_is2WhenFindMaximumSumSubArrayAndMaximumSumOverflowsIntegerLimitThenReturn4294967294() {
        //Adding any positive value to max integer will lead to integer overflow. Handling that through this test case
        int[] input = {1, 4, 2, -2, 3, Integer.MAX_VALUE, Integer.MAX_VALUE};
        int k = 2;

        String calculatedMaximumSum = classUnderTest.findMaximumSumSubArray(input, k);

        assertEquals("4294967294", calculatedMaximumSum);

    }
}
