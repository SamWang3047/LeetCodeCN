
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer ans = new StringBuffer("");
        int len = Math.min(word1.length(),word2.length());
        int i = 0;
        for (; i < len; i++) {
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
        }

        if (word1.length() > word2.length()) {
            for (; i < word1.length(); i++) {
                ans.append(word1.charAt(i));
            }
        } else {
            for (; i < word2.length(); i++) {
                ans.append(word2.charAt(i));
            }
        }
        return ans.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
