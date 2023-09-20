

public class User {
    protected String name, email, phoneNumber, username, password;

    public User(String name, String email, String phoneNumber, String username, String password) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
    } 

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}