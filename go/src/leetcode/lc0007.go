package leetcode

func reverse(x int) int {
	if x <= -0x80000000 {
		return 0
	}
	negative := x < 0
	if negative {
		x = -x
	}
	var value int64 = 0
	for x > 0 {
		value *= 10
		value += int64(x % 10)
		x /= 10
	}
	if negative {
		value = -value
	}
	if value > 0x7fffffff || value < -0x80000000 {
		return 0
	}
	return int(value)
}
