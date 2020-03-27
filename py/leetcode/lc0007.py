class Solution:
    def reverse(self, x):
        negative = x < 0
        if negative:
            x = -x
        value = 0
        while x > 0:
            value *= 10
            value += x % 10
            x //= 10
        return -value if negative else value
