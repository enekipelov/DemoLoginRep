package com.company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by UITS-Admin on 20.01.2018.
 */
public class HomePage extends BasePage {

   @FindBy(xpath="//span[@class='user_name']")
           private WebElement lableuserName;
    @FindBy(xpath = "(//p[@class = 'make_message']/a[contains(@href, 'compose')])")
    private WebElement ComposeButton;

    public String getUserName(){
        return lableuserName.getText().trim();
    }
    public void ComposeButtonClick(){
        ComposeButton.click();
    }

}
