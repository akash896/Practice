package Array;
/* problem is find maximum difference between 2 elements such that larger element appears after smaller element */
public class MaxDifference {
    public static void main(String[] args) {
        int A[] = new int[]{14,12,70,15,95,65,22,30};
        System.out.println(findMaxDiff(A));
    }

    public static int findMaxDiff(int A[]){
        int maxDiff = A[1] - A[0];
        int small = A[0];
        for(int i=1;i<A.length;i++){
            if(A[i] < small)
                small = A[i];
            if(A[i]>small){
                int diff = A[i] - small;
                if(diff > maxDiff)
                    maxDiff = diff;
            }
        }
        return maxDiff;
    }
}
