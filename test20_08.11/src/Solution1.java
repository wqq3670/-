/**
 * Created with IntelliJ IDEA.
 * Description:链表中倒数第K个节点
 * 快慢指针优化，只遍历一遍单链表
 * User: dell
 * Date: 2020-08-12
 * Time: 1:10
 **/
public class Solution1 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(k<=0 || head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;

        //fast先走k-步
        while(k-1 > 0) {
            if(fast.next != null) {//防止空指针异常，也就是 K > size()的情况
                fast = fast.next;
                k--;
            }
        }

        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
