package Array;

public class MinElementInSortedRotatedArray {

    public static void main(String[] args) {
        int A[] = new int[]{8,9,10,1,2,3,4,5,6,7};
        System.out.println(findmin(A,0,9));
    }

    public static int findmin(int A[], int low, int high){
       int mid;
       while(low<high){
           mid = (low+high)/2;
           if(A[high]<A[mid])
               low = mid+1;
           else
               high = mid;

       }
       return A[low];
    }
}
