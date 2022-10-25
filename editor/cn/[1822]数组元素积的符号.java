
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int arraySign(int[] nums) {
        long ans = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                ans *= -1;
            }
            if (nums[i] == 0) return 0;
        }

        if (ans > 0) return 1;
        else return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
