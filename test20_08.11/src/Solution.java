/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-08-11
 * Time: 23:41
 **/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        cur = head;
        if(k > count) {
            return null;
        }
        for (int i = 0; i < count - k; i++) {
            cur = cur.next;
        }
        return cur;
    }
}
