package lambda;

public class Demo2 {
    //如果多个lambda表达式都实现相同的功能，可以实现一个函数来减少冗余
    interface Cal{
        int add(int a);
    }

    public int testA(int a) {
        return a- 2;
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2();
         Cal a = d::testA;
         Cal b = d::testA;

         new Thread(()->{},"S").start();
    }

}
