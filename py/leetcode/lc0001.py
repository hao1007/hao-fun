class Solution:
    def twoSum(self, nums, target):
        positions = {}
        for index, num in enumerate(nums):
            position = positions.get(target - num)
            if position is not None:
                return [position, index]
            positions[num] = index
        return []
