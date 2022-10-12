
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int a = -1, b = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                continue;
            }
            //第一次找到不同的位置
            if (a == -1) {
                a = i;
            }
            //第二次找到不同的位置
            else if (b == -1) {
                b = i;
            }
            //第三次找到不同的位置，说明一次交换不可以
            else return false;
        }
        if (a == -1 && b == -1) return true;
        if (a == -1 || b == -1) return false;
        return s1.charAt(a) == s2.charAt(b) && s1.charAt(b) == s2.charAt(a);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
