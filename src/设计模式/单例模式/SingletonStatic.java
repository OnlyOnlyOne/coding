package 设计模式.单例模式;

import javax.crypto.NullCipher;



public class SingletonStatic {
    private static SingletonStatic  singletonStatic;
    private SingletonStatic(){}

    static{
        singletonStatic = new SingletonStatic();
    }

    public static SingletonStatic getSingletonStatic() {
        return singletonStatic;
    }
}
