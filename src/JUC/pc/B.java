package JUC.pc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class B {
    public static void main(String[] args) {
        Resource1 resource = new Resource1();
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

        new Thread(()->{for(int i = 0; i < 10;i++) {
            try {
                resource.increment();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }},"C").start();
        new Thread(()->{for(int i = 0; i < 10;i++) {
            try {
                resource.decrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }},"D").start();
    }
}

class Resource1 {
    private int num = 0;

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();



    public void increment() throws InterruptedException {
        lock.lock();
        try {
            while (num != 0) {
//            this.wait();
                condition.await();
            }
            num++;
            System.out.println(Thread.currentThread().getName() + "=>" + num);
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }



    }

    public void decrement() throws InterruptedException {
        lock.lock();
        try {
            while (num == 0) {
                condition.await();
            }
            num--;
            System.out.println(Thread.currentThread().getName() + "=>" + num);
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
