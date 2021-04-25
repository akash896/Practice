package Array;
// problem is find the sub array with the longest increasing sub sequence
public class LongestIncreasingSubArray {
    public static void main(String[] args) {
        int A[] = new int[]{2,0,3,4,9,18,27,34};
        int start = 0;
        int l=0, r=0, i;
        for(i=1; i<A.length; i++){
            if(A[i]<A[i-1]){
                if(i - start -1 > r - l){
                    r = i-1;
                    l = start;
                }
                start = i;
            }
            }
        if(i - start -1 > r - l){
            r = i-1;
            l = start;

        }
        System.out.println(l + " " + r);
    }
}
