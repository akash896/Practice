package Array;

public class ThirdLargestElement {
    public static void main(String[] args) {
        int A[] = new int []{5,6,1,2,3,7,9,8};
        System.out.println(thirdLargest(A));
    }

    public static int thirdLargest(int A[]){
       int big1, big2, big3;
       big1 = big2 = big3 = A[0];
        for(int i=1; i<A.length;i++){
            if(A[i]>big1){
                big3 = big2;
                big2 = big1;
                big1 = A[i];
//                System.out.println(big1 + " " + big2 + " " + big3);
            }
            else {
                if (A[i] > big2) {
                    big3 = big2;
                    big2 = A[i];
                }
                else
                if (A[i] > big3) {
                    big3 = A[i];
                }
            }
        }
        return big3;
    }
}
