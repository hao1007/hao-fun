var numberOfSteps = function (num) {
    if (num <= 0) return 0;
    let steps = 0;
    do {
        steps += (num & 1) == 0 ? 1 : 2;
        num >>= 1;
    } while (num);
    return --steps;
};

module.exports = {
    numberOfSteps: numberOfSteps
}