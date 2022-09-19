
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] idxs = new int[26];
        Arrays.fill(idxs, 310);
        int n = s.length(), ans = -1;
        for (int i = 0; i < n; i++) {
            int u = s.charAt(i) - 'a';
            idxs[u] = Math.min(idxs[u], i);
            ans = Math.max(ans, i - idxs[u] - 1);
        }
        return ans;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
