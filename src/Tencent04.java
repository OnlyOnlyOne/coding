import leetCodeHot100.list.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Tencent04 {
    public ListNode solve (ListNode[] a) {
        // write code here
        Map<Integer,Integer> map = new HashMap<>();
        //存入头部
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(5);
        ListNode d = new ListNode(4);
        ListNode f = new ListNode(7);
        ListNode g = new ListNode(3);
        ListNode h = new ListNode(10);
        b.next = c;
        c.next = d;
        d.next = f;
        f.next = g;
        g.next = h;
        return b;


    }
}
