var reverse = function (x) {
    let negative = x < 0;
    if (negative) x = -x;
    let value = 0;
    while (x > 0) {
        value *= 10;
        value += x % 10;
        x = Math.floor(x / 10);
    }
    return negative ? -value : value;
};

module.exports = {
    reverse: reverse
}