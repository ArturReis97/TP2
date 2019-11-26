public class Category
{
    // Nome categoria
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // descricao categoria
    private String description;

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // cor categoria
    private String color;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


    //Construtores

    public Category(String name, String description, String color) {
        this.name = name;
        this.description = description;
        this.color = color;
    }
}
