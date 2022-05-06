import java.util.Random;

public class DEMO011 {
    public static String solution() {
        int[] h = {
                1, 3, 5, 7, 11, 2, 13,
                1, 1, 17, 19, 97, 23, 29
        };
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < 14; i++) {
            int k = random.nextInt();
            int j = Math.abs(k % 9);
            count += j * h[i];
            sb.append(j);
        }
        int a = (count % 97) + 1;
        if (a < 10) {
            sb.append(0).append(a);
        } else {
            sb.append(a);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution());
    }
}
