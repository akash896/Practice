package Threads.deadlock;

public class Thread2 extends Thread{
    Deadlock ob1, ob2;

    public Thread2(Deadlock ob1, Deadlock ob2){
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    @Override
    public void run(){
        synchronized (ob2){
            System.out.println("Thread2 aquired by lock  ob2 ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        synchronized (ob1){
            System.out.println("thread2 aquired lock ob1");
        }
    }
}
