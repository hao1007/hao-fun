var reverse = function (x) {
    let negative = x < 0;
    if (negative) x = -x;
    let value = 0;
    while (x) {
        value *= 10;
        value += x % 10;
        x = Math.floor(x / 10);
    }
    if (negative) value = -value;
    return (value > 0x7fffffff || value < -0x80000000) ? 0 : value;
};

module.exports = {
    reverse: reverse
}