package Threads.deadlock;

public class Thread1 implements Runnable{
    Deadlock ob1, ob2;

    public Thread1(Deadlock ob1, Deadlock ob2){
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    @Override
    public void run(){
        synchronized (ob1){
            System.out.println("Thread1 aquired by lock ob1 ");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        synchronized (ob2){
            System.out.println("thread1 aquired lock ob2");
        }
    }
}
