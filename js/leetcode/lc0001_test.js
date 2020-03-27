let lc = require('./lc0001');

let isEqual = function (expected, value) {
    if (expected.length != value.length) return false;
    for (let index = 0; index < expected.length; index++) {
        if (expected[index] != value[index]) return false;
    }
    return true;
}

let test = function (nums, target, expected) {
    if (!isEqual(expected, lc.twoSum(nums, target))) {
        throw Error()
    }
}

test([2, 7, 11, 15], 9, [0, 1]);