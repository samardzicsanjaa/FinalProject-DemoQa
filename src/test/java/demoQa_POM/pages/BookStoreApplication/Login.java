package demoQa_POM.pages.BookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login extends BookStoreApplication {

    public final String url = "https://demoqa.com/login";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Login(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By userName = By.id("userName");
    By password = By.id("password");
    By loginButton = By.id("login");
    By newUserButton = By.id("newUser");
    By logOutButton = By.xpath("(//button[normalize-space()='Log out'])[1]");

    public WebElement getUserName() {
        return driver.findElement(userName);
    }

    public WebElement getPassword() {
        return driver.findElement(password);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    public WebElement getNewUserButton() {
        return driver.findElement(newUserButton);
    }

    public WebElement getLogOutButton(){
        return driver.findElement(logOutButton);
    }

    public void inputFields(String userName, String password) {
        getUserName().sendKeys(userName);
        getPassword().sendKeys(password);
        getLoginButton().click();
    }
}
