import unittest
from leetcode import lc0013 as lc


class Test(unittest.TestCase):
    def setUp(self):
        self.solution = lc.Solution()

    def test(self):
        self._test('III', 3)
        self._test('IV', 4)
        self._test('IX', 9)
        self._test('LVIII', 58)
        self._test('MCMXCIV', 1994)

    def _test(self, x, expected):
        self.assertEqual(expected, self.solution.romanToInt(x))
