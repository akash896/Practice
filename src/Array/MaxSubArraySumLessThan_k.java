package Array;

public class MaxSubArraySumLessThan_k {
    public static void main(String[] args) {
        int A[] = new int[]{9,8,1,1,1,1,4,5,6};
        int i,j,c,min=0,max=0, fi=0, k=1;

        for(j=1; j<A.length; j++){
            c = 0; fi=0;
            for(i=0; i<j; i++){
                if(Math.abs(A[j] - A[i])<k)
                    c++;
            }
            if(c>(max-min)){
                min = j-c;
                max = j;
            }
        }

        for(i=min; i<=max; i++){
            System.out.print(A[i] + " ");
        }

    }

}
