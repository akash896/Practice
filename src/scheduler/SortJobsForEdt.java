package scheduler;

import java.util.Comparator;

public class SortJobsForEdt implements Comparator<Jobs> {
    @Override
    public int compare(Jobs t1, Jobs t2) {
        if(t1.deadline - t2.deadline != 0){
            return t1.duration - t2.duration;
        }
        else{
            if(t1.priority - t2.priority != 0)
                return t1.priority - t2.priority;
            else{
                return t1.duration - t2.duration;
            }
        }
    }
}
