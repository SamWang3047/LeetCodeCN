
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
    public ListNode deleteNode(ListNode head, int val) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode dummy = pre , p = head;
        while(p != null){
            if(p.val == val){
                pre.next = pre.next.next;
                break;
            }
            p = p.next;
            pre = pre.next;
        }
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
