package Behavioral.Strategy;

public class Client {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();
    }
}
