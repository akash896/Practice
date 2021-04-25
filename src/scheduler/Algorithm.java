package scheduler;
import java.util.*;

public class Algorithm {
    List<Jobs> jobList = new ArrayList<Jobs>();
    int threads;

    public Algorithm(List<Jobs> jobList, int threads) {
        this.jobList = jobList;
        this.threads = threads;
    }

    public List<List<String>> start(int deadlineFlag){
        List<List<String>> result = new ArrayList<List<String>>();
        int jobExecuted = 0;
        int finished[] = new int[threads];
        int i=0;
        while (jobExecuted < threads && jobExecuted < jobList.size()) {
            List<String> row = new ArrayList<String>();
            finished[jobExecuted] = performJob(jobList.get(jobExecuted), 0, deadlineFlag);
            row.add(jobList.get(jobExecuted).name);

            result.add(row);
            jobExecuted++;
        }

        while(jobExecuted < jobList.size()) {
//            for(int p:finished)
//                System.out.print(p + " ");
//            System.out.println();

            int min = finished[0];
            int index = 0;
            for(int j=1; j<threads; j++){
                if(finished[j] < min){
                    min = finished[j];
                    index = j;
                }
            }
            //System.out.println("min = " + finished[index]);
            finished[index] = performJob(jobList.get(jobExecuted), min, deadlineFlag);
                if(finished[index]!=-1)
                result.get(index).add(jobList.get(jobExecuted).name);

            jobExecuted++;
        }
    return result;
    }

    public int performJob(Jobs job, int startTime, int deadlineFlag){
//        System.out.println(job.duration + " " + job.deadline);
        int end = -1;
        if(deadlineFlag == 2){
            if(startTime+job.duration <= job.deadline)
                end = startTime + job.duration;
        }
        if(startTime <= job.deadline && deadlineFlag==1){
            end = startTime + job.duration;
        }
        if(deadlineFlag==0)
            end = startTime + job.duration;
        return end;
    }

}
