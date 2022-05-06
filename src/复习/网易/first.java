package 复习.网易;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] string = input.nextLine().split(" ");
        int m = Integer.parseInt(string[0]);
        int n = Integer.parseInt(string[1]);
        Map<Integer, String> mapSonToFather = new HashMap<Integer, String>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            String[] getNode = input.nextLine().split(" ");
            int father = Integer.parseInt(getNode[0]);
            String son = getNode[2];
            if (mapSonToFather.containsKey(father)) {
                String s = mapSonToFather.get(father) + " " + son;
                mapSonToFather.put(father, s);
            }else {
                mapSonToFather.put(father, son);
            }
            map.put(Integer.parseInt(son), father);
        }
        int count = 0;
        for (int i = 1; i <= m; i++) {
            if (!mapSonToFather.containsKey(i)) {
                continue;
            } else {
                String curSon = mapSonToFather.get(i);
                String[] numSon = curSon.split(" ");
                if (numSon.length == 2) {
                    int flag = 0;
                    for (int j = 0; j < numSon.length; j++) {
                        int son = Integer.parseInt(numSon[j]);
                        if (mapSonToFather.containsKey(son)) {
                            flag = 1;
                        }
                    }
                    if(flag == 0) count++;
                }
            }

        }
        System.out.println(count);
    }
}
