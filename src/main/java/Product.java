public class Product
{
    //Nome
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Descricao
    private String description;

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //DescricaoDetalhada

    private String descriptionDetail;

    public String getDescriptionDetail() {
        return descriptionDetail;
    }
    public void setDescriptionDetail(String descriptionDetail) {
        this.descriptionDetail = descriptionDetail;
    }

    //imagem
    private String picture;

    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }

    // categoria
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    //TESTE - adicionar classe brand a classe produto
    private Brand brand;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

//  nome e cor de classe categoria

    public Category getColor()
    {
        return getColor();
    }
    public Category getname()
    {
        return getname();
    }

    //--------------
    // preco
    private Double price;

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    // tipo de unidade
    private Double unityType;

    public Double getUnityType() {
        return unityType;
    }
    public void setUnityType(Double unityType) {
        this.unityType = unityType;
    }

    //construtores

    public Product(String name, String description, String descriptionDetail, String picture, Category category, Brand brand, Double price, Double unityType) {
        this.name = name;
        this.description = description;
        this.descriptionDetail = descriptionDetail;
        this.picture = picture;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.unityType = unityType;
    }
}
