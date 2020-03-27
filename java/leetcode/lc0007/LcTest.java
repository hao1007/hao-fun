package lc0007;

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
        test(123, 321);
        test(-123, -321);
        test(120, 21);
    }

    static void test(int x, int expected) {
        assertEquals(expected, solution.reverse(x));
    }
}