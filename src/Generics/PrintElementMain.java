package Generics;

public class PrintElementMain {
    public static void main(String[] args) {
        PrinElement<String> ob1 = new PrinElement<String>("Akash");
        ob1.show(new Integer(5), new Character('A'),  ob1);
    }
}
