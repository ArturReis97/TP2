public class User
{
    // Nome  ------------
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        name = name;
    }

    // Email  ------------
    private String email;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // UserName  ------------
    private String userName;

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        userName = userName;
    }

    // Password  ------------
    private String password;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        password = password;
    }

    // Morada  ------------
    private Address address;
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    // construtores

    public User(String name, String email, String userName, String password, Address address) {
        this.name = name;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.address = address;
    }
}
