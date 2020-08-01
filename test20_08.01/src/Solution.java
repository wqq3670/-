/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-08-01
 * Time: 22:59
 **/
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode newHead = null;//反转后链表的头节点
        ListNode prev = null;//当前要反转链表的前一个结点
        ListNode cur = head;//当前要反转的链表

        while(cur != null) {
            ListNode curNext = cur.next;//当前要反转链表的下一个节点
            if(curNext == null) {//代表我的cur就是原来链表的最后一个节点
                newHead = cur;
            }
            cur.next = prev;//把前一个节点放到cur(要反转这个节点)的next域
            prev = cur;
            cur = curNext;
        }
        return newHead;

    }
}
