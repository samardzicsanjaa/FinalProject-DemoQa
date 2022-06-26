package demoQa_POM.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButton extends Elements {

    public final String url = "https://demoqa.com/radio-button";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public RadioButton(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By buttonYes = By.cssSelector("label[for=\"yesRadio\"]");
    By buttonImpressive = By.cssSelector("label[for=\"impressiveRadio\"]");
    By buttonNo = By.cssSelector("label[for=\"noRadio\"]");

    public WebElement getButtonYes() {
        return driver.findElement(buttonYes);
    }

    public WebElement getButtonImpressive() {
        return driver.findElement(buttonImpressive);
    }

    public WebElement getButtonNo() {
        return driver.findElement(buttonNo);
    }

}
