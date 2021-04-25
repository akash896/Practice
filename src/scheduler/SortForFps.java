package scheduler;

import java.util.Comparator;

public class SortForFps implements Comparator<Jobs> {
    @Override
    public int compare(Jobs t1, Jobs t2) {
        if(t1.priority - t2.priority != 0)
            return t1.priority - t2.priority;
        else{
            if(t1.user - t2.user != 0)
                return t1.user - t2.user;
            else{
                if(t1.duration > t2.duration)
                    return -1;
                else
                    return 1;
            }
        }
    }
}
