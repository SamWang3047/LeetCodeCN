
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findClosestNumber(int[] nums) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (min > Math.abs(nums[i])) {
                min = Math.abs(nums[i]);
                ans = nums[i];
            } else if (min == Math.abs(nums[i])) {
                if (nums[i] > 0) ans = nums[i];
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
