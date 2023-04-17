package Structural.Proxy;

public class RealProject implements Project{
    private String url;

    public RealProject(String url){
        this.url = url;
    }

    public void load(){
        System.out.println("Loading project from: " + url + ". . .");
    }
    @Override
    public void run() {
        System.out.println("Running loading project: " + url + ". . .");
    }
}
