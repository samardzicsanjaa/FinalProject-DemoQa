package demoQa_POM.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicProperties extends Elements {

    public final String url = "https://demoqa.com/dynamic-properties";
    public WebDriver driver;
    public WebDriverWait wdwait;


    public DynamicProperties(WebDriver driver, WebDriverWait wdwait) {
        super(driver);
        this.driver = driver;
        this.wdwait = wdwait;
    }

    By enableAfter = By.id("enableAfter");
    By colorChange = By.cssSelector(".mt-4.text-danger.btn.btn-primary");
    By visibleAfter5Seconds = By.id("visibleAfter");


    public void getEnableAfter() {
        wdwait.until(ExpectedConditions.elementToBeClickable(enableAfter));
        driver.findElement(enableAfter).click();
    }

    public void getColorChange() {
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(colorChange));
        driver.findElement(colorChange).isDisplayed();
    }

    public void getVisibleAfter5Seconds() {
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(visibleAfter5Seconds));
        driver.findElement(visibleAfter5Seconds).click();
    }

}
