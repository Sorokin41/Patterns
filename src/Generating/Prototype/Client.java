package Generating.Prototype;

public class Client {
    public static void main(String[] args) {
        Project project = new Project(1, "MasterProject", "Project source 1");
        System.out.println(project.toString());

        System.out.println("\n ============================ \n");
         ProjectFactory factory = new ProjectFactory(project);
         Project secondProject = factory.cloneProject();

        System.out.println(secondProject.toString());
    }
}
