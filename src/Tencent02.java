public class Tencent02 {
    public static int getNumber (int[] a) {
        // write code here
        int len = a.length;
        int b = 0;
        while(len != 1){
            int start = len;
            for (int i = 0; i < start; i++) {
                if (isvalid(i + 1)) {
                    b++;
                    len--;
                } else {
                    a[i - b] = a[i];
                }
            }
            b = 0;
        }
        return a[0];
    }
    public static boolean isvalid(int index){
        if(index == 1) return true;
        if( index <= 3){
            return false;
        }
        if (index % 6 != 1 && index % 6 != 5) {
            return true;
        }
        int sql = (int) Math.sqrt(index);
        for (int i = 5; i <= sql; i += 6) {
            if (index % i == 0 || index % (i + 2) == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {3,1,1,4,5,6};

        System.out.println(getNumber(a));
    }
}
