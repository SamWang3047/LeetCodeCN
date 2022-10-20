
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int kthGrammar(int n, int k) {
//        String str = "0";
//        for (int i = 0; i < n - 1; i++) {
//            str = str.replace('0','a');
//            str = str.replace('1', 'b');
//            str = str.replace("a", "01");
//            str = str.replace("b", "10");
//        }
//
//        return str.charAt(k - 1) - '0';
        if (k == 1) return 0; // 向上遍历到了第1行，则返回结果
        if (k > (1 << n - 2)) return 1 ^ kthGrammar(n - 1, k - (1 << n - 2)); // 如果在“蓝色区间”，则与上一行值相反
        else return kthGrammar(n - 1, k); // 如果在“黄色区间”，则与上一行值相同
    }
}


//leetcode submit region end(Prohibit modification and deletion)
