package leetCodeHot100;

public class IsPalindrome {
    //回文链表
    //一分为二，右边进行翻转
    public static boolean isPalindrome(ListNode head) {
        //1.分为两部分
        int length = 0;
        ListNode cur = head;
        ListNode cur3 = head;
        while (cur3 != null) {
            length++;
            if(cur3.next!=null)
            {cur3 = cur3.next;}
            else break;

        }
        if(length == 0) return true;
        //2.遍历到指定部分
        int i = length/2;
        ListNode cur1 = head;
        ListNode left = head;
        for (int j = 0; j < i; j++) {
            cur1 = cur1.next;
        }
        //对右边进行翻转
        ListNode right = ReverseList.reverseList(cur1);
        //开始验证
        while (right != null) {
            if (right.val == left.val) {
                right = right.next;
                left = left.next;
            }
            else
                return false;
        }





        return true;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode cur = head;
//        for (int i = 1; i < 6; i++) {
//            ListNode n = new ListNode(i);
//            cur.next = n;
//            cur = cur.next;
//        }
        cur.next = new ListNode(2);
        cur = cur.next;
//        cur.next = new ListNode(2);
//        cur = cur.next;
//        cur.next = new ListNode(1);

        Boolean get = isPalindrome(head);
        System.out.println(get);
    }

}
