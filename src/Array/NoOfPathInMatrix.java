package Array;

// the problem is to find no of path possible to go from upperleft corner to lower right corner

public class NoOfPathInMatrix {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int A[][] = new int [m][n];
        System.out.println(findNoOfPaths(A));
    }

    public static int findNoOfPaths(int A[][]){
        for(int i=0;i<A[0].length;i++)
            A[0][i] = 1;

        for(int j=0;j<A.length;j++)
            A[j][0] = 1;

        for(int i=1;i<A.length;i++){
            for(int j=1; j<A[0].length;j++){
                A[i][j] = A[i-1][j] + A[i][j-1];
            }
        }
        return A[A.length-1][A[0].length-1];
    }
}
