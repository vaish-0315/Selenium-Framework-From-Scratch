package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver initializeDriver(){
        driver = new ChromeDriver();
        return driver;
    }


    public void quitDriver(){
        driver.quit();
    }


}
