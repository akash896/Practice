package dynamic;

public class MinimumCoinExchange {
    public static void main(String[] args) {
        int coin[] = new int[]{1,2,3,5,6};
        int total = 11;
        System.out.println("min coins are " + findMinCoin(coin, total));
    }

    private static int findMinCoin(int[] coin, int total) {
        int matrix[][] = new int[coin.length][total+1];
        // setting the first row so that next iterations can be done dynamically
        for(int i=0; i<matrix[0].length; i++)
            matrix[0][i] = i/coin[0];
        // applying dynamic algorithm
        for(int i=1; i<coin.length; i++){
            matrix[i][0] = 0;
            for(int j=1; j<matrix[0].length; j++){
                if(j < coin[i])
                    matrix[i][j] = matrix[i-1][j];
                else{
                    matrix[i][j] = Math.min(matrix[i-1][j], matrix[i][j-coin[i]]+1);
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        return matrix[matrix.length-1][matrix[0].length-1];
    }
}
