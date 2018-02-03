package com.company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by UITS-Admin on 21.01.2018.
 */
public class SendPage extends BasePage {
    @FindBy(xpath = "//div[@class = 'to']/div[@class = 'field_name']")
    private WebElement WhomBut;
    @FindBy(xpath = "//textarea[@name = 'to']")
    private WebElement WhomField;
    @FindBy(xpath = "//input[@name = 'subject']")
    private WebElement Subject;
    @FindBy(xpath = "//textarea[@name = 'body' and @id = 'text']")
    private WebElement Body;
    @FindBy(xpath = "//p[@class = 'send_container']/ input[@type = 'submit' and @name = 'send']")
    private WebElement SendButt;



    public void sendEmail(String subject, String whom, String body) {
        Subject.sendKeys(subject);
        WhomField.sendKeys(whom);
        Body.sendKeys(body);
        SendButt.click();
    }


}
