package 复习.java基础.synchroniezd;

public class SynchroniezdObjectLock2 implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    static SynchroniezdObjectLock2 instance = new SynchroniezdObjectLock2();

    //创建两把锁
    Object object1 = new Object();
    Object object2 = new Object();

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("woshi" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(instance);
        Thread thread2 = new Thread(instance);
        thread1.start();
        thread2.start();
    }
}
