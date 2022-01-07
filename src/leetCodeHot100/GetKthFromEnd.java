package leetCodeHot100;

public class GetKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        //链表中倒数第K个结点
        //可以利用哈希表, 就是求放进哈希表后n-k+1个位置
        //方法二：遍历整个链表的结点个数，然后扫描到n-k+1个结点
        //三：双指针，快慢双指针

        //先移动到k-1个位置
        if(k==0||head == null) return null;
        ListNode fast = head;
        for (int i = 1; i < k; i++ ) {
            if (fast != null) {
                fast = fast.next;
            }
        }

        ListNode result = null;
        while (fast != null) {
            if(result == null) result = head;
            else
                result = result.next;
            fast = fast.next;
        }
        return result;
    }
}
