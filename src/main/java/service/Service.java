package service;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private static List<User> userList = new ArrayList<>();
    static {
        User user1 = new User("john", "123456", "John", "john@codegym.vn", 10);
        User user2 = new User("bill", "123456", "Bill", "bill@codegym.vn", 15);
        User user3 = new User("mike", "123456", "Mike", "mike@codegym.vn", 16);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
    }

    public static User checkLogin(Login login){
        for (User user : userList) {
            if(user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())){
                return user;
            }
        }
        return null;
    }
}
