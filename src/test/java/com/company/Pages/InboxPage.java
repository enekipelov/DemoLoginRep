package com.company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InboxPage extends BasePage{
    @FindBy (xpath = "//div[@class = 'row new']//span[@class = 'frm']")
    private WebElement From;
    @FindBy (xpath = "//span [@class = 'sbj']")
    private WebElement Subject;

    public String getFrom(){
        return From.getText();
    }
    public String getSbj() {
        return Subject.getText();
    }
}
