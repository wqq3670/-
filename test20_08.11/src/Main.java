/**
 * Created with IntelliJ IDEA.
 * Description:链表中倒数第K个节点
 * 定义快慢指针。快指针先走k-1步
 * 快慢指针再一人一步走，当快指针到达最后一个节点时，
 * 慢指针指向倒数第K个节点
 * User: dell
 * Date: 2020-08-12
 * Time: 1:07
 **/
public class Main {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k <= 0) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode cur = head;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        if(k > count) {
            return null;
        }
        for(int i = 0; i < k-1; i++) {
            fast = fast.next;
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
