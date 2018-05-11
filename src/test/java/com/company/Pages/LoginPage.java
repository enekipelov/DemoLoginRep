package com.company.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by UITS-Admin on 20.01.2018.
 */
public class LoginPage extends BasePage {

    @FindBy(name="login")
    private WebElement inputLogin;
    @FindBy(name="pass")
    private WebElement inputPassword;
    @FindBy(xpath="//form[@name=\"lform\"]//input[@type='submit']")
    private WebElement btnSubmit;
	@FindBy(name="domn")
	private WebElement domen;



    public void login (String name, String password){
        log.info(String.format("Login username - %s, pass - %s",name,password));
        inputLogin.sendKeys(name);
        inputPassword.sendKeys(password);
        //new Select(domen).selectByValue("email.ua");
        btnSubmit.click();
    }
}
