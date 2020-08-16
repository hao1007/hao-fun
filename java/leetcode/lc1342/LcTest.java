package lc1342;

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
        test(14, 6);
        test(8, 4);
        test(123, 12);
    }

    static void test(int num, int expected) {
        assertEquals(expected, solution.numberOfSteps(num));
    }
}