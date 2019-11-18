package Array;
// problem is to find sub arrays whose sum is equal to a given number
public class SubArraySum {

    public static void main(String[] args) {
        int A[] = new int[]{14,12,70,15,95,65,22,30};
        findSubArray(A, 87);
    }

    public static void findSubArray(int A[], int x){
        int start =0;
        int sum =0;
        for(int i=0;i<A.length;i++){
            sum = sum + A[i];
            if(sum > x){
                while(sum>x && start<i)
                    sum = sum - A[start++];
            }
            if(sum == x){
                for(int k=start; k<=i;k++)
                    System.out.print(A[k]+" ");
                System.out.println();
            }
        }
    }

}
