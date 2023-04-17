package Behavioral.ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Notifier firstNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier secondNotifier = new SMSNotifier(Priority.ASAP);
        Notifier thirdNotifier = new SimpleReportNotifier(Priority.ROUTINE);


        firstNotifier.setNextNotifier(secondNotifier);
        secondNotifier.setNextNotifier(thirdNotifier);

        firstNotifier.notifyManager("Everything is OK!", Priority.ROUTINE);
        firstNotifier.notifyManager("Something went wrong!", Priority.IMPORTANT);
        firstNotifier.notifyManager("lll", Priority.ASAP);

    }
}
