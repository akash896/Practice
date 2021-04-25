package Array;

import java.util.ArrayList;

// imagine there are petrol pumps with petrol it has 'x' and distance to the nest petrol pump'y' P(x,y).
// Aim is to find the paths which will cover all pumps in circcular fashion.
public class CoverPetrolPumps {

    public static void main(String[] args) {
        int A[][] = new int[][]{{10,8}, {8,10}, {5,1}, {2,6}, {10,1}, {1,10}};
//        for(int i=0;i<A.length;i++) {
//            for (int j = 0; j < 2; j++)
//                System.out.print(A[i][j] + " ");
//            System.out.println();
//        }
        findPaths(A);
    }

    private static void findPaths(int[][] A) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = A.length;
        int j, petrol = 0, distance = 0;
        for(int i = 0; i<n; i++) {
            petrol = distance= 0;
            int pos = i;
            ans.removeAll(ans);
            for (j = 0; j<n; j++) {
                petrol = petrol + A[pos%n][0];
                if (petrol >= A[pos%n][1]) {
                    ans.add(pos%n);
                    pos++;
                }
                else
                    break;
            }
            if(ans.size()==n){
                for(Integer a:ans)
                    System.out.print(a + " ");
                System.out.println();
            }
        }
    }
}
