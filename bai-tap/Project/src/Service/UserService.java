package Service;

import Model.User;

import java.util.ArrayList;

public class UserService {
    public ArrayList<User> getAllUser(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("admin", "admin@gmail.com", "1"));

        return users;
    }


    public User checkEmail(ArrayList<User> users, String email){
        for(User u: users){
            if(u.getEmail().equals(email)){
                return u;
            }
        }
        return null;
    }
}
