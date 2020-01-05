package Threads;

public class Producer extends Thread {
    Resource res;

    public Producer(Resource res){
        this.res = res;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            res.produce(i);
        }
    }
}
