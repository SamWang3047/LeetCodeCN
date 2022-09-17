<p>给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。</p>

<p>返回删除后的链表的头节点。</p>

<p><strong>注意：</strong>此题对比原题有改动</p>

<p><strong>示例 1:</strong></p>

<pre><strong>输入:</strong> head = [4,5,1,9], val = 5
<strong>输出:</strong> [4,1,9]
<strong>解释: </strong>给定你链表中值为&nbsp;5&nbsp;的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -&gt; 1 -&gt; 9.
</pre>

<p><strong>示例 2:</strong></p>

<pre><strong>输入:</strong> head = [4,5,1,9], val = 1
<strong>输出:</strong> [4,5,9]
<strong>解释: </strong>给定你链表中值为&nbsp;1&nbsp;的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -&gt; 5 -&gt; 9.
</pre>

<p>&nbsp;</p>

<p><strong>说明：</strong></p>

<ul> 
 <li>题目保证链表中节点的值互不相同</li> 
 <li>若使用 C 或 C++ 语言，你不需要 <code>free</code> 或 <code>delete</code> 被删除的节点</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>链表</details><br>

<div>👍 254, 👎 0</div>

<div id="labuladong"><hr>

**通知：[数据结构精品课](https://aep.h5.xeknow.com/s/1XJHEO) 已更新到 V1.9，第 11 期刷题打卡挑战即将开始，[点这里报名](https://mp.weixin.qq.com/s/eUG2OOzY3k_ZTz-CFvtv5Q)。**

<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

这道题常规的思路是通过操作指针来删除值为 `val` 的节点，不过处理起来可能稍微有点麻烦，我们可以使用 [链表双指针技巧汇总](https://labuladong.github.io/article/fname.html?fname=链表技巧) 中讲到的分解链表的思路来解决这道题（你可以先去做下 [86. 分隔链表](/problems/partition-list)）。

你可以认为这道题是把原链表分解成「值为 `val`」和「值不为 `val`」的两条链表，就可以复用 86 题的思路了。

**标签：[链表双指针](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2120596033251475465)**

## 解法代码

```java
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        // 存放删除 val 的链表
        ListNode dummy = new ListNode(-1);
        // q 指针负责生成结果链表
        ListNode q = dummy;
        // p 负责遍历原链表
        ListNode p = head;
        while (p != null) {
            if (p.val != val) {
                // 把值不为 val 的节点接到结果链表上
                q.next = p;
                q = q.next;
            }
            // 断开原链表中的每个节点的 next 指针
            ListNode temp = p.next;
            p.next = null;
            p = temp;
        }

        return dummy.next;
    }
}
```

</details>
</div>



