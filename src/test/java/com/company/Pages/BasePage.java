package com.company.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.server.DriverFactory;
import org.openqa.selenium.support.PageFactory;
import com.company.Driver.DriverFactory;
import java.net.MalformedURLException;
import java.net.URL;
/**
 * Created by UITS-Admin on 21.01.2018.
 */
public class BasePage {
    protected static WebDriver driver = DriverFactory.getDriver();
    public BasePage() {
        PageFactory.initElements(driver,this); //инициализация єлементов на странице
    }
    /*protected static WebDriver driver;
    static {
        final String USERNAME = "brutalneka";
        final String ACCESS_KEY = "981ac970-ce85-4b7d-a351-d1db2ecdfc6d";
        final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
        FirefoxOptions caps = new FirefoxOptions();

        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "38.0");
        caps.setCapability("name", "Sauce Sample Test");
        try {
            driver = new RemoteWebDriver(new URL(URL), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.get("http://www.i.ua");
    }
    public BasePage() {
        PageFactory.initElements(driver,this); //инициализация єлементов на странице
    }*/
    /*protected static WebDriver driver;
    static {
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://www.i.ua");
    }
    public BasePage() {
        PageFactory.initElements(driver,this); //инициализация єлементов на странице
    }*/
}
