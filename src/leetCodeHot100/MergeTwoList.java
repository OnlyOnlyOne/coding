package leetCodeHot100;

public class MergeTwoList {
    public ListNode mergeTwoList(ListNode l1, ListNode l2) {

        //用递归的方法
        if (l1 == null) return l2;
        if(l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoList(l1.next, l2);
            return l1;
        }
        l2.next = mergeTwoList(l1, l2.next);
        return l2;
    }
}
