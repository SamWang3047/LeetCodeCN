import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isFlipedString(String s1, String s2) {
        if(s1.length()==0&&s2.length()==0){
            return true;
        }
        if(s2.length()==0){
            return false;
        }
        String str = s1+s1;
        return str.contains(s2);
    }
}

//leetcode submit region end(Prohibit modification and deletion)
