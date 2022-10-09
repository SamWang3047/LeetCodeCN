import java.util.ArrayDeque;
import java.util.Deque;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int scoreOfParentheses(String s) {
        Deque<Integer> d = new ArrayDeque<>();
        d.addLast(0);
        for (char c : s.toCharArray()) {
            if (c == '(') {
                d.addLast(0);
            }
            else {
                int cur = d.pollLast();
                d.addLast(d.pollLast() + Math.max(cur * 2, 1));
            }
        }
        return d.peekLast();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
