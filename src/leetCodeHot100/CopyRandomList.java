package leetCodeHot100;



public class CopyRandomList {
    static Node copyRandomList(Node head) {
        //深拷贝,就是赋值原对象的值
        //解法一，三步走，遍历整个列表，在列表后面新添一个新的节点，值一样，指向新的节点
        //然后设置随机指针
        //分解
        Node cur = head;
        if(cur == null) return null;
        while (cur != null) {
            Node node = new Node(cur.val);
            node.next = cur.next;
            cur.next = node;
            cur = node.next;
        }

        //第二步,继续遍历原列表
        Node cur1 = head;
        while (cur1 != null) {
            cur1.next.random = cur1.random.next;
            cur1 = cur1.next.next;
        }

        //第三步，拆分
        Node cur2 = head;
        //要拿一个节点储存，不然会丢失
        Node temp = new Node(0);
        Node headList = new Node(0);
        headList.next = head.next;
        while (cur2 != null) {
            temp = cur2.next;
            cur2.next = temp.next;
            temp.next = cur2.next.next;
            cur2 = cur2.next;
        }

        return headList.next;



    }

    class Solution {
        public Node copyRandomList(Node head) {
            if(head==null) {
                return null;



            }









            Node p = head;
            //第一步，在每个原节点后面创建一个新节点
            //1->1'->2->2'->3->3'
            while(p!=null) {
                Node newNode = new Node(p.val);
                newNode.next = p.next;
                p.next = newNode;
                p = newNode.next;
            }
            p = head;
            //第二步，设置新节点的随机节点
            while(p!=null) {
                if(p.random!=null) {
                    p.next.random = p.random.next;
                }
                p = p.next.next;
            }
            Node dummy = new Node(-1);
            p = head;
            Node cur = dummy;
            //第三步，将两个链表分离
            while(p!=null) {
                cur.next = p.next;
                cur = cur.next;
                p.next = cur.next;
                p = p.next;
            }
            return dummy.next;
        }
    }


}
