package Structural.Bridge;

public class WebsiteProgram extends Program{

    public WebsiteProgram(Developer developer){
        super(developer);
    }
    @Override
    public void developeProgram() {
        System.out.println("WebsiteProgram creating. . .");
        developer.writeCode();
    }
}
