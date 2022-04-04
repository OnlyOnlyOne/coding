package JUC.pc;

public class A {
    public static void main(String[] args) {
        Resource resource = new Resource();

        new Thread(()->{for(int i = 0; i < 10;i++) {
            try {
                resource.increment();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }},"A").start();
        new Thread(()->{for(int i = 0; i < 10;i++) {
            try {
                resource.decrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }},"B").start();
    }
}

class Resource{
    private int num = 0;

    public synchronized void  increment() throws InterruptedException {
        while (num != 0) {
            this.wait();
        }
        num++;
        System.out.println(Thread.currentThread().getName() + "=>" + num);
        this.notifyAll();
    }

    public synchronized void decrement() throws InterruptedException {
        while (num == 0) {
            this.wait();
        }
        num--;
        System.out.println(Thread.currentThread().getName() + "=>" + num);
        this.notifyAll();
    }
}
