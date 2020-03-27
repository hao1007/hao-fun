import unittest
import leetcode.lc0007 as lc


class Test(unittest.TestCase):
    def setUp(self):
        self.solution = lc.Solution()

    def test(self):
        self._test(123, 321)
        self._test(-123, -321)
        self._test(120, 21)

    def _test(self, x, expected):
        self.assertEqual(expected, self.solution.reverse(x))
