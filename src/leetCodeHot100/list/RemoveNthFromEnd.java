package leetCodeHot100.list;


import java.util.List;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //删除链表的倒数第N个结点
        /*
        * 思路：先让第一个指针指向正数的第N
        * */
//        ListNode cur = head;
//        for (int i = 1; i < n; i++) {
//            cur = cur.next;
//        }
//        ListNode deleteNode = head;
//        int i = 0;
//        while (cur != null) {
//            if(i>=2) deleteNode = deleteNode.next;
//            cur = cur.next;
//            i++;
//        }
//        deleteNode.next = deleteNode.next.next;
//        return head;
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode start = pre;
        ListNode end = head;
        int i = n;
        while (i != 0) {
            start = start.next;
            i--;
        }

        while (start.next != null) {
            start = start.next;
            end = end.next;
        }

        end.next = end.next.next;
        return pre.next;
















    }
}
