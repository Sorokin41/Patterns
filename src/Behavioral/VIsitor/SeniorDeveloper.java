package Behavioral.VIsitor;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(Database database) {
        System.out.println("Fixing database. . .");
    }

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing senior class. . .");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating senior test. . .");
    }
}
