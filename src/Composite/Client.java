package Composite;

public class Client {
    public static void main(String[] args) {
        Team team = new Team();
        team.addDeveloper(new CppDeveloper());
        team.addDeveloper(new JavaDeveloper());
        team.addDeveloper(new CppDeveloper());

        team.createProject();
    }
}
