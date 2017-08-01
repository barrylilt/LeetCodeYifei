/*82. Remove Duplicates from Sorted List II  (Medium
 * 
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 */
package com.code;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveDuplicateFromSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
    
    if (head.next != null && head.val == head.next.val) {
        while (head.next != null && head.val == head.next.val) {
            head = head.next;
        }
        return deleteDuplicates(head.next);
    } 
    else {
        head.next = deleteDuplicates(head.next);
    }
    return head;
    }
}
