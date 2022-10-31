
//leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        for (List<String> list : items) {
           switch (ruleKey) {
               case "type": if (list.get(0).equals(ruleValue)) ans++;
                   break;
               case "color": if (list.get(1).equals(ruleValue)) ans++;
                   break;
               case "name": if (list.get(2).equals(ruleValue)) ans++;
                   break;
           }
        }
        return ans;
    }
}
//class Solution {
//    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//        int index="color".equals(ruleKey) ? 1 : "name".equals(ruleKey) ? 2 : 0;
//        int count=0;
//        for(List<String> list:items){
//            if(list.get(index).equals(ruleValue)){
//                count++;
//            }
//        }
//        return count;
//    }
//}

//leetcode submit region end(Prohibit modification and deletion)
