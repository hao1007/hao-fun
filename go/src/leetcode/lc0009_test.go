package leetcode

import "testing"

func Test_isPalindrome(t *testing.T) {
	test0009(121, true, t)
	test0009(-121, false, t)
	test0009(10, false, t)
}

func test0009(x int, expected bool, t *testing.T) {
	if expected != isPalindrome(x) {
		t.Error()
	}
}
