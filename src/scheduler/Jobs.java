package scheduler;

public class Jobs {
    String name;
    int duration;
    int priority;
    int deadline;
    int user;

    public Jobs(String name, int duration, int priority, int deadline, int user) {
        this.name = name;
        this.duration = duration;
        this.priority = priority;
        this.deadline = deadline;
        this.user = user;
    }
}
