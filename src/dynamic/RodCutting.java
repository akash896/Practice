package dynamic;

public class RodCutting {
    public static void main(String[] args) {
        int length = 5;  // length of rod
        int cost[] = new int[]{2, 4, 10, 11}; //cost of the size (1=2, 2=4, 3=10, 4=11)
        System.out.println("max profit is " + findProfit(cost, length));
    }

    private static int findProfit(int[] cost, int length) {
        int matrix[][] = new int[cost.length][length+1];
        // setting the first row of the matrix so that next iterations can be done dynamically
        for(int i=0; i<matrix[0].length; i++)
            matrix[0][i] = (i/1)*cost[0];
        // performing the dynamic algorithm
        for(int i=1; i<matrix.length; i++){
            matrix[i][0] = 0;
            for(int j=1; j<length+1; j++){
                if(j<=i)
                    matrix[i][j] = matrix[i-1][j];
                else
                    matrix[i][j] = Math.max(matrix[i-1][j], cost[i]+matrix[i][j-i-1]);
            }
        }
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    return matrix[matrix.length-1][matrix[0].length-1];
    }
}
