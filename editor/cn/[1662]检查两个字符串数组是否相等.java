
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            stringBuilder1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            stringBuilder2.append(word2[i]);
        }

        return stringBuilder1.toString().equals(stringBuilder2.toString());
    }
}
//leetcode submit region end(Prohibit modification and deletion)
