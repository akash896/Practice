package dynamic;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String s = "abcdcbe";
        System.out.println("the longest palindrome substring is " + findPalindrome(s));
    }

    private static int findPalindrome(String s) {
        int matrix[][] = new int[s.length()][s.length()];
        String ans= ""+s.charAt(0);
        // setting the diagonal so that from next iteration dynamic algorithm can be applied
        for(int i=0; i<matrix.length; i++)
            matrix[i][i] = 1;
        // setting matrix for length of 2 sub strings

        for(int j=0; j<matrix.length-1; j++){
            if(s.charAt(j)==s.charAt(j+1)) {
                matrix[j][j + 1] = 2;
                ans = s.substring(j, j + 2);
            }
            else
                matrix[j][j+1] = 0;
        }
        // display matrix
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }

        for(int i=2; i<s.length(); i++){
            for(int j=0; j+i<s.length(); j++){
                if(s.charAt(j)==s.charAt(j+i) && matrix[j+1][j+i-1]!=0) {
                    matrix[j][j+i] = matrix[j + 1][j+i - 1] + 2;
                    ans = s.substring(j, j + i + 1);
                }
                else
                    matrix[j][j+i] = 0;
            }
        }
        System.out.println("-----------------------------");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
        System.out.println(ans);
        return ans.length();
    }
}
