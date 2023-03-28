package Repository;

import Model.User;

import java.util.ArrayList;
import java.util.List;

import static Driver.Main.userList;

public class UserRepository {


    public void add_user(User user){
        userList.add(user);
    }


    public List<User> allUser(){
        return userList;
    }
}
