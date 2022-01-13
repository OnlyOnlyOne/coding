package leetCodeHot100;

public class AddString {
    public String addString(String num1, String num2) {
        //字符串相加
        StringBuilder sb = new StringBuilder();
        char[] a = num1.toCharArray();
        char[] b = num2.toCharArray();
        int carry = 0;
        for(int i = a.length-1, j = b.length-1;
        i>=0||j>=0||carry!=0;
        i--, j--){
            int x = i<0?0:a[i] - '0';
            int y = j<0?0:b[j] - '0';
            sb.append((x+y+carry)%10);
            carry = (x + y +carry)/10;
        }






        return sb.reverse().toString();
    }
}
