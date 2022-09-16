//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
//
// Related Topics 字符串 👍 2438 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        //ans初始为字符串数组中第一个元素
        String ans = strs[0];
        //两次遍历，第一次是所有strs中的字符串
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            //第二次是字符串中的字符
            //确定循环最小的长度避免空指针
            for (; j < strs[i].length() && j < ans.length(); j++) {
                //如果遇到不相等的元素，直接break
                if(strs[i].charAt(j) != ans.charAt(j)){
                    break;
                }
            }
            //substring 方法左开右闭
            ans = ans.substring(0, j);
            //途中遇到strs中包含空的可以直接跳出返回空
            if(ans.equals("")){
                return ans;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
