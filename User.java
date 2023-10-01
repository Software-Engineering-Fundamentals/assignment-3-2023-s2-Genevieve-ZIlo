public class User {
    // Fields to store user information
    protected String name, email, phoneNumber, username, password;

    // Constructor to initialize user information
    public User(String name, String email, String phoneNumber, String username, String password) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
    }

    // Setters to update individual user information
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // Getters to retrieve individual user information
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }

    // Method to inform that the user has updated personal information
    public void updatePersonalInformation() {
        System.out.println(name + " has updated personal information.");
    }

    // Method for a user to lodge an enquiry to an administrator
    public void lodgeEnquiry(String enquiry, Administrator manager) {
        System.out.println(name + " lodged an enquiry to administrator: " + enquiry);
        manager.lodgeEnquiry(enquiry); // Adds the enquiry to the manager's list
    }

    // Method to attempt user login
    public boolean login(String username, String password) {
        if(this.username.equals(username) && this.password.equals(password)) {
            System.out.println(name + " logged in successfully.");
            return true;
        } else {
            System.out.println(name + " failed to log in.");
            return false;
        }
    }
}
