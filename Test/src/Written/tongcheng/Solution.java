package Written.tongcheng;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-21
 * Time: 20:54
 **/



  class ListNode {
    int val;
    ListNode next = null;
  }


public class Solution {
    /**
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     */
    public ListNode solution (ListNode head, int m, int n) {
        // write code here
        //判断链表是否为空
        if(head == null) {
            return null;
        }
        ListNode newHead = new ListNode();
        newHead.next = head;


        ListNode prev = newHead;
        for (int i = 0; i < m-1; i++) {
            prev = prev.next;
        }
        ListNode cur = prev.next;
        for (int i = m; i < n; i++) {
            ListNode curNext = cur.next;
            cur.next = curNext.next;
            curNext.next = prev.next;
            prev.next = curNext;
        }
        return newHead.next;

    }
}
