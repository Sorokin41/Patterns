package Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = developers.get(specialty);
        if (developer == null) {
            switch (specialty) {
                case "Java":
                    System.out.println("Creating new JavaDeveloper");
                    developer = new JavaDeveloper();
                    break;
                case "Cpp":
                    System.out.println("Creating new CppDeveloper");
                    developer = new CppDeveloper();
            }
        }
        developers.put(specialty,developer);
        return developer;
    }
}
