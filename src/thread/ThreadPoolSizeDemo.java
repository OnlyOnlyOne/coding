package thread;

import 复习.美团.main;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolSizeDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,
                4,
                10,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(2),
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        Thread t = new Thread(r);
                        t.setName("abc");
                        return t;
                    }
                },
                new ThreadPoolExecutor.AbortPolicy()
        );

        executor.execute(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
    }
}
