package Array;

public class HeapSort {
    public static void main(String[] args) {
        int A[] = new int []{1,4,3,2,7,6,5,8,9,7};
        A = sort(A, A.length);
        System.out.println();
        for(int a:A)
            System.out.print(a+" ");
    }

    private static int[] sort(int[] A, int n) {
        for(int i=n/2-1; i>=0; i--){
            A = heapify(A, i, n);
        }
        for(int i=n-1; i>=0; i--){
             int temp = A[0];
             A[0] = A[i];
             A[i] = temp;
                A = heapify(A,0,i);
                System.out.println(i+"--> ");
                for(int p:A) {
                    System.out.print(p + " ");
                }
            System.out.println();
            }
            return A;
        }

public static int[] heapify(int A[], int k, int n){
        int largest = k;
        int l = k*2;
        int r = k*2+1;
        if(l<n && A[l]>A[largest])
            largest = l;
        if(r<n && A[r]>A[largest])
            largest = r;
        if(largest!=k){
            int temp = A[k];
            A[k] = A[largest];
            A[largest] = temp;
            A = heapify(A, largest, n);
        }
        return A;
    }
}
