package Array;

/* the problem is to seperate all odd numbers and even numbers in an array without using extra space. Order of the elements may be canged*/

public class SeperateOddEven {

    public static void main(String[] args) {
        int A[] = new int[]{2, 4, 7, 9, 6, 5, 8, 1};
        seperateOddEven(A);
    }

    public static void seperateOddEven(int A[]) {
        int i = 0;
        int j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 == 0) {
                i++;
                continue;
            }
            if (A[j] % 2 == 1) {
                j--;
                continue;
            }
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i--;
            j--;
        }
        for (i = 0; i < A.length; i++)
            System.out.print(A[i] + " ");
    }
}
