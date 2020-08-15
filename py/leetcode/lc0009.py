class Solution:
    def isPalindrome(self, x):
        if x < 0:
            return False
        y = 0
        v = x
        while v:
            y *= 10
            y += v % 10
            v //= 10
        return x == y
