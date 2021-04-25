package HackerEarth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 100);
        map.put(20, 200);
        map.put(3, 300);
        map.put(40, 400);
        map.put(5, 500);
        map.put(6, 600);

        Collection<Integer> value =  map.values();
        ArrayList<Integer> list = new ArrayList<Integer>(value);
        Collections.sort(list);

        for(Integer i:list) {
            //System.out.println(i);
        }

    Set<Integer> set = new HashSet<Integer>();
    set.add(1);set.add(2);set.add(3);set.add(4);set.add(5);
    ArrayList<Integer> list2 = new ArrayList<Integer>(set);list2.add(2);
    list2.remove(new Integer(2));
        System.out.println(list2+"==>");
    Integer k[] = new Integer[5];
            list2.toArray(k);
        //System.out.println(Arrays.toString(k));
        //System.out.println(Integer.toString(123));

        Stack<Integer> st = new Stack<Integer>();
        st.push(1);st.push(2);st.push(3);st.push(4);st.push(5);
        Integer arr[] = new Integer[5];
        st.toArray(arr);
        Collections.reverse(list);
        list = new ArrayList<Integer>(list.subList(0,2));
        System.out.println(list + "\\\"");
        System.out.println(-22%3);
        
    }
}
