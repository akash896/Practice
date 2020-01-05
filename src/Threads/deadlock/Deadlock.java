package Threads.deadlock;

import Threads.Resource;

public class Deadlock{

    public static void main(String[] args) {
        Deadlock ob1 = new Deadlock();
        Deadlock ob2 = new Deadlock();
        Runnable r = new Thread1(ob1, ob2);
        Thread t1 = new Thread(r);
        t1.start();

        Thread t2 = new Thread2(ob1, ob2);
        t2.start();
    }
}
