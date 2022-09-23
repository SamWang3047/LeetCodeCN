
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length){
            if (nums[fast] != 0){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        while (slow < nums.length){
            nums[slow] = 0;
            slow++;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
