package lc0009;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        test(121, true);
        test(-121, false);
        test(10, false);
    }

    static void test(int x, boolean expected) {
        assertEquals(expected, solution.isPalindrome(x));
    }
}