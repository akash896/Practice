package Array;

import Trees.CompleteTree;
import Trees.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Test extends CompleteTree implements Animls, Work{
    int k=0;
    public void show(Object a) {
        System.out.println("legs ");
    }

    public void show2() {
        System.out.println("legs ");
    }

    public static void main(String[] args) {
               Test t = new Test();
               Object a= t;
               t.show(t);
               List<Object> arr = new ArrayList<>();
               arr.add("adc");
               arr.add(5);
        Integer l = (Integer)arr.get(0);



    }
}
