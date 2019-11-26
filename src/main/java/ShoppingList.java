
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShoppingList {

    private String name;
    //Declaramos o user usando a heranca da classe User
    private User User;
    //Declaramos um arrayList user da classe User
    //private User userList ;


    //Declarar Lista utilizador
    private List<User> UserList = new ArrayList<>();

        public List<User> getUserList() {
        return UserList;
    }
    public void setUserList(List<User> userList) {
        this.UserList = userList;
    }
    // Para Adicionar um objeto (User) a lista User
    public void AddUser(User user) {
        getUserList().add(user);
    }
    //Declarar Lista produtos 1
    private List<Product> ProductList1 = new ArrayList<>();

    public List<Product> getProductList1() {
        return ProductList1;
    }

    public void setProductList1(List<Product> productList1) {
        this.ProductList1 = productList1;
    }
    // Para Adicionar um objeto (produto) a lista 1
    public void AddProduct(Product produto) {
        getProductList1().add(produto);
    }

    // Total de produtos da lista 1  (fora do carrinho)
    public Integer getTotalOfProducts()
    {
        return getProductList1().size();
    }
    //total preco da lista 1 ( ) nao esta feito
    public double GetTotalPrice()
    {
        double total=0.0;
        //total = getProductList1();

        // for (int i=0; i<getProductList1().size(); i++)
        // {
        //  total = total + getProductList1().getP
        //}


        return total;
    }

    //Declarar Lista produtos 2
    private List<Product> ProductList2 = new ArrayList<>();

    public List<Product> getProductList2() {
        return ProductList2;
    }

    public void setProductList2(List<Product> productList2) {
        this.ProductList2 = productList2;
    }
    // Para Adicionar um objeto (produto) a lista 2 (no carrinho)
    public void AddProductOnCart(Product produto) {
        getProductList2().add(produto);
    }
    // Total de produtos da lista 2 ( no carrinho)
    public Integer getTotalOfProductsOnShoppingCart()
    {
        return getProductList2().size();
    }

    // Calcular a percentagem total das listas
    public double GetPercentageCompleted()
    {
        double percentagem = 0.0;
        double list1= getProductList1().size();
        double list2= getProductList2().size();
        percentagem = list2 / (list1 + list2);
        return percentagem * 100;
    }

// construtores

    public ShoppingList(String name, User user) {
        this.name = name;
        this.User = user;
    }

    //Get & set Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Get & set User
    public User getUser() {
        return User;
    }

    public void setUser(User user) {
        User = user;
    }


    // Imprimir
    @Override
    public String toString() {
        return "Listname " + getName() + "\n" +
                "TotalProdutos " + getTotalOfProducts() + "\n" +
                "TotalProdutosNoCarrinho " + getTotalOfProductsOnShoppingCart() + "\n" +
                "percentagemofComplete " + GetPercentageCompleted()

                ;
    }
}
/* GetList Name -> V
getUserName
GetPercentageCompleted -> V
GetTotalOfProducts -> V
GetTotalOfProductsOnShoppingCart -> V
Get TotalPrice
Get TotalPrice On Cart

*/