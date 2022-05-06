package 设计模式.单例模式;

public class SingletonDouble {
    //需要加，因为new对象的时候会指令重拍
//    private static volatile SingletonDouble instance;
//
//    private SingletonDouble() {
//    };
//
//    public static SingletonDouble getInstance() {
//        //业务逻辑代码省略
//        if (instance == null) {
//            //双重检查
//            synchronized (SingletonDouble.class) {
//                if (instance == null) {
//                    try {
//                        Thread.sleep(1);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    instance = new SingletonDouble();
//                }
//            }
//        }
//
//        return instance;
    private static volatile SingletonDouble singletonDouble;

    private SingletonDouble() {
    };

    public static SingletonDouble getSingletonDouble() {
        if (singletonDouble == null) {
            synchronized (SingletonDouble.class){
                if (singletonDouble == null) {
                    singletonDouble = new SingletonDouble();
                }
            }
        }
        return singletonDouble;
    }

    //    }
}
