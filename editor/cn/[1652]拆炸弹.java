
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        if (k == 0) return result;
        int sum = 0, count = Math.abs(k), head = k > 0 ? 0 : code.length - 1, tail = k > 0 ? 1 : 0;
        // 计算第一个窗口的sum值
        while (count-- > 0)
            sum += k > 0 ? code[head = (head + 1) % code.length] : code[tail = (tail - 1 + code.length) % code.length];
        // 移动窗口并计算sum值
        result[0] = sum;
        for (int i = 1; i < code.length; i++) {
            result[i] = sum + code[++head % code.length] - code[tail];
            sum = result[i];
            tail = ++tail % code.length;;
        }
        return result;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
