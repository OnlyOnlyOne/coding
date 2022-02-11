package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lc216combinationSum3 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(k,n,0,1);
        return result;
    }

    private void backtracking(int k, int n, int sum,int startIndex) {

        if (path.size() == k ) {
            if(sum == n) {
                result.add(new ArrayList<>(path));
            }
            return;
        }

        for (int i = startIndex; i <= 9 ; i++) {
            path.add(i);
            sum += i;
            backtracking(k,n, sum,i+1);
            sum -= i;
            path.removeLast();
        }
    }

}
