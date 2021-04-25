package scheduler;

import java.util.ArrayList;
import java.util.*;

public class SchedulerClass {

    static List<Jobs> jobs = new ArrayList<Jobs>();

    public static void main(String[] args) {
        jobs.add(new Jobs("J1", 10, 0, 10, 0));
        jobs.add(new Jobs("J2", 20, 0, 40, 1));
        jobs.add(new Jobs("J3", 15, 2, 40, 0));
        jobs.add(new Jobs("J4", 30, 1, 40, 2));
        jobs.add(new Jobs("J5", 10, 2, 30, 2));
        Algorithm fcfs = new Algorithm(jobs, 2);
        System.out.println(fcfs.start(0));
//
        List<Jobs> jobssjf = new ArrayList<>(jobs);
        Collections.sort(jobssjf, new SortForSjf());
        Algorithm sjf = new Algorithm(jobssjf, 2);
        System.out.println(sjf.start(0));

        List<Jobs> jobsfps = new ArrayList<>(jobs);
        Collections.sort(jobsfps, new SortForFps());
        Algorithm fps = new Algorithm(jobsfps, 2);
        System.out.println(fps.start(0));

        List<Jobs> jobsedt = new ArrayList<>(jobs);
        Collections.sort(jobsedt, new SortJobsForEdt());
        Algorithm edt = new Algorithm(jobsedt, 2);
        System.out.println(edt.start(2));

        // deadlineFlag = 0 means job can start before deadline and after deadline.
        // deadlineFlag = 1 means job has to start before deadline
        // deadlineFlag = 2 means job has to end before deadline
    }
}
