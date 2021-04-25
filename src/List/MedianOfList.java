package List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MedianOfList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        List<Integer> list = new ArrayList<Integer>();
        while((s=br.readLine())!=null && s.length()!=0){
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);
        int mid = list.size();
        if(mid%2==1)
            System.out.println(list.get(mid/2));
        else{
            mid = mid/2;
            Double d = new Double(list.get(mid));
            d = d + new Double(list.get(mid-1));
            d = d/2;
            System.out.println(d);
        }
    }


}
