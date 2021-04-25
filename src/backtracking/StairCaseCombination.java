package backtracking;

import java.util.ArrayList;

// problem is to find the no of possible ways to climb  stairs with only 1 and 2 steps possible at a time
public class StairCaseCombination {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        findWays(0, 4, ans);
    }

    private static void findWays(int pos, int top, ArrayList<Integer> ans) {
        ArrayList<Integer> c = new ArrayList<>(ans);
        if(pos==top) {
            ans.stream().forEach(n -> System.out.print(n));
            System.out.println();
        }
        if(pos>top)
            return;
        ans.add(1);
        findWays(pos+1, top, ans);
        c.add(2);
        findWays(pos+2, top, c);
    }
}
