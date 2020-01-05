package Threads;

public class ProducerConsumerTest {

    public static void main(String[] args) {
        Resource res = new Resource();
        Producer p = new Producer(res);
        p.start();
        Consumer c = new Consumer(res);
        c.start();
    }
}
