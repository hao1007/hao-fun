package lc0001;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> positions = new HashMap<>(nums.length);
        for (int index = 0; index < nums.length; index++) {
            Integer position = positions.get(target - nums[index]);
            if (position != null) {
                return new int[] { position, index };
            }
            positions.put(nums[index], index);
        }
        return new int[0];
    }
}