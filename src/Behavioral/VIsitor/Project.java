package Behavioral.VIsitor;

public class Project implements ProjectElement{
    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new Test(),
                new Database()
        };
    }
    @Override
    public void BeWritten(Developer developer) {
        for (ProjectElement element: projectElements)
            element.BeWritten(developer);
    }
}
