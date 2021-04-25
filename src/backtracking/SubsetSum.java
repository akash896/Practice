package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

// The problem is tofind the subsets of an array which sum up to a given number
public class SubsetSum {
    public static void main(String[] args) {
        int A[] = new int[]{5,10,12,13,15,18, 30};
        int m = 30;
        ArrayList<Integer> ans = new ArrayList<>();
        int sum = Arrays.stream(A).sum();
        //System.out.println(sum);
        findWays(A, 0, 0, sum, m, ans);
    }
    private static void findWays(int[] A, int index, int sum, int left, int m, ArrayList<Integer> ans) {
        ArrayList<Integer> c = new ArrayList<>(ans);
        if(sum == m) {
            ans.stream().forEach(n -> System.out.print(n + "  "));
            System.out.println();
        }
        if(index>=A.length)
            return;
        if(sum+left < m)
            return;
        if(sum+A[index] > m)
            return;
        if(index+1<=A.length) {
            ans.add(A[index]);
            findWays(A, index + 1, sum + A[index], left - A[index], m, ans);
            //ans.remove(index);
            findWays(A, index + 1, sum, left - A[index], m, c);
        }

    }
}
