package Generating.Prototype;

public class Project implements Copyable {
    private int id;
    private String name;
    private String source;

    public Project(int id, String name, String source) {
        this.id = id;
        this.name = name;
        this.source = source;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public Object copy() {
        Project copyProject = new Project(id, name, source);
        return copyProject;
    }

    public String toString(){
        return "This project = (id = " + id + ", name = " + name + ", source = " + source + ")";
    }
}
