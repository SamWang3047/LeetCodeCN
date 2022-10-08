
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxAscendingSum(int[] nums) {
        int ans = nums[0];
        //使用temp记录当前子升序数组的元素和
        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            //判断大小
            if (nums[i] < nums[i + 1]) {
                temp += nums[i + 1];
                if (temp > ans) {
                    ans = temp;
                }
                //给temp赋值
            } else {
                temp = nums[i + 1];
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
