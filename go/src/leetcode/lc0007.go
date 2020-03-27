package leetcode

func reverse(x int) int {
	negative := x < 0
	if negative {
		x = -x
	}
	value := 0
	for x > 0 {
		value *= 10
		value += x % 10
		x /= 10
	}
	if negative {
		value = -value
	}
	return value
}
