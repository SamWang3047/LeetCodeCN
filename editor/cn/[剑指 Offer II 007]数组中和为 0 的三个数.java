
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < n - 2; i ++)
        {
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            int ll = i + 1, rr = n - 1;
            int target = - nums[i];
            while(ll < rr)
            {
                int sum_ = nums[ll] + nums[rr];
                if(sum_ == target)
                {
                    ans.add(Arrays.asList(nums[i], nums[ll], nums[rr]));    //**********
                    while(ll < rr && nums[ll] == nums[++ ll]);
                    while(ll < rr && nums[rr] == nums[-- rr]);
                }
                else if(sum_ > target)
                    rr --;
                else
                    ll ++;
            }
        }
        return ans;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
