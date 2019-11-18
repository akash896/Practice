package Others;

import java.util.Scanner;
// combination operation problem
public class CalculationPossible {
    int array[];
    String result;
    int start;
    int helper;
    boolean status;

    CalculationPossible() {
        this.array = new int[5];
        for (int i = 0; i < 5; i++)
            this.array[i] = 4;
        this.result = "";
        this.start = 0;
        this.helper = 0;
        this.status = false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        CalculationPossible ob = new CalculationPossible();
        ob.findCombinations(ob, num);
        if (ob.status == true)
            System.out.println("Yes possible ");
        else
            System.out.println("Not possible ");
    }

    public void findCombinations(CalculationPossible ob, int num) {
        if (ob.helper == num) {
            System.out.println(ob.result);
            ob.status = true;
        }
        if (ob.start >= ob.array.length)
            return;

        add(ob, num);
        int s1 = ob.helper;
        substract(ob, num, s1);
    }

    public void add(CalculationPossible ob, int num) {
        if (ob.helper > num)
            return;
        if (ob.start < ob.array.length) {
            ob.helper = ob.helper + ob.array[ob.start++];
            ob.result = ob.result + "+ 4 ";
            findCombinations(ob, num);
        }
    }

    public void substract(CalculationPossible ob, int num, int s1) {
        if(ob.start >= ob.array.length)
            return;
        if (ob.start < ob.array.length) {
            ob.helper = s1 - ob.array[ob.start++];
            ob.result = ob.result + "- 4 ";
            findCombinations(ob, num);
        }
    }

    /*public static void main(String[] args) {
        int A[] = new int[]{4,4,4,4,4};
        int sum = 0;
        int num = 16;
        String s = "4 ";
        findCombination(A,  1, sum, s, num);
    }

    public static void findCombination(int A[], int start, int sum, String s, int num){
        if(sum  == num){
            System.out.println(s);
            return;
        }
        int add = addOp(A, start, sum, s, num);
        int sub = subOp(A, start, add, s, num);
    }

    public static void addOp(int A[], int start, int sum, )*/
}

