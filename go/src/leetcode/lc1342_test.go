package leetcode

import "testing"

func Test_numberOfSteps(t *testing.T) {
	test1342(14, 6, t)
	test1342(8, 4, t)
	test1342(123, 12, t)
}

func test1342(num int, expected int, t *testing.T) {
	if expected != numberOfSteps(num) {
		t.Error()
	}
}
