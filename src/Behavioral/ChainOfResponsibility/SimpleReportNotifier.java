package Behavioral.ChainOfResponsibility;

public class SimpleReportNotifier extends Notifier{
    public SimpleReportNotifier(int priority){
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending simple report notifier. . . " + message);
    }

}
