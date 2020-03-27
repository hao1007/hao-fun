class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        y = 0
        v = x
        while v > 0:
            y *= 10
            y += v % 10
            v //= 10
        return x == y
