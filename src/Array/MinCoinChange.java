package Array;

public class MinCoinChange {
    public static void main(String[] args) {
//        int A[] = {9,6,5,1};
        int A[] = {1,5,6,9};
        System.out.println(findMinCoin(A, 11));
    }

    private static int findMinCoin(int[] A, int v) {       // (11), (3), (2),
        if(v==0)
            return 0;
        int res = v;        // 11, 3, 2,
        for(int i=0; i<A.length; i++) {     //9, 1, 1,
            if (A[i] <= v) {
                int subres = findMinCoin(A, v - A[i]);  // (3), (2)
                        //  0, 1
                if (subres + 1 < res)
                    res = subres + 1;
            }
        }
        return res; // 1,
    }

}
