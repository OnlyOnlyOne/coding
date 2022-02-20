package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Lc17电话号码的字母组合 {
    List<String> result = new ArrayList<>();
    StringBuffer path = new StringBuffer();
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) return result;
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtracking(digits, numString, 0);
        return result;
    }
    //确定函数的参数
    private void backtracking(String digits, String[] numString, int num) {
        //确定终止条件
        if (num == digits.length()) {
            result.add(path.toString());
            return;
        }

        String str = numString[digits.charAt(num) - '0'];
        for (int i = 0; i < str.length(); i++) {
            path.append(str.charAt(i));
            backtracking(digits,numString,num + 1);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
