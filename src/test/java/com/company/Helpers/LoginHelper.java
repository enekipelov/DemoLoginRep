package com.company.Helpers;

import com.company.Pages.LoginPage;
import com.company.Users.User;
import com.company.Users.UserFactoy;

/**
 * Created by UITS-Admin on 21.01.2018.
 */
public class LoginHelper extends LoginPage{
   public void loginValidUser(){
       User validUser = UserFactoy.getValidUser();
       login(validUser.getLogin(), validUser.getPassword());
    }
    public void loginNotValidUser(){
        User notValidUser = UserFactoy.getNotValidUser();
        login(notValidUser.getLogin(), notValidUser.getPassword());
    }
}
