package Array;

/* the problem is to seperate all odd numbers and even numbers in an array without using extra space. Order of the elements may be canged*/

public class SeperateOddEven {

    public static void main(String[] args) {
        int A[] = new int[]{2,4,7,9,6,5,8,1};
        seperateOddEven(A);
    }

    public static void seperateOddEven(int A[]){
        int i = 0;
        int j = A.length-1;
        int f1=0; int f2=0;
        while(i<j || i!=j){
            f1=0; f2=0;
            if(A[i] % 2 == 0)
            { i++;  f1=1;   }
            if(A[j] % 2 == 1)
            {   j--;     f2=1;  }
            if(f1==0 && f2==0) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        }
        for(i=0; i<A.length;i++)
            System.out.print(A[i] + " ");
    }
}
