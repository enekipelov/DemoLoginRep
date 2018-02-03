package com.company.Tests;

import com.company.App;
import com.company.Emails.Email;
import com.company.Emails.EmailFactory;
import com.company.Users.User;
import com.company.Users.UserFactoy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.List;

/**
 * Created by UITS-Admin on 20.01.2018.
 */
public class BaseTest {
    protected static User validUser = UserFactoy.getValidUser();
    protected static App app = new App();
    protected static Email email = EmailFactory.getValidEmail();

    protected static List<User> vaildUsers = UserFactoy.getListValidUsers(10);
    @BeforeSuite
    public void setSuite() throws Exception {
    }

    @AfterSuite
    public void tearDownSuite() throws Exception {
        app.common.closeApp();
    }
}
