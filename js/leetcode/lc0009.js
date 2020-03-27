var isPalindrome = function (x) {
    if (x < 0) return false;
    let y = 0;
    let v = x;
    while (v > 0) {
        y *= 10;
        y += v % 10;
        v = Math.floor(v / 10);
    }
    return x == y;
};

module.exports = {
    isPalindrome: isPalindrome
}