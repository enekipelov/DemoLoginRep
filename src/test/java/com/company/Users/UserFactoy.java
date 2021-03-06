package com.company.Users;

import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by UITS-Admin on 20.01.2018.
 */
public class UserFactoy {
    private static ResourceBundle bundle;
    static {
        bundle = ResourceBundle.getBundle("user");
    }
   public static User getValidUser(){
       return new User(bundle.getString("valid.userName"),
               bundle.getString("valid.login"),
               bundle.getString("valid.password"),
               bundle.getString("valid.email"));
   }

    public static User getNotValidUser() {
        return new User(bundle.getString("inValid.userName"),
                bundle.getString("inValid.login"),
                bundle.getString("inValid.password"),
                bundle.getString("inValid.email"));
    }
    public static List<User> getListValidUsers(int limit)
    {
       return Stream.generate(UserFactoy::getValidUser).limit(10).collect(Collectors.toList());
    }

}
