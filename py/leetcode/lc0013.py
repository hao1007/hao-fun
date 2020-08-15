class Solution:
    def romanToInt(self, s):
        symbols = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }
        length = len(s)
        if length == 0:
            return 0
        if length == 1:
            return symbols[s]
        value = 0
        for index in range(1, length):
            previous = symbols[s[index - 1]]
            current = symbols[s[index]]
            if previous >= current:
                value += previous
            else:
                value -= previous
        value += current
        return value
