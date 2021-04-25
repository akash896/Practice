package testpack;

import java.util.LinkedList;

public class ArrayCallByReference {
    public static void main(String[] args) {
        int A[] = new int[]{1,2,3};
        System.out.println(-8%3);
        func(A);
        for (int i:A) {
            System.out.println(i);
        }
    }

    private static void func(int[] A) {
        A[0] = 10;
        String s = "akash";
        System.out.println(s.indexOf('k'));
        LinkedList<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        System.out.println(a);
    }

}
