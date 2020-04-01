class Solution:
    def reverse(self, x):
        negative = x < 0
        if negative:
            x = -x
        value = 0
        while x:
            value *= 10
            value += x % 10
            x //= 10
        if negative:
            value = -value
        return 0 if (value > 0x7fffffff or value < -0x80000000) else value
