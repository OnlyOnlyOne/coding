package 复习.java基础;

public class equals和等等 {
    public static void main(String[] args) {

        Integer integer1 = new Integer(1);
        Integer integer2 = new Integer(1);

        System.out.println(integer1 == integer2);
        System.out.println(integer1.equals(integer2));
    }
}
