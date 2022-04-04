package 设计模式.单例模式;

public class Singleton02 {
    //懒汉
    //但是在多线程情况下不能保证只创建出一个线程，解决 ➕ synchronized
    //又引出来
    private static  Singleton02 INSTANCE = null;

    private Singleton02() {
    };
    public static synchronized Singleton02 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton02();

        }
        return INSTANCE;
    }
}
