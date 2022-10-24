
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int partitionDisjoint(int[] nums) {
        //定义cut为分割点处
        int cut = 0;
        int max = Integer.MIN_VALUE;
        for (; cut < nums.length; cut++) {
            //维护左边最大值
            if (max < nums[cut]) {
                max = nums[cut];
            }
            for (int j = cut + 1; j < nums.length; j++) {
                //有元素比max大，跳出循环
                if (nums[j] < max) {
                    break;
                }
                //遍历到最后没问题，直接return
                if (j == nums.length - 1) {
                    return cut + 1;
                }
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
