package leetCodeHot100;

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        //利用双指针追逐问题，一个快指针，一个慢指针,弗洛伊德
        if(head==null) return false;

        ListNode moveFast = head;
        ListNode moveSlow = head;

        while (moveFast.next != null && moveFast.next.next != null) {
            moveFast = moveFast.next.next;
            moveSlow = moveSlow.next;
            if (moveSlow == moveFast) {
                return true;
            }
        }
        return false;
    }
}
