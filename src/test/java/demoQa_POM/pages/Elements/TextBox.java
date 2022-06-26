package demoQa_POM.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox extends Elements {

    public final String url = "https://demoqa.com/text-box";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public TextBox(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    By fullName = By.id("userName");
    By email = By.id("userEmail");
    By currentAddress = By.id("currentAddress");
    By permanentAddress = By.id("permanentAddress");
    By submit = By.cssSelector("#submit");


    public WebElement getFullName() {
        return driver.findElement(fullName);
    }

    public WebElement getEmail() {
        return driver.findElement(email);
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(currentAddress);
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(permanentAddress);
    }

    public WebElement getSubmit() {
        scroll();
        return driver.findElement(submit);
    }

    public void inputFieldsTextBox(String fullName, String email, String currentAddress, String permanentAddress) {
        getFullName().sendKeys(fullName);
        getEmail().sendKeys(email);
        getCurrentAddress().sendKeys(currentAddress);
        getPermanentAddress().sendKeys(permanentAddress);
        getSubmit().click();
    }
}
