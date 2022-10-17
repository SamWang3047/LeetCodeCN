
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();

        int left = 0, ans = 0;
        for (int right = 0; right < n; ++right) {
            cnt.put(fruits[right], cnt.getOrDefault(fruits[right], 0) + 1);
            while (cnt.size() > 2) {
                cnt.put(fruits[left], cnt.get(fruits[left]) - 1);
                if (cnt.get(fruits[left]) == 0) {
                    cnt.remove(fruits[left]);
                }
                ++left;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
