package demoQa_POM.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements {

    public final String url = "https://demoqa.com/elements";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Elements(WebDriver driver) {
        this.driver = driver;
    }

    By textBox = By.id("item-0");
    By checkBox = By.id("item-1");
    By radioButton = By.id("item-2");
    By webTables = By.id("item-3");
    By buttons = By.id("item-4");
    By links = By.id("item-5");
    By brokenLinksImages = By.id("item-6");
    By uploadAndDownload = By.id("item-7");
    By dynamicProperties = By.id("item-8");

    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,490)");
    }

    public WebElement getTextBox() {
        return driver.findElement(textBox);
    }

    public WebElement getCheckBox() {
        return driver.findElement(checkBox);
    }

    public WebElement getRadioButton() {
        return driver.findElement(radioButton);
    }

    public WebElement getWebTables() {
        return driver.findElement(webTables);
    }

    public WebElement getButtons() {
        scroll();
        return driver.findElement(buttons);
    }

    public WebElement getLinks() {
        scroll();
        return driver.findElement(links);
    }

    public WebElement getBrokenLinksImages() {
        scroll();
        return driver.findElement(brokenLinksImages);
    }

    public WebElement getUploadAndDownload() {
        scroll();
        return driver.findElement(uploadAndDownload);
    }

    public WebElement getDynamicProperties() {
        scroll();
        return driver.findElement(dynamicProperties);
    }

}
