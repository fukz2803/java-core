package Bank;

import java.util.ArrayList;

public class UserService {

    public ArrayList<User> getAllUser() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("1", 5000000, "123"));

        return users;
    }

    public void showBalance(ArrayList<User> users) {
        for (User u : users
             ){
            System.out.println("Số dư của bạn là " + u.getAccountBalance());
        }
    }



}
