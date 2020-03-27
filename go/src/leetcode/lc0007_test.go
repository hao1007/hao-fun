package leetcode

import "testing"

func Test_reverse(t *testing.T) {
	test0007(123, 321, t)
	test0007(-123, -321, t)
	test0007(120, 21, t)
}

func test0007(x int, expected int, t *testing.T) {
	if expected != reverse(x) {
		t.Error()
	}
}
