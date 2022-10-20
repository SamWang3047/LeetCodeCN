import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stu = new LinkedList<>();
        for (int i : students) {
            stu.add(i);
        }
        Deque<Integer> sw = new ArrayDeque<>();
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            sw.push(sandwiches[i]);
        }
        int cnt = 0;
        while(!stu.isEmpty()) {
            if (stu.peek() == sw.peek()){
                stu.poll();
                sw.pop();
                cnt = 0;
            }
            else {
                stu.add(stu.poll());
                cnt++;
            }
            if (cnt == students.length) {
                break;
            }
        }
        return stu.size();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
