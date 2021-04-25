package testpack;

import java.util.*;

public class soln {


    public static void main(String[] args) {
        System.out.println(maxPerformance(6, new int[]{2,10,3,1,5,8}, new int[]{5,4,3,9,7,2}, 3));
//        System.out.println(removePalindromeSub("ababa"));
    }

    public static int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int i=0; i<speed.length; i++){
            int div = Math.abs(speed[i] - efficiency[i])==0?1:Math.abs(speed[i] - efficiency[i]);
            map.put((speed[i]*efficiency[i]*efficiency[i]*efficiency[i]/div), i);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.reverse(list);
        int sum = 0;
        int min = efficiency[list.get(0)];

        for(int i=0; i<k; i++){
            sum += speed[list.get(i)];
            if(min > efficiency[list.get(i)])
                min = efficiency[list.get(i)];
        }
        return sum*min;
    }

    public static int removePalindromeSub(String s) {
        int count=0;
        if(s.equals(""))
            return 0;
        for(int i=0; i<s.length(); i++){
            for(int j=s.length(); j>=i; j--){
                if(isPalindrome(s.substring(i, j))){
                    count++;
                    s = s.substring(0, i+1) + s.substring(j-1);
                    return count + removePalindromeSub(s);
                }
            }
        }
        return count;
    }

    public static boolean isPalindrome(String s){
        StringBuffer b = new StringBuffer(s);
        String k = b.reverse().toString();
        if(k.equals(s))
            return true;
        else
            return false;
    }
}
