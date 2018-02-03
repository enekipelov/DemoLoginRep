package com.company.Helpers;

import com.company.Pages.BasePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by UITS-Admin on 21.01.2018.
 */
public class CommonHelper extends BasePage{
   public void closeApp() {
       driver.quit();
   }
   public WebDriver getDriver() { return driver;}
}
