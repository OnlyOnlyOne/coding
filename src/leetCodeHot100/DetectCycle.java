package leetCodeHot100;

public class DetectCycle {
    public ListNode hasCycle(ListNode head) {
//利用双指针追逐问题，一个快指针，一个慢指针,弗洛伊德
        if (head == null) return null;

        ListNode moveFast = head;
        ListNode moveSlow = head;

        Boolean isLoop = false;

        while (moveFast.next != null && moveFast.next.next != null) {
            moveFast = moveFast.next.next;
            moveSlow = moveSlow.next;
            if (moveSlow == moveFast) {
                isLoop = true;
            }
        }
        if (isLoop==false) {
            return null;
        }else {
            moveSlow = head;
            while (moveSlow != moveFast) {
                moveSlow = moveSlow.next;
                moveFast = moveFast.next;
            }
        }

        return moveSlow;


    }
}
