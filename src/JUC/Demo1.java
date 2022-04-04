package JUC;

public class Demo1 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(() -> {
            for (int i = 0; i < 60; i++) {
                ticket.sale();
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 60; i++) {
                ticket.sale();
            }
        }, "B").start();
        new Thread(() -> {
            for (int i = 0; i < 60; i++) {
                ticket.sale();
            }
        }, "C").start();
    }


}

//资源类OOP
class Ticket{
    private int number = 50;

    public void sale() {
        if (number > 0) {
            System.out.println(Thread.currentThread().getName() + "卖出第" + (number--) + "票，剩余：" + number);
        }
    }
}
