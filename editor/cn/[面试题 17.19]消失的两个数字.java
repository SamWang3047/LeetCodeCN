//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] missingTwo(int[] nums) {
        int[] ans = new int[2];
        int temp = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 1; i < nums.length + 3; i++) {
            if (!map.containsKey(i)){
                ans[temp] = i;
                temp++;
                if(temp == 2) break;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
