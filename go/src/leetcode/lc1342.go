package leetcode

func numberOfSteps(num int) int {
	if num <= 0 {
		return 0
	}
	steps := 0
	for num > 0 {
		steps++
		if (num & 1) == 1 {
			steps++
		}
		num >>= 1
	}
	return steps - 1
}
