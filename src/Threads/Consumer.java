package Threads;

public class Consumer extends  Thread{

    Resource res;

    public Consumer(Resource res){
        this.res = res;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            res.consume(i);
        }
    }
}
