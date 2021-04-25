package Others;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayObject implements Delayed{
    private int value;
    private long time;

    // Contructor of DelayObject
    public DelayObject(int value, long delayTime)
    {
        this.value = value;
        this.time = System.currentTimeMillis()
                + delayTime;
    }

    // Implementing getDelay() method of Delayed
    @Override
    public long getDelay(TimeUnit unit)
    {
        long diff = time - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    // Implementing compareTo() method of Delayed
    @Override
    public int compareTo(Delayed obj)
    {
        if (this.time < ((DelayObject)obj).time) {
            return -1;
        }
        if (this.time > ((DelayObject)obj).time) {
            return 1;
        }
        return 0;
    }

    // Implementing toString() method of Delayed
    @Override
    public String toString()
    {
        return "\n{"
                + "value=" + value
                + ", time=" + time
                + "}";
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<DelayObject> DQ = new DelayQueue<DelayObject>();
        DQ.add(new DelayObject(100, 1000));
        DQ.add(new DelayObject(200, 3000));
        DQ.add(new DelayObject(300, 2000));
        DelayObject obj1 = new DelayObject(400, 4000);
        DQ.add(obj1);
        Thread.sleep(1000);
        DQ.remove(obj1);
        DelayObject obj2 = new DelayObject(400, 1500);
        DQ.add(obj2);


        System.out.println(DQ.take());
        System.out.println(DQ.take());
        System.out.println(DQ.take());
        System.out.println(DQ.take());
    }
}
