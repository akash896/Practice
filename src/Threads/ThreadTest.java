package Threads;

public class ThreadTest{

    public static void main(String[] args) throws InterruptedException {
        Runnable myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        Thread thread3 = new Thread(myThread);

        thread1.setName("Thread1");
        thread2.setName("Thread2");
        thread3.setName("Thread3");

        thread1.start();
        thread1.wait();
        thread2.start();
        thread2.wait();
        thread3.start();



    }

}
