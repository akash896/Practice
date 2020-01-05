package Array;

public class LeftShift {

    public static void main(String[] args) {
        int A[] = new int[]{1,2,3,4,5,6,7,8,9};
        shift(A, 4);
    }

    public static void shift(int A[], int n){
        int temp = A[0];
        int k = 1;
        int i = 0;
        while (k <= A.length){
                   A[i] = A[(i+n)%A.length];
                   i = (i+n)%A.length;
                   k++;
        }
        A[i] = temp;
        for(i = 0 ; i<A.length ; i++)
            System.out.print (A[i] + " ");
    }
}
