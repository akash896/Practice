package Array;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LRUPageReplacement {

    static int A[] = new int[]{1,3,2,4,3,2,1,5,7,9,6,2,1};
    static int frame[] = new int[3];
    static int f = 3;
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) {

        for(int i=0 ; i<A.length; i++){
            if(findPage(A[i])){
                display("Hit ");
            }
            else{
                if(q.size()<f) {
                    q.add(A[i]);
                    display("Miss");
                }

                else{
                    q.remove();
                    q.add(A[i]);
                    display("Miss");
                }
            }
        }
    }// main ends

    public static boolean findPage(int a){
        for(int i : q){
            if(i == a)
                return true;
        }
        return false;
    }

    public static void display(String s){
        for(int i : q)
            System.out.print(i + " ");
        System.out.print("   "+ s);
        System.out.println();
    }


}// class ends



