package Threads;
public class T implements Runnable{
    int c;

    public T(int c) {
        this.c = c;
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"   "+c);
    }

}
