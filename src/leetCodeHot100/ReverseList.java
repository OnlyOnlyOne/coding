package leetCodeHot100;

import java.util.List;

public class ReverseList {
    public static ListNode reverseList(ListNode head) {
//        头插法
        ListNode result = head;

        if(result ==null || result.next == null) return result;
        ListNode cur1 = result.next;
        ListNode cur2 = result.next;
        result.next = null;
        while (cur2 != null) {
            cur2 = cur2.next;
            cur1.next = result;
            result = cur1;
            cur1 = cur2;

        }

        return result;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode cur = head;
        for (int i = 1; i < 6; i++) {
            ListNode n = new ListNode(i);
            cur.next = n;
            cur = cur.next;
        }

        ListNode get = reverseList(head.next);
        System.out.println("ok");
    }
}
