package 复习.尚硅谷.dataStructures.com.hwy.linkedList;

public class 约瑟夫问题 {
    public static void main(String[] args) {
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.addBoy(5);
        circleSingleLinkedList.showBoy();
    }
}


//创建一个环形的单向链表
class CircleSingleLinkedList{
    //创建一个first节点，当前没有编号
    private Boy first = null;

    //添加一个小孩节点，构建成一个环形的链表
    public void addBoy(int nums) {
        //nums 做一个数据校验
        if (nums < 1) {
            System.out.println("nums的值不正确");
            return;
        }
        Boy curBoy = null;
        for (int i = 1; i <= nums; i++) {
            Boy boy = new Boy(i);
            if (i == 1) {
                first = boy;
                first.setNext(first);
                curBoy = first;
            } else {
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy = boy;
            }

        }
    }

    //遍历当前的环形链表
    public void showBoy() {
        if (first == null) {
            System.out.println("没有任何小孩");
            return;
        }
        //因为
        Boy curBoy = first;
        while (true) {
            System.out.print("小孩的编号：" + curBoy.getNo() + "\t");
            if (curBoy.getNext() == first) {//说明已经遍历完毕
                break;
            }
            curBoy = curBoy.getNext(); //boy后移
        }
    }
}

//创建一个Boy类，表示一个节点
class Boy{
    private int no;//编号
    private Boy next;//指向下一个节点，默认为null

    public Boy(int no, Boy next) {
        this.no = no;
        this.next = next;
    }

    public Boy(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }
}
