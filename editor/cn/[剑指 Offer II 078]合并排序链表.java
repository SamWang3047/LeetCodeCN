
//leetcode submit region begin(Prohibit modification and deletion)

import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        // 虚拟头结点
        ListNode dummy = new ListNode(-1), p = dummy;
        // 优先级队列，最小堆
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(
                lists.length, (a, b)->(a.val - b.val));
        // 将 k 个链表的头结点加入最小堆
        for (ListNode head : lists) {
            if(head != null){
                pq.add(head);
            }
        }
        while(!pq.isEmpty()){
            // 获取最小节点，接到结果链表中
            ListNode temp = pq.poll();
            p.next = temp;
            if (temp.next != null){
                pq.add(temp.next);
            }
            // p 指针不断前进
            p = p.next;
        }
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
