/**
 * Created with IntelliJ IDEA.
 * Description:输入两个递增排序的链表，
 * 合并这两个链表并使新链表中的节点仍然是递增排序的。
 * User: dell
 * Date: 2020-07-11
 * Time: 23:46
 **/

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
 }
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;

        while(l1!=null && l2!=null) {
            if(l1.val < l2.val) {
                tmp.next = l1;
                l1 = l1.next;
                tmp = tmp.next;
            }else {
                tmp.next = l2;
                l2 = l2.next;
                tmp = tmp.next;
            }
        }

        if(l1 != null) {
            tmp.next  = l1;
        }
        if(l2 != null) {
            tmp.next = l2;
        }

        return newHead.next;

    }
}
