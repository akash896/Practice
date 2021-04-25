package scheduler;

import java.util.Comparator;

public class SortForSjf implements Comparator<Jobs> {
    @Override
    public int compare(Jobs t1, Jobs t2) {
        if(t1.duration - t2.duration == 0){
            return t1.priority - t2.priority;
        }
        else
            return t1.duration - t2.duration;
    }
}
