package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver initializeDriver(){
        driver.set(new ChromeDriver());
        return driver.get();
    }


    public static void quitDriver(){
        driver.get().quit();
        driver.remove();
    }


}
