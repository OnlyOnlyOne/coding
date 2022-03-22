package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Lc131分割回文串 {
    List<List<String>> result = new ArrayList<>();
    List<String> path = new ArrayList<>();
    //回文串：正读和反读都一样
    public List<List<String>> partition(String s) {
        //切割问题和组合问题差不多
        backtracking(s, 0);
        return result;
    }
    public void backtracking(String s, int index) {
        if (index == s.length()) {
            result.add(new ArrayList<>(path));
        }
        for (int i = index; i < s.length(); i++) {
            boolean flag = isHuiWenHelper(s, index, i);
            if (!flag) {
                continue;
            }
//            String temp = "";
            String temp = s.substring(index, i + 1);

//            for (int j = index; j <= i; j++) {
//                temp = temp + s.charAt(j);
//            }
            path.add(temp);
            backtracking(s, i + 1);
            path.remove(path.size() - 1);
        }
    }
    public boolean isHuiWenHelper(String s,int start,int end) {
        boolean flag = false;
        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            }else{
                break;
            }
        }
        if (start > end) {
            flag = true;
        }
        return flag;
    }
}
