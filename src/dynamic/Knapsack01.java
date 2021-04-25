package dynamic;

public class Knapsack01 {
    public static void main(String[] args) {
        int weight[] = new int[]{1,2,3,4};
        int cost[] = new int[]{2,3,6,10};
        int sackSize = 6;
        System.out.println("Maximum profit is "+knapsack(weight, cost, sackSize));
    }

    private static int knapsack(int[] weight, int[] cost, int size) {
        int matrix[][] = new int[weight.length][size+1];
        // filling first row so that from next iteration dynamic algorithm can be applied
        for(int i=0; i<matrix[0].length; i++){
            if(i<weight[0])
                matrix[0][i] = 0;
            else
                matrix[0][1] = cost[0];
        }

        for(int i=1; i<matrix.length; i++){
            matrix[i][0] = 0;
            for(int j=1; j<matrix[0].length; j++){
                if(j<weight[i])
                    matrix[i][j] = matrix[i-1][j];
                else
                    matrix[i][j] = Math.max(matrix[i-1][j], matrix[i-1][j-weight[i]] + cost[i]);
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++)
                System.out.print(matrix[i][j]+"  ");
            System.out.println();
        }
        return matrix[matrix.length-1][matrix[0].length-1];
    }
}
