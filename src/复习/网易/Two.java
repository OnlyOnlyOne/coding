package 复习.网易;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Two {
    public static void main(String []args) {
        init();
    }
    private static void init() {
        //Material Science 材料
        //java泛型擦出机制，HashSet<Object>() 与 HashSet<>()在编译器相同
        Set<String> mSet = new HashSet<>();
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String row = in.nextLine();
            //使用空格进行分割
            String []rows = row.split(" ");
            for (String string : rows) {
                mSet.add(string);
            }
        }
        System.out.println(mSet.size());
        in.close();
    }


}
