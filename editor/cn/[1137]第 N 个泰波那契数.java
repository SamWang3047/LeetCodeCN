
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int tribonacci(int n) {
        if(n < 2){
            return n;
        }
        int p = 0, q = 0, r = 1, g = 1;

        for (int i = 3; i <= n; i++) {
            p = q;
            q = r;
            r = g;
            g = p + q + r;
        }

        return g;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
