import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) return new int[]{};
        if (shorter == longer) return new int[]{k * shorter};
        int[] res = new int[k + 1];
        for (int i = 0; i < k + 1; i++) {
            res[i] = i * longer + (k - i) * shorter;
        }
        return res;


    }
}
//leetcode submit region end(Prohibit modification and deletion)
