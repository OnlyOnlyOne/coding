package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class combine {
    //先定义存储路径以及全局集合
//    List<Integer> path = new ArrayList<Integer>();
    LinkedList<Integer> path = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> combine(int n, int k) {
//        for (集合的大小; ) {
//            if (终止条件) {
//                收集集合;
//                return;
//            }
//            递归函数;
//            回溯操作;
//
//        }
        backtracking(n, k, 1);
        return result;

    }

    private void backtracking(int n, int k, int startIndex) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
//        for (int i = startIndex; i <= n; i++) {
        //剪枝
        for (int i = startIndex; i <= n - (k - path.size() ) + 1; i++) {
            path.add(i);
            backtracking(n, k, i + 1);
            path.removeLast();
        }
    }
}
