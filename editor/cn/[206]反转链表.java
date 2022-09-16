//给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
//
// 
// 
// 
// 
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4,5]
//输出：[5,4,3,2,1]
// 
//
// 示例 2： 
// 
// 
//输入：head = [1,2]
//输出：[2,1]
// 
//
// 示例 3： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目范围是 [0, 5000] 
// -5000 <= Node.val <= 5000 
// 
//
// 
//
// 进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？ 
//
// Related Topics 递归 链表 👍 2719 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import org.w3c.dom.NodeList;

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
    public ListNode reverseList(ListNode head) {
        //判断链表为空则直接返回head
        if(head == null || head.next == null){
            return head;
        }
        //创建三个指针，前中后
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        //遍历链表
        while(curr != null){
            //当前节点指向前节点
            curr.next = prev;
            //前节点等于当前节点
            prev = curr;
            //当前节点等于后节点
            curr = next;
            //如果下个节点为空，则退出循环
            if(next == null){
                break;
            }
            //否则向下移动一位
            next = next.next;
        }
        //最后一步改变头结点位置
        head = prev;
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
