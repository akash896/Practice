package Threads;

public class Resource {
    boolean available;

    public synchronized void produce(int i){
        if(available==true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Produced item "+i);
        available = true;
        notify();
    }

    public synchronized void consume(int i){
        if(available==false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed item "+i);
        available = false;
        notify();
    }
}
