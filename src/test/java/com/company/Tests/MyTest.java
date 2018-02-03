package com.company.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by UITS-Admin on 20.01.2018.
 */
public class MyTest extends BaseTest {

    @Test
    public void testMainLogin() throws Exception {
        WebDriver mydriver = app.common.getDriver();
        System.out.println( mydriver.getWindowHandles());
        mydriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(vaildUsers);
        app.login.loginValidUser();
        String userName = app.home.getUserName();
        Assert.assertEquals(userName, validUser.getUserName(), "UserName is incorrect");

    }

    @Test
    public void testSendEmail() throws Exception {
        app.home.ComposeButtonClick();
        app.mail.sendValidEmail();
        String status = app.AES.getStatus();
        Assert.assertEquals(status,"Письмо успешно отправлено адресатам", "Status is incorrect");

    }
    @Test
    public void testYCheckInbox() throws Exception{
        app.AES.inboxButClick();
        Assert.assertEquals(app.inbox.getFrom(),validUser.getUserName(),"От кого не совпадает");
        Assert.assertEquals(app.inbox.getSbj(),email.getSubject(),"Тема не совпадает");
    }
}
