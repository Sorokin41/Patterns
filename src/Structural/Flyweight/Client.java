package Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactory();
        List<Developer> developers = new ArrayList<>();

        developers.add(factory.getDeveloperBySpecialty("Java"));
        developers.add(factory.getDeveloperBySpecialty("Java"));
        developers.add(factory.getDeveloperBySpecialty("Java"));
        developers.add(factory.getDeveloperBySpecialty("Java"));
        developers.add(factory.getDeveloperBySpecialty("Java"));
        developers.add(factory.getDeveloperBySpecialty("Java"));
        developers.add(factory.getDeveloperBySpecialty("Cpp"));
        developers.add(factory.getDeveloperBySpecialty("Cpp"));
        developers.add(factory.getDeveloperBySpecialty("Cpp"));
        developers.add(factory.getDeveloperBySpecialty("Cpp"));
        developers.add(factory.getDeveloperBySpecialty("Cpp"));


        for (Developer current : developers){
            if (current != null)
            current.writeCode();
        }
        System.out.println(factory.developers.toString());
    }
}
