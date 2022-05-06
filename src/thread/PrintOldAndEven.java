package thread;

import 复习.java基础.synchroniezd.SynchroniezdObjectLock;
import 复习.美团.main;

public class PrintOldAndEven {
    //监控器
    private static final Object object = new Object();
    private static int i = 1;

    public static void main(String[] args) {
        new Thread(new Print(),"打印奇数线程").start();
        new Thread(new Print(),"打印偶数线程").start();
    }

    static class Print implements Runnable {
        @Override
        public void run() {
            while (i <= 100) {
                synchronized (object) {
                    System.out.println(Thread.currentThread().getName() + i++);
                    object.notify();
                    if (i <= 100) {
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
