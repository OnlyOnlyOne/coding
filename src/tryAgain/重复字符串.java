package tryAgain;

public class 重复字符串 {
    public static void getNext(int[] next,String s){
        int j = 0;
        for(int i = 1; i < s.length();i++){
            while(j > 0 && s.charAt(i) != s.charAt(j)){
                j = next[j - 1];
            }
            if(s.charAt(i) == s.charAt(j)){
                j++;
            }
            next[i] = j;
        }
    }

    public static void main(String[] args) {
        String s = "asdfasdfasdf";
        int[] next = new int[s.length()];
        getNext(next,s);
        System.out.println();
    }
}
