import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            map.put(c1, map.getOrDefault(c1, 0) + 1);
            char c2 = s2.charAt(i);
            map.put(c2, map.getOrDefault(c2, 0) - 1);
        }

        for (Integer cnt : map.values()) {
            if (cnt != 0) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
