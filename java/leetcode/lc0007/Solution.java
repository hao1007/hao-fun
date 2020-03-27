package lc0007;

class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;
        if (negative) {
            x = -x;
        }
        int value = 0;
        while (x > 0) {
            value *= 10;
            value += x % 10;
            x /= 10;
        }
        return negative ? -value : value;
    }
}