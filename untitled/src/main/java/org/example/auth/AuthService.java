package org.example.auth;
import org.example.model.User;

public class AuthService {
    public boolean authenticate(String username, String password){
        User user = getUserByUsername(username);

        if(user != null && user.getPassword().equals(password)){
            return true;
        } else{
            return false;
        }
    }

    private User getUserByUsername(String username){
        // Fetch the user details from the database and return the User object

        User user = new User(username, "password");
        return user;
    }

}
