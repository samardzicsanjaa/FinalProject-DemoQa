package demoQa_POM.pages.AlertFrameWindows;

import demoQa_POM.pages.AlertFrameWindows.AlertFrameWindows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserWindows extends AlertFrameWindows {

    public final String url = "https://demoqa.com/browser-windows";
    public WebDriver driver;
    public WebDriverWait wdwait;


    public BrowserWindows(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By newTab = By.cssSelector("#tabButton");
    By newWindow = By.cssSelector("#windowButton");
    By newWindowMessage = By.cssSelector("#messageWindowButton");

    public WebElement getNewTab(){
        return driver.findElement(newTab);
    }

    public WebElement getNewWindow(){
        return driver.findElement(newWindow);
    }

    public WebElement getNewWindowMessage(){
        return driver.findElement(newWindowMessage);
    }


}
