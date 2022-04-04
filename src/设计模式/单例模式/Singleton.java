package 设计模式.单例模式;

import java.sql.SQLOutput;

public class Singleton {

    //饿汉
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    };

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}
