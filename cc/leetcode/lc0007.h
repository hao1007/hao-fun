class Solution
{
public:
    int reverse(int x)
    {
        if (x == -0x80000000)
        {
            return 0;
        }
        bool negative{x < 0};
        if (negative)
        {
            x = -x;
        }
        long value{0};
        while (x)
        {
            value *= 10;
            value += x % 10;
            x /= 10;
        }
        if (negative)
        {
            value = -value;
        }
        return (value > 0x7fffffffL || value < -0x80000000L) ? 0 : value;
    }
};