package leetCodeHot100;

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = 0;
        int b = 0;
        ListNode curA = headA;
        ListNode curB = headB;
        while(curA!=null){
            a++;
            curA = curA.next;
        }
        curA = headA;
        while(curB!=null){
            b++;
            curB = curB.next;
        }
        curB = headB;
        if(a==0||b==0) return null;
        int count = 0;
        if(a>b){
            count = a-b;
            for (int i = 0; i < count; i++) {
                curA = curA.next;
            }
        }
        else{
            count = b-a;
            for (int i = 0; i < count; i++) {
                curB = curB.next;
            }
            }
        int has = 0;
        while (curA != null || curB != null) {
            if(curA==curB){ has = 1;
            break;}
            else{
                curA = curA.next;
                curB = curB.next;
            }

        }
        if(has==1) return curA;
        return null;
    }
}
