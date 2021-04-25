package dynamic;

public class KMPSubstring {
    public static void main(String[] args) {
        String text = "abxabcabcaby";
        String pattern = "abcaby";
        //kmp(text, pattern);
        System.out.println(kmp(text, pattern));
    }

    private static int kmp(String text, String pattern) {
        int help[] =  findprefix(pattern);
        for (int i:help) { System.out.print(i+" "); }
        System.out.println();
        int i, j = 0;
        for(i=0;i<text.length() && j<pattern.length(); i++){
            if(text.charAt(i) == pattern.charAt(j))
                j++;
            else{
                if(j!=0) {
                    j = help[j - 1];
                    i--;
                }
            }
        }
        if(j == pattern.length()) {
            System.out.println("pattern found ");
            return i - j;
        }
        else
            return -1;
    }

    private static int[] findprefix(String pattern) {
        int A[] = new int[pattern.length()];
        int j = 0;
        A[0] = 0;
        for(int i = 1; i<pattern.length(); i++){
            if(pattern.charAt(i) == pattern.charAt(j)){
                A[i] = j+1;
                j++;
            }
            else{
                if(j!=0)
                    j = A[j-1];
            }
        }
        return A;
        /*for (int i:A) { System.out.print(i+" "); }*/
    }

}
