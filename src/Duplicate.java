import java.util.ArrayList;
import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        System.out.println(solution("baaabbaabbba"));
    }

    private static int solution(String s) {
        List<Integer> list = new ArrayList<Integer>();
        int c = 1;
        char k = s.charAt(0);
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==k) {
                c++;

            }
            else {
                list.add(c);
                c = 1;
                k = s.charAt(i);
            }
        }
        list.add(c);
        //System.out.println(list);
int f=0;
        for(Integer p : list){
            if(p>=3)
                f=1;
        }
        if(f==0)
            return 0;
int m=0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>=3){
                if(list.get(i-1) < list.get(i+1)){
                    m++;
                }
            }
        }

        return 0;
    }

}
