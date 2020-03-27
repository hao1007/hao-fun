class Solution
{
public:
    int reverse(int x)
    {
        bool negative{x < 0};
        if (negative)
        {
            x = -x;
        }
        int value{0};
        while (x)
        {
            value *= 10;
            value += x % 10;
            x /= 10;
        }
        return negative ? -value : value;
    }
};