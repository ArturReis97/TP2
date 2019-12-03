import java.util.ArrayList;

public class Main {





    public static void main(String args[]) {

//List<String> UserList = List.of("jose","joana","jessica");

        User Ze = new User("1","2","3","4",new Address("baba",1,"33"));
        User Ztura = new User("1","2","3","4",new Address("baba",1,"33"));
        User tesp = new User("1","2","3","4",new Address("baba",1,"33"));
        // teste - novo utilizador
        User joao = new User ("1", "2","", "4", new Address("baba", 1, "33"));
//
        Product produto1 = new Product("2","3","este produto e x","1", new Category("ola","ban","cor"),1.0,2.0);
        Product produto2 = new Product("2","3","este produto e x","1", new Category("ola","ban","cor"),1.0,2.0);
        Product produto3 = new Product("2","3","este produto e x","1", new Category("ola","ban","cor"),1.0,2.0);
        Product produto4 = new Product("2","3","este produto e x","1", new Category("ola","ban","cor"),1.0,2.0);
        Product produto5 = new Product("2","3","este produto e x","1", new Category("ola","ban","cor"),1.0,2.0);
        Product produto6 = new Product("2","3","este produto e x","1", new Category("ola","ban","cor"),1.0,2.0);
        Product produto7 = new Product("2","3","este produto e x","1", new Category("ola","ban","cor"),1.0,2.0);
        // TESTE
        Product produto8 = new Product("2","3","este produto e x","1", new Category("ola","ban","cor"),1.0,2.0);


        ShoppingList TP2 = new ShoppingList("rar", Ze);
        //
        TP2.AddUser(Ztura);
        TP2.AddUser(tesp);
        //teste - novo utilizador
        TP2.AddUser(joao);
        //adicionar objeto a lista produtos1
        TP2.AddProduct(produto1);
        TP2.AddProduct(produto2);
        TP2.AddProduct(produto3);
        TP2.AddProduct(produto4);
        TP2.AddProduct(produto5);

        // Produtos Carrinho
        TP2.AddProductOnCart(produto6);
        TP2.AddProductOnCart(produto7);
        //teste - produto 8
        TP2.AddProductOnCart(produto8);
        System.out.println(TP2.toString());

    }
}
