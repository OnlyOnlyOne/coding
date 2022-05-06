import java.awt.font.NumericShaper;
import java.util.Arrays;
import java.util.Scanner;

public class Tencent01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        String[] nums = new String[line];
        for (int i = 0; i < line; i++) {
            nums[i] = sc.next();
        }
        read(line,nums);
    }

    public static void read(int line, String[] nums) {
        int size = nums[0].length();
        String[] res = new String[size];
        Integer[] resInt = new Integer[size];
        Arrays.fill(res,"");
        for (int i = 0; i < line; i++) {
            String str = nums[i];
            for (int j = 0; j < str.length(); j++) {
                res[j] += str.charAt(j);
            }
        }
        for (int i = 0; i < res.length; i++) {
            String string = res[i].replaceFirst("^0*","");
            resInt[i] = Integer.parseInt(string.isEmpty() ? "0" : string);
        }
        Arrays.sort(resInt);
        for (int i = 0; i < resInt.length; i++) {
            if (i != resInt.length - 1) {
                System.out.print(resInt[i] + " ");
            } else {
                System.out.print(resInt[i]);
            }
        }
    }
}
