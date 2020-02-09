/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 *
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/description/
 *
 * algorithms
 * Easy (59.45%)
 * Likes:    842
 * Dislikes: 0
 * Total Accepted:    177.1K
 * Total Submissions: 297.7K
 * Testcase Example:  '[1,2,4]\n[1,3,4]'
 *
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * 
 * 示例：
 * 
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * 
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(-1);
        ListNode tempNode = node;
        while (l1 != null && l2 != null) {            
            if (l1.val > l2.val) {
                tempNode.next = new ListNode(l2.val);
                l2 = l2.next; 
            }else{
                tempNode.next = new ListNode(l1.val);  
                l1 = l1.next;             
            }
            tempNode = tempNode.next;                           
        }
        if (l1 != null) {
            tempNode.next = l1;
        }else{
            tempNode.next = l2;
        }
        return node.next;
    }
}
// @lc code=end

