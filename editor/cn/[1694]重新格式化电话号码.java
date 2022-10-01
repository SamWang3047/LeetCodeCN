import java.util.ArrayList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reformatNumber(String number) {
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < number.length(); ++i) {
            char ch = number.charAt(i);
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }

        int n = digits.length();
        int point = 0;
        StringBuilder ans = new StringBuilder();
        while (n > 0) {
            if (n > 4) {
                ans.append(digits.substring(point, point + 3) + "-");
                point += 3;
                n -= 3;
            } else {
                if (n == 4) {
                    ans.append(digits.substring(point, point + 2) + "-" + digits.substring(point + 2, point + 4));
                } else {
                    ans.append(digits.substring(point, point + n));
                }
                break;
            }
        }
        return ans.toString();
    }
}

//leetcode submit region end(Prohibit modification and deletion)
