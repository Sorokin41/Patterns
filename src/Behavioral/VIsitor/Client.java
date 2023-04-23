package Behavioral.VIsitor;

public class Client {
    public static void main(String[] args) {
        Project project = new Project();
        Developer juniorDeveloper = new JuniorDeveloper();
        Developer seniorDeveloper = new SeniorDeveloper();

        System.out.println("Junior developer working. . .");
        project.BeWritten(juniorDeveloper);
        System.out.println("\n========================================\n");
        System.out.println("Senior developer working. . .");
        project.BeWritten(seniorDeveloper);
    }
}
