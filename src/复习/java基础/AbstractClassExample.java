package 复习.java基础;

public abstract class AbstractClassExample {
    protected int x;
    private int y;

    public abstract void func1();

    public void func2() {
        System.out.println("func2");
    }

    public class Ab extends AbstractClassExample {
        @Override
        public void func1() {
            System.out.println("func1");
        }
    }


}


