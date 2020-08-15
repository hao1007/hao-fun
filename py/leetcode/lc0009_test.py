import unittest
from leetcode import lc0009 as lc


class Test(unittest.TestCase):
    def setUp(self):
        self.solution = lc.Solution()

    def test(self):
        self._test(121, True)
        self._test(-121, False)
        self._test(10, False)

    def _test(self, x, expected):
        self.assertEqual(expected, self.solution.isPalindrome(x))
