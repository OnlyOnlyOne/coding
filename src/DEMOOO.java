import java.util.Scanner;

public class DEMOOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        helper(s);
    }

    public static void helper(String s) {
        String[] str = s.split(":");
        String s1 = str[1];
        int index = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '\\' || s1.charAt(i) == '/') index++;
            if (i > 0 && (s1.charAt(i - 1) == '/' || s1.charAt(i - 1) == '\\')
                    && (s1.charAt(i) != '/' && s1.charAt(i) != '\\')
            ) break;
        }
        StringBuilder sb = new StringBuilder();
        String spli = s1.substring(index, s1.length());
        sb.append("//").append(spli);
        System.out.println(str[0] + ":" + sb.toString());
    }
}
