/**
 * Created with IntelliJ IDEA.
 * Description:合并两个有序链表
 * User: dell
 * Date: 2020-08-14
 * Time: 22:38
 **/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        //定义出新链表的头节点
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;//tmp永远代表新排好链表的最后一个节点
        //当两个链表不为空时
        while(list1!=null && list2!=null) {
            //判断两个链表当前走到节点的大小
            if(list1.val < list2.val) {
                tmp.next = list1;
                tmp = tmp.next;
                list1 = list1.next;
            }else {
                tmp.next = list2;
                tmp = tmp.next;
                list2 = list2.next;
            }
        }
        //出了循环后，哪个链表不为空，将哪个链表跟在新链表的尾节点后面即可
        if(list1 != null) {
            tmp.next = list1;
        }
        if(list2 != null) {
            tmp.next = list2;
        }
        return newHead.next;
    }
}
