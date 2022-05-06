package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class 实现线程的三种方式 {

    public static class TestThread extends Thread {
        /**
         * If this thread was constructed using a separate
         * <code>Runnable</code> run object, then that
         * <code>Runnable</code> object's <code>run</code> method is called;
         * otherwise, this method does nothing and returns.
         * <p>
         * Subclasses of <code>Thread</code> should override this method.
         *
         * @see #start()
         * @see #stop()
         * @see #Thread(ThreadGroup, Runnable, String)
         */
        int i = 0;
        @Override
        public void run() {
            for(;i <=1000;i++){
                System.out.println(this.getName() + " " + i);
            }
        }
    }

    //第二种，通过实现Runnable接口创建线程类
    //可用函数式接口实现
    public static class ImpRunnable implements Runnable {
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
        private int i =0;
        @Override
        public void run() {
            for(;i <50;i++){
                System.out.println(Thread.currentThread().getName() + " "+i);
            }
        }

        public static void main(String[] args) {
            for(int j = 0; j < 50;j++){
                System.out.println(Thread.currentThread().getName() + " " + j);
                if(j == 10){
                    new Thread(new ImpRunnable(),"线程A").start();
                    new Thread(new ImpRunnable(),"线程B").start();
                }
            }
        }
    }
    //第三种，使用Callable接口和Future接口
    public static class ThirdThreadImp{
        public static void main(String[] args) {
            //这里call()方法的重写是采用lambda表达式，没有新建一个Callable接口的实现类
            FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>)()->{
                int i = 0;
                for(;i < 50;i++){
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
                //call()方法的返回值
                return i;
            } );
            for (int j = 0; j < 50; j++) {
                System.out.println(Thread.currentThread().getName() + " " + j);
                if(j == 10){
                    new Thread(task,"线程A").start();
                }
            }
            try {
                System.out.println("子线程的返回值" + task.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

        }
    }


    public static void main(String[] args) {
        for (int j = 0; j < 50; j++) {
            System.out.println(Thread.currentThread().getName() + " "+j);
            if (j == 10) {
                //创建第一个线程
                new TestThread().run();
                //创建第二个线程
                new TestThread().run();
            }

        }


    }
}
