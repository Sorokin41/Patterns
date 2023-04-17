package Structural.Facade;

public class BugTracker {
    public boolean activeSprint;

    public void startSprint(){
        System.out.println("Sprint is active. . .");
        activeSprint = true;
    }

    public void finishSprint(){
        System.out.println("Sprint is not active. . .");
        activeSprint = false;
    }

    public boolean isActiveSprint(){
        return activeSprint;
    }
}
