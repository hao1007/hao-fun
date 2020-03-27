#include <vector>
#include <unordered_map>

using namespace std;

class Solution
{
public:
    vector<int> twoSum(vector<int> &nums, int target)
    {
        unordered_map<int, int> positions;
        for (int index = 0; index < nums.size(); index++)
        {
            auto position = positions.find(target - nums[index]);
            if (position != positions.end())
            {
                return {position->second, index};
            }
            positions.emplace(nums[index], index);
        }
        return {};
    }
};