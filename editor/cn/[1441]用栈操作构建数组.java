import java.util.ArrayList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> buildArray(int[] target, int n) {
        String push = "Push", pop = "Pop";
        int first = target[0];
        if (target.length == 0) return null;
        List<String> list = new ArrayList<>();

        for (int i = 1, j = 0; i <= n && j < target.length; i++) {
           list.add(push);
           if (target[j] != i) {
               list.add(pop);
           }
           else {
               j++;
           }
        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
