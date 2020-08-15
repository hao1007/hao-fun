class Solution:
    def longestCommonPrefix(self, strs):
        if len(strs) == 0:
            return ''
        index = 0
        while self.common(index, strs):
            index += 1
        return strs[0][0:index]

    def common(self, index, strs):
        v = ''
        for s in strs:
            if index >= len(s):
                return False
            c = s[index]
            if v == '':
                v = c
            elif v != c:
                return False
        return True
