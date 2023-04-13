package Facade;
public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("Developer write code. . .");
        } else {
            System.out.println("Developer is reading Habr. . .");
        }

    }
}
