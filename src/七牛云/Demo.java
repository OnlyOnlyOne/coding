package 七牛云;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        int[] time = {
                5,1,2,6
        };
        int[] quality = {
                2,1,4,3
        };
        System.out.println(solution(time,quality,3));
    }

    public static int solution(int[] time, int[] quality,int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < time.length;i++){
            map.put(time[i],quality[i]);
        }
        int result = 0;
        Arrays.sort(time);
        for(int i = 0; i <= time.length - k; i++){
            int temp = 0,l = i + k - 1, q = 0;
            for(int j = i;j <= l;j++){
                temp += time[j];
                q = Math.min(q, map.get(time[i]));
            }
            result = Math.max(result, temp * q);
        }
        return result;
    }
}
