package Array;

import java.util.*;

public class Sum3Equal0 {

    public static void main(String[] args) {
        int A[] = new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        //int A[] = new int[]{-1,1, 0};
        Set<List<Integer>> ans = find1(A, 0, new HashSet<List<Integer>>(), 0, new ArrayList<Integer>(), 0);
        for(List a : ans)
            System.out.println(a);
    }

    private static Set<List<Integer>> find1(int[] A, int sum, Set<List<Integer>> ans, int n, List<Integer> row, int c) {
        if(c==3) {
            System.out.println("row = " + row);
            if (sum == 0) {
                Collections.sort(row);
                ans.add(row);
                return ans;
            }
            else
                return ans;
        }

        for(int i=1; n+i-1<A.length; i++){
            List<Integer> cpy = new ArrayList<>(row);
            cpy.add(A[n+i-1]);
            ans = find1(A, sum+A[n+i-1], ans, n+i, cpy, c+1);
        }
        return ans;
    }

    private static Set<List<Integer>> find2(int[] A, int sum, Set<List<Integer>> ans, int n, List<Integer> row, int c) {
        if(c==3) {
            System.out.println("row = " + row);
            if (sum == 0) {
                Collections.sort(row);
                ans.add(row);
                return ans;
            }
            else
                return ans;
        }
        if(n<A.length) {
            List<Integer> cpy = new ArrayList<>(row);         // {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6}
            cpy.add(A[n+0]);
            ans = find2(A, sum + A[n], ans, n + 1, cpy, c+1);
        }
        if(n+1<A.length) {
            List<Integer> cpy = new ArrayList<>(row);
            cpy.add(A[n+1]);
            ans = find2(A, sum + A[n+1], ans, n + 2, cpy, c+1);
        }
        if(n+2<A.length) {
            List<Integer> cpy = new ArrayList<>(row);
            cpy.add(A[n+2]);
            ans = find2(A, sum + A[n+2], ans, n + 3, cpy, c+1);
        }
        return ans;
    }
}
