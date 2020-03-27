#include "lc0001.h"

using namespace std;

static Solution solution;

static void test(vector<int> nums, int target, vector<int> expected)
{
    assert(expected == solution.twoSum(nums, target));
}

int main()
{
    test({2, 7, 11, 15}, 9, {0, 1});
}