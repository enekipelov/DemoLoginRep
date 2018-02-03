package com.company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfterEmailSendPage extends BasePage {
    @FindBy(xpath="//div[@class = 'block_confirmation']/div[@class= 'content clear']")
    private WebElement sendStatus;
    @FindBy(xpath = "//a[contains(@href, '/list/INBOX')]")
    private WebElement Inbox;
    public String getStatus() {
        return sendStatus.getText().trim();
    }
    public void inboxButClick(){
        Inbox.click();
    }


}

