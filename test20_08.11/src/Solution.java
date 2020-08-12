/**
 * Created with IntelliJ IDEA.
 * Description:链表中倒数第K个节点
 * 常规思路   倒数第k个就是正数第（链表长度-K）个
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
