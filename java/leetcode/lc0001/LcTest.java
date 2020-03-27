package lc0001;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LcTest {
    static Solution solution;

    @BeforeAll
    public static void beforeAll() {
        solution = new Solution();
    }

    @Test
    public void test() {
        test(new int[] { 2, 7, 11, 15 }, 9, new int[] { 0, 1 });
    }

    static void test(int[] nums, int target, int[] expected) {
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }
}