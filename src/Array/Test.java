package Array;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
//        int A[] = new int[]{1,1,1,1,1,1,2,2,2,3,3,4};
//        Map<Integer, Integer> map = new HashMap<>();
//        int big = 0, small = A.length;
//        for(int i=0 ; i<A.length;i++){
//            if(map.containsKey(A[i]))
//                map.put(A[i], map.get(A[i])+1);
//            else
//                map.put(A[i], 1);
//        if(map.get(A[i]) > big)
//            big = map.get(A[i]);
//        if(map.get(A[i]) < small)
//            small = map.get(A[i]);
//        }
//        System.out.println(big - small);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,0);
        System.out.println(map.get(1));
        map.put(1,1);
        System.out.println(map.get(1));
        map.put(1,2);
        System.out.println(map.get(1));



    }
}
