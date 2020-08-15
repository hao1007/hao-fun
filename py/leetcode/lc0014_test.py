import unittest
from leetcode import lc0014 as lc


class Test(unittest.TestCase):
    def setUp(self):
        self.solution = lc.Solution()

    def test(self):
        self._test(['flower', 'flow', 'flight'], 'fl')
        self._test(['dog', 'racecar', 'car'], '')

    def _test(self, x, expected):
        self.assertEqual(expected, self.solution.longestCommonPrefix(x))
