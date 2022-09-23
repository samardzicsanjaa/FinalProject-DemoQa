package demoQa_POM.pages.AlertFrameWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertFrameWindows {

    public final String url = "https://demoqa.com/alertsWindows";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public AlertFrameWindows(WebDriver driver) {
        this.driver = driver;
    }

    By browserWindows = By.cssSelector("div[class='element-list collapse show'] li[id='item-0'] span[class='text']");
    By alerts = By.id("item-1");
    By frames = By.id("item-2");
    By nestedFrames = By.id("item-3");
    By modalDialogs = By.id("item-4");

    public WebElement getBrowserWindows(){
        return driver.findElement(browserWindows);
    }

    public WebElement getAlerts(){
        return driver.findElement(alerts);
    }

    public WebElement getFrames(){
        return driver.findElement(frames);
    }

    public WebElement getNestedFrames(){
        return driver.findElement(nestedFrames);
    }

    public WebElement getModalDialogs(){
        return driver.findElement(modalDialogs);
    }

}
