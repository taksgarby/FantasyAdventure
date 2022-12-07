package tools;

public abstract class Tool {

    private String name;
    private String description;

    public Tool(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

}
