package Facade;

public class WorkFlow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
