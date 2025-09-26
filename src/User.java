import java.util.*;

public class User {
    private String userId;
    private String name;
    private String email;
    private String password;
    
    // Constructor
    public User(String userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public boolean login(String email, String password) {
        // TODO: Implementation for user login
        return this.email.equals(email) && this.password.equals(password);
    }
    
    public void logout() {
        // TODO: Implementation for user logout
    }
    
    public void updateProfile(String name, String email) {
        // TODO: Implementation to update user profile
        this.name = name;
        this.email = email;
    }
    
    // Getters
    public String getUserId() { return userId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
}

