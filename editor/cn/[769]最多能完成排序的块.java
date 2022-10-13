
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length, ans = 0;
        for (int i = 0, j = 0, min = n, max = -1; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
            if (j == min && i == max) {
                ans++; j = i + 1; min = n; max = -1;
            }
        }
        return ans;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
