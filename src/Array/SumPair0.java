package Array;

/* the problem is to find all pairs whose sum is equal to 0*/

public class SumPair0 {

    public static void main(String[] args) {
        int A[] = new int []{0,1,2,3,4,5,6};
        findPairs(A , 5);
    }

    public static void findPairs(int A[], int n){
        int i = 0;
        int j = A.length - 1;
        int f,r;
        while(i!=j && i<j){
            f = A[i];
            r = A[j];
            if(f + r == n) {
                System.out.println(f + " " + r);
                i++;
                j--;
            }
            else{
                if(f+r < n)
                    i++;
                else
                    j--;
            }
            System.out.println();
        }
    }
}
