import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Mainnn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        List list = new ArrayList();
        for (int i = 0; i < total; i++) {
            sc = new Scanner(System.in);
            int codeLine = sc.nextInt();
            String[] str = new String[codeLine];
            //接受字符
            for (int j = 0; j < codeLine; j++) {
                sc = new Scanner(System.in);
                str[j] = sc.nextLine();
            }
            System.out.println(helper(str));
        }
    }

    public static String helper(String[] str) {
        Deque<String> deque = new LinkedList<String>();
        for (int i = 0; i < str.length; i++) {
            if (!str[i].contains("end")) {
                deque.push("end "+str[i]);
            } else if (deque.isEmpty() || !deque.peek().equals(str[i])) {
                return "No";
            } else {
                deque.pop();
            }
        }
        return deque.isEmpty() == true ? "Yes" :"No";
    }
}
