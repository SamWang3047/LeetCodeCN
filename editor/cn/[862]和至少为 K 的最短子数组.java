
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length, ans = n + 1;
        var s = new long[n + 1];
        for (var i = 0; i < n; ++i)
            s[i + 1] = s[i] + nums[i]; // 计算前缀和
        var q = new ArrayDeque<Integer>();
        for (var i = 0; i <= n; ++i) {
            var curS = s[i];
            while (!q.isEmpty() && curS - s[q.peekFirst()] >= k)
                ans = Math.min(ans, i - q.pollFirst()); // 优化一
            while (!q.isEmpty() && s[q.peekLast()] >= curS)
                q.pollLast(); // 优化二
            q.addLast(i);
        }
        return ans > n ? -1 : ans;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
