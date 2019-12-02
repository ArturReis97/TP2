import java.util.ArrayList;

public class Main {





    public static void main(String args[]) {

//List<String> UserList = List.of("jose","joana","jessica");
//criar utilizadores
        User Ze = new User("1","2","3","4",new Address("baba",1,"33"));
        User Ztura = new User("1","2","3","4",new Address("baba",1,"33"));
        User tesp = new User("1","2","3","4",new Address("baba",1,"33"));
        //teste
        User tura =new User("baba","abab","ra","4",new Address("babaddd",2,"37654"));
//criar produtos
        Product produto1 = new Product("2","1","ad","4",new Category("ola","ban","cor"),1.0,2.0);
        Product produto2 = new Product("2","2","da","4",new Category("ola","ban","cor"),1.0,2.0);
        Product produto3 = new Product("2","3","ba","4",new Category("ola","ban","cor"),1.0,2.0);
        Product produto4 = new Product("2","4","ab","4",new Category("ola","ban","cor"),1.0,2.0);
        Product produto5 = new Product("2","5","er","4",new Category("ola","ban","cor"),1.0,2.0);
        Product produto6 = new Product("2","6","re","4",new Category("ola","ban","cor"),1.0,2.0);
        Product produto7 = new Product("2","7","yt","4",new Category("ola","ban","cor"),1.0,2.0);
//teste
        Product produto8 = new Product("2","8","ty","4",new Category("ola","ban","cor"),1.0,2.0);


//adicionar um utilizador a uma lista de compras e criar uma varialvel para usala
        ShoppingList TP2 = new ShoppingList("peixe", Ze);
        //adicionar utilizador com quem partilhar as listas
        TP2.AddUser(Ztura);
        TP2.AddUser(tesp);
        //teste
        TP2.AddUser(tura);

        //adicionar objeto a lista produtos1
        TP2.AddProduct(produto1);
        TP2.AddProduct(produto2);
        TP2.AddProduct(produto3);
        TP2.AddProduct(produto4);
        TP2.AddProduct(produto5);

        //produtos no carrinho
        TP2.AddProductOnCart(produto6);
        TP2.AddProductOnCart(produto7);
        //teste
        TP2.AddProductOnCart(produto8);



        System.out.println(TP2.toString());

        public String GetImprimirDD()
        {
            String dd;
            for (int i=0;i<TP2.ProductOnCart().size();i++)
            {
                System.out.println(ProductList2.get(i));

                dd ==> ProductList2.get(i);
                return dd;
            }
        }


    }
}
