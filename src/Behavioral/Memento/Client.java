package Behavioral.Memento;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo git = new GithubRepo();

        System.out.println("Creating new project: Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project + "\n");

        System.out.println("Saving current version to gitHub. . .");

        git.setSave(project.save());

        System.out.println("Updating project to Version 1.1");
        System.out.println("Writing some code. . .");
        Thread.sleep(5000);
        project.setVersionAndDate("Version 1.1");
        System.out.println(project + "\n");

        System.out.println("Something went wrong. . .");

        System.out.println("Loading old version . . .");

        project.load(git.getSave());

        System.out.println(project + "\n");


    }
}
