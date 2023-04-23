package Behavioral.VIsitor;

public class Database implements ProjectElement{
    @Override
    public void BeWritten(Developer developer) {
        developer.create(this);
    }
}
