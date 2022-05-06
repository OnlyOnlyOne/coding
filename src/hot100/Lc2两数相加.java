package hot100;

import leetCodeHot100.list.ListNode;

import java.util.List;

public class Lc2两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode cur = res;
        int carry = 0;
        while (l1 != null || l2 != null) {
            //如果其中有一个到达结尾了，那么这个链表这一位的数字就为0
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            int sum = a + b + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry == 1) cur.next = new ListNode(1);
        return res.next;
    }
}
