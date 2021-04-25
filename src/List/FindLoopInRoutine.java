package List;
/* Aim is to find loops in routine. 1=loop present 0=loop not present
Input: A -> B
100 -> 6
99 -> 7
34 -> 55
6 -> 55
7 -> 74
55 -> 16
16 > 100
 */

import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class FindLoopInRoutine {
    public static void main(String[] args) throws IOException {
        Integer a, b;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> key = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        String line[] = br.readLine().split(" ");
        a = Integer.parseInt(line[0]);
        b = Integer.parseInt(line[2]);
        map.put(a, b);
        key.add(a);

        while ((s = br.readLine()) != null && s.length()!=0){
            line = br.readLine().split(" ");
            a = Integer.parseInt(line[0]);
            b = Integer.parseInt(line[2]);
            key.add(a);
            map.put(a, b);
        }
        map.put(b,null);

        for(Integer j:map.keySet())
            System.out.println(j +"-> "+ map.get(j));


        int flag=0;
        for(int k:key){
            Integer p=k;
            while(p!=null){
                p = map.get(p);
                if(p!=null && p==k)
                    flag=1;
            }
        }
        System.out.println(flag);

    }
}
