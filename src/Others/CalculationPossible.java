package Others;

import java.util.Scanner;

// combination operation problem
// does only combination possible for addition and substraction

public class CalculationPossible {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        CalculationPossible ob = new CalculationPossible();
        ob.findCombinations(4, 1, 5, num, "4 ");
    }

    public void findCombinations(int sum, int s, int d, int num, String res) {
        if (sum == num) {
            System.out.println(res);
        }
        if (s >= d)
            return;
        multiply(sum, s, d, num, res);
        add(sum, s, d, num, res);
        substract(sum, s, d, num, res);
        divide(sum, s, d, num, res);
        concatenation(sum, s, d, num, res);
        //factorial(sum, s, d, num, res);
    }

    public void add(int sum, int s, int d, int num, String res) {
        if (s < d) {
            sum = sum + 4;
            res = res + "+ 4 ";
            findCombinations(sum, s + 1, d, num, res);
        }
    }

    public void substract(int sum, int s, int d, int num, String res) {
        if (s < d) {
            sum = sum - 4;
            res = res + "- 4 ";
            findCombinations(sum, s + 1, d, num, res);
        }
    }

    public void multiply(int sum, int s, int d, int num, String res) {
        if (s < d) {
            sum = sum * 4;
            res = res + "* 4 ";
            findCombinations(sum, s + 1, d, num, res);
        }
    }

    public void divide(int sum, int s, int d, int num, String res) {
        if (s < d) {
            sum = sum / 4;
            res = res + "/ 4 ";
            findCombinations(sum, s + 1, d, num, res);
        }
    }

    public void concatenation(int sum, int s, int d, int num, String res) {
        if (s < d) {
            sum = sum * 10 + 4;
            res = res + "|| 4 ";
            findCombinations(sum, s + 1, d, num, res);
        }
    }
}

//    public void factorial(int sum, int s, int d, int num, String res) {
//        if (s < d) {
//            sum = sum + 4;
//            res = res + "+ 4 ";
//            findCombinations(sum, s+1, d, num, res);
//        }


