package Generics;

public class PrinElement<T> {
    T value;
    public PrinElement(T value){
        this.value = value;
    }

    public <E, F> void show(E e1, F f1, PrinElement<String> ob1){
        System.out.println("E class object value = " + e1);
        System.out.println("F class object value = " + f1);
        System.out.println("E class object value = " + value);
    }
}
