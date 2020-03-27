#include <cassert>
#include "lc1342.h"

static Solution solution;

static void test(int x, int expected)
{
    assert(expected == solution.numberOfSteps(x));
}

int main()
{
    test(14, 6);
    test(8, 4);
    test(123, 12);
}