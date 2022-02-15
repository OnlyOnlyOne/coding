package 复习.java基础;

public class s01 {
    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        String s3 = s1.intern();

        //从java7开始，可以在switch条件判断语句中使用string对象
        switch (s1) {
            case "a":
                System.out.println("aaa");
                break;
            case "b":
                System.out.println("bbb");
                break;
        }



    }
}
