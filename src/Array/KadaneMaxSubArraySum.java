package Array;

public class KadaneMaxSubArraySum {
    public static void main(String[] args) {
        int A[] = new int[]{1,2,-3,-4,5,6};
        int total = 0;
        int max = A[0];
        for(int i=0 ; i<A.length ; i++){
            total = total + A[i];
            if(total < A[i])
                total = A[i];
            if(max < total)
                max = total;
        }
        System.out.println("sum is "+max);
    }
}
