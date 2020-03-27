package leetcode

import "testing"

func Test_twoSum(t *testing.T) {
	test0001([]int{2, 7, 11, 15}, 9, []int{0, 1}, t)
}

func test0001(nums []int, target int, expected []int, t *testing.T) {
	result := twoSum(nums, target)
	if len(result) != len(expected) {
		t.Error()
	}
	for i, v := range result {
		if v != expected[i] {
			t.Error()
		}
	}
}
