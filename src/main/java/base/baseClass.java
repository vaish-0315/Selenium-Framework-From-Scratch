package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import util.ConfigReader;
import util.DriverFactory;

import java.time.Duration;

public class baseClass extends DriverFactory {

    protected WebDriver driver;
    public String username = ConfigReader.getProperty("username");
    public String password = ConfigReader.getProperty("password");


    public baseClass(){

    }

    public baseClass(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @BeforeTest
    public void setup(){
        driver = DriverFactory.initializeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://opensource-demo.orangehrmlive.com");

    }

    @AfterTest
    public void quitBrowser(){
        driver.quit();
    }
}
