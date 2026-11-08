package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="//input[@name='username']" )
    private WebElement usernameInput;

    @FindBy(xpath ="//input[@name='password']" )
    private WebElement passwordInput;

    @FindBy(xpath = "//button[text()=' Login ']")
    private WebElement loginButton;

    public void enterUsername(String username){
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordInput.sendKeys(password);
    }

    public DashboardPage clickLoginButton(){
        loginButton.click();
        return new DashboardPage(driver);
    }
}
