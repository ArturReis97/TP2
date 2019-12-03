public class Brand
{
    // Teste - variavel nome

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // TESTE - variavel id

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

//construtor

    public Brand(String name, int id) {
        this.name = name;
        this.id = id;
}
