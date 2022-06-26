package demoQa_POM.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttons extends Elements {

    public final String url = "https://demoqa.com/buttons";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Buttons(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By doulbeClickMe = By.id("doubleClickBtn");
    By rightClickMe = By.id("rightClickBtn");
    By clickMe = By.xpath("(//button[normalize-space()='Click Me'])[1]");

    public void actionsDoubleClick() {
        Actions actions = new Actions(driver);
        WebElement doubleClick = driver.findElement(doulbeClickMe);
        actions.doubleClick(doubleClick).perform();
    }


    public WebElement getDoubleClickMe() {
        actionsDoubleClick();
        return driver.findElement(doulbeClickMe);
    }


    public void actionsRightClick() {
        Actions actions = new Actions(driver);
        WebElement rightClick = driver.findElement(rightClickMe);
        actions.contextClick(rightClick).perform();
    }

    public WebElement getRightClickMe() {
        actionsRightClick();
        return driver.findElement(rightClickMe);
    }

    public void actionsClick() {
        Actions actions = new Actions(driver);
        WebElement click = driver.findElement(clickMe);
        actions.moveToElement(click).click().perform();
    }

    public WebElement getClickMe() {
        actionsClick();
        return driver.findElement(clickMe);
    }


}
