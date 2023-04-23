package Behavioral.VIsitor;

public class ProjectClass implements ProjectElement{
    @Override
    public void BeWritten(Developer developer) {
        developer.create(this);
    }
}
