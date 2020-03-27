package leetcode

func twoSum(nums []int, target int) []int {
	positions := make(map[int]int)
	for index, num := range nums {
		position, ok := positions[target-num]
		if ok {
			return []int{position, index}
		}
		positions[num] = index
	}
	return []int{}
}
