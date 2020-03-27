var twoSum = function (nums, target) {
    let positions = {};
    for (let index = 0; index < nums.length; index++) {
        let position = positions[target - nums[index]];
        if (position != undefined) return [position, index];
        positions[nums[index]] = index;
    }
    return [];
};

module.exports = {
    twoSum: twoSum
}