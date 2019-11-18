package Array;

public class ParenthesisCombination {
     static  int n = 2;
    static char str[] = new char[2*n];
    public static void main(String[] args) {


        parenthesis(0,n,0,0);

    }

    public static void parenthesis(int pos, int n, int open, int close) {
        if(close==n){
            for(int i=0;i<str.length;i++)
                System.out.print(str[i]+" ");
            System.out.println();
        }

        if(open < n) {
            str[pos] = '(';
            parenthesis(pos + 1, n, open+1, close);
        }
        if(close<open){
            str[pos] = ')';
            parenthesis(pos+1, n, open, close+1);
        }
    }
}