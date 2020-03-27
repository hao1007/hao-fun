class Solution
{
public:
    bool isPalindrome(int x)
    {
        if (x < 0)
        {
            return false;
        }
        int y{0};
        int v{x};
        while (v > 0)
        {
            y *= 10;
            y += v % 10;
            v /= 10;
        }
        return x == y;
    }
};