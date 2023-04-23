package Behavioral.VIsitor;

public class Test implements ProjectElement{
    @Override
    public void BeWritten(Developer developer) {
        developer.create(this);
    }
}
