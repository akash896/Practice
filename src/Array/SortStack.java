package Array;

import java.util.Stack;

/*Problem is to sort a stack with elements using another stack*/
public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(6);
        s1.push(5);
        s1.push(4);
        s1.push(9);
        s1.push(8);
        s1.push(7);
        s1.push(3);
        s1.push(2);
        s1.push(1);
        //System.out.println(s1.peek());
        //System.out.println(s1.pop());
        sort(s1, s2);
    }

    public static void sort(Stack s1, Stack s2){
        while(!s1.isEmpty()){
            if(s2.isEmpty())
                s2.push(s1.pop());
            else{
                Integer e1, e2;
                e1 = (Integer)s1.pop();
                if(e1 > (Integer)s2.peek()){
                    s2.push(s2.pop());
                    s2.push(e1);
                }
                else{
                    while(e1 < (Integer)s2.peek()){
                        s1.push(s2.pop());
                    }
                    s2.push(e1);
                }
            }
            System.out.println("s1 = "+ s1.toString());
            System.out.println("s2 = "+ s2.toString());

        }
    }
}
