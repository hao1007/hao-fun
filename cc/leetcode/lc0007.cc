#include <cassert>
#include "lc0007.h"

static Solution solution;

static void test(int x, int expected)
{
    assert(expected == solution.reverse(x));
}

int main()
{
    test(123, 321);
    test(-123, -321);
    test(120, 21);
}