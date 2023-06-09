package Structural.Decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator{

    public SeniorJavaDeveloper(Developer developer){
        super(developer);
    }

    public String makeCodeReview(){
        return "SeniorJavaDeveloper make code review. . .";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
