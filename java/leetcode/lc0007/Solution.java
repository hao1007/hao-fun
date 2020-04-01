package lc0007;

class Solution {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        boolean negative = x < 0;
        if (negative) {
            x = -x;
        }
        long value = 0;
        while (x > 0) {
            value *= 10;
            value += x % 10;
            x /= 10;
        }
        if (negative) {
            value = -value;
        }
        return (value > Integer.MAX_VALUE || value < Integer.MIN_VALUE) ? 0 : (int) value;
    }
}