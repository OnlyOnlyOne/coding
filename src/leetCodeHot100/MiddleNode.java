package leetCodeHot100;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        //使用快慢指针
        ListNode slow = head,fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
