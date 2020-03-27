let lc = require('./lc0009');

let test = function (x, expected) {
    if (expected != lc.isPalindrome(x)) {
        throw Error()
    }
}

test(121, true);
test(-121, false);
test(10, false);