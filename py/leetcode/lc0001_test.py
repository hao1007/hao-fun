import unittest
import leetcode.lc0001 as lc


class Test(unittest.TestCase):
    def setUp(self):
        self.solution = lc.Solution()

    def test(self):
        self._test([2, 7, 11, 15], 9, [0, 1])

    def _test(self, nums, target, expected):
        self.assertEqual(expected, self.solution.twoSum(nums, target))
