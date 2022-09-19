
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int kthToLast(ListNode head, int k) {
        if(head == null || head.next == null) return head.val;

        ListNode p2 = head, p1 = head;
        for (int i = 0; i < k; i++) {
            p1 = p1.next;
        }
        while(p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2.val;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
