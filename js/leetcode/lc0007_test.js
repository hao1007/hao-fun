let lc = require('./lc0007');

let test = function (x, expected) {
    if (expected != lc.reverse(x)) {
        throw Error()
    }
}

test(123, 321);
test(-123, -321);
test(120, 21);