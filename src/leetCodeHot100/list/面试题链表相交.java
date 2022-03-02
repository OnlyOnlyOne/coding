package leetCodeHot100.list;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class 面试题链表相交 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //先得到两个链表的长度
        if(headA==null||headB == null) return null;
        int lengthA = 0;
        int lengthB = 0;

        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != null) {
            lengthA++;
            curA = curA.next;
        }
        while (curB != null) {
            lengthB++;
            curB = curB.next;
        }
        curA = headA;
        curB = headB;
        //比较两个字符串
        if (lengthA > lengthB) {
            int nums = lengthA - lengthB;
            while (nums > 0) {
                curA = curA.next;
                nums-- ;
            }
        }
        if (lengthB > lengthA) {
            int nums = lengthB - lengthA;
            while (nums > 0) {
                curB = curB.next;
                nums-- ;
            }
        }
        while (curA != null || curB != null) {
            if(curA == curB) return curA;
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }
}
