import unittest
import leetcode.lc1342 as lc


class Test(unittest.TestCase):
    def setUp(self):
        self.solution = lc.Solution()

    def test(self):
        self._test(14, 6)
        self._test(8, 4)
        self._test(123, 12)

    def _test(self, num, expected):
        self.assertEqual(expected, self.solution.numberOfSteps(num))
