import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int magicalString(int n) {
        //前三位元素提前添加，特殊情况直接处理
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        if (n <= 3) return 1;

        //由于添加了三个元素，下面的1的个数初始为1
        int ans = 1;
        //用作标记该输出1还是2
        boolean isOne = true;
        //从第三位开始，此时指针指向第三位元素
        int front = 2;
        while (list.size() < n) {
            //输出1
            if (isOne) {
                for (int i = 0; i < list.get(front); i++) {
                    list.add(1);
                    ans++;
                    //及时判断
                    if (list.size() == n) break;
                }
                isOne = false;
            }
            //同理
            else {
                for (int i = 0; i < list.get(front); i++) {
                    list.add(2);
                    if (list.size() == n) break;
                }
                isOne = true;
            }
            //指针自增
            front++;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
