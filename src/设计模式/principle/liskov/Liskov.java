package 设计模式.principle.liskov;

import 复习.美团.main;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3" + a.fun1(11,3));

        System.out.println("----------");
        B b = new B();
        //在调用B的fun1方法的时候，调用者以为还是在调用父类的方法，其实子类已经重写了
        System.out.println("11 - 3 =" + b.fun1(11,3));
    }
}

//创建一个更加基础的基类
class Base{
    //把更加基础的方法和成员写到Base类用

}

//里氏替换，用到父类的地方，替换成子类也不会出错
class A extends Base{
    public int fun1(int num1,int num2){
        return num1 - num2;
    }
}

class B extends Base {
    //如果B需要使用A类的方法，使用组合关系
    private A a = new A();
    public int fun1(int num1, int num2) {
        return num1 + num2;
    }

    public int fun2(int a, int b) {
        return fun1(a,b) + 9;
    }

    public int fun3(int a, int b) {
        return this.a.fun1(a,b);
    }
}
