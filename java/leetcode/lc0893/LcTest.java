package lc0893;

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
        test(new String[] { "abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx" }, 3);
        test(new String[] { "abc", "acb", "bac", "bca", "cab", "cba" }, 3);
    }

    static void test(String[] A, int expected) {
        assertEquals(expected, solution.numSpecialEquivGroups(A));
    }
}