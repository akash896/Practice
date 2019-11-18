package Threads;

public class Count {
    public static void main(String[] args) {

        for(int i=1;i<=100;i++){
            new T(i).run();
        }
    }
}



