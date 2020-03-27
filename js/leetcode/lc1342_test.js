let lc = require('./lc1342');

let test = function (x, expected) {
    if (expected != lc.numberOfSteps(x)) {
        throw Error()
    }
}

test(14, 6);
test(8, 4);
test(123, 12);