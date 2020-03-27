class Solution:
    def numberOfSteps(self, num):
        if num <= 0:
            return 0
        steps = 0
        while num:
            steps += 1 if (num & 1) == 0 else 2
            num >>= 1
        return steps - 1
