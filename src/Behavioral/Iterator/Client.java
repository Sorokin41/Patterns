package Behavioral.Iterator;

public class Client {
    public static void main(String[] args) {
        String name = "Vladislav Sorokin";
        String[] skills = {"Java", "Spring", "Java Core", "MySQL", "JUnit", "Maven"};

        Developer developer = new Developer(name, skills);

        Iterator iterator = developer.getIterator();

        System.out.println("Developer's name: " + developer.getName());
        System.out.print("Developer's skills: ");

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }
}
