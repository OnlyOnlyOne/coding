package leetCodeHot100.list;

public class Lc24两两交换链表中的节点 {
    public ListNode swapPairs(ListNode head) {
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode cur = first;
        while (cur.next != null && cur.next.next != null) {
            ListNode temp1 = cur.next;
            ListNode temp2 = cur.next.next.next;
            cur.next = cur.next.next;
            cur.next.next = temp1;
            temp1.next = temp2;
            cur = cur.next.next;
        }
        return first.next;
    }
}
