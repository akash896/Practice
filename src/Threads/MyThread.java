package Threads;

public class MyThread implements Runnable {

    @Override
    public  void run(){
        System.out.println(Thread.currentThread().getName() + " is here ");
        for(int i=0; i<20;i++)
            System.out.println(Thread.currentThread().getName() + ": " + i);
    }
}

