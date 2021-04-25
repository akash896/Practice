package backtracking;

import java.util.ArrayList;

public class StairCaseCombinationMatrix {
    public static void main(String[] args) {
        int steps[] = new int[]{1,3,5};
        ArrayList<Integer> ans = new ArrayList<>();
        findWays(0, 7, steps, ans);
    }

    private static void findWays(int pos, int dest, int[] steps, ArrayList<Integer> ans) {
        ArrayList<Integer> c = new ArrayList<>(ans);
        if(pos==dest) {
            ans.stream().forEach(n -> System.out.print(n + " "));
            System.out.println();
        }
        if(pos>dest)
            return;
        for(int i=0;i<steps.length;i++){
            ans = (ArrayList<Integer>) c.clone();
            ans.add(steps[i]);
            findWays(pos+steps[i], dest, steps, ans);
        }
    }
}
