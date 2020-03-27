#include <cassert>
#include "lc0009.h"

static Solution solution;

static void test(int x, bool expected)
{
    assert(expected == solution.isPalindrome(x));
}

int main()
{
    test(121, true);
    test(-121, false);
    test(10, false);
}