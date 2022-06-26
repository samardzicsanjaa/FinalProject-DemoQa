package demoQa_POM.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox extends Elements {

    public final String url = "https://demoqa.com/checkbox";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public CheckBox(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By openHome = By.cssSelector("button[title='Toggle']");
    By selectHome = By.className("rct-checkbox");
    By deSelectHome = By.className("rct-checkbox");
    By openDesktop = By.xpath("(//button[@title='Toggle'])[2]");
    By openDocuments = By.cssSelector("li:nth-child(2) span:nth-child(1) button:nth-child(1)");
    By openWorkSpace = By.xpath("(//button[@title='Toggle'])[4]");
    By openOffice = By.xpath("(//button[@title='Toggle'])[5]");
    By openDownloads = By.cssSelector("li:nth-child(3) span:nth-child(1) button:nth-child(1)");
    By collapseAll = By.cssSelector(".rct-option.rct-option-collapse-all");
    By expandaAll = By.cssSelector(".rct-icon.rct-icon-expand-all");

    public WebElement getOpenHome() {
        return driver.findElement(openHome);
    }

    public WebElement getSelectHome() {
        return driver.findElement(selectHome);
    }

    public WebElement getDeSelectHome() {
        return driver.findElement(deSelectHome);
    }

    public WebElement getOpenDesktop() {
        return driver.findElement(openDesktop);
    }

    public WebElement getOpenDocuments() {
        return driver.findElement(openDocuments);
    }

    public WebElement getOpenWorkSpace() {
        scroll();
        return driver.findElement(openWorkSpace);
    }

    public WebElement getOpenOffice() {
        scroll();
        return driver.findElement(openOffice);
    }

    public WebElement getOpenDownloads() {
        scroll();
        return driver.findElement(openDownloads);
    }

    public WebElement getCollapseAll() {
        return driver.findElement(collapseAll);
    }

    public WebElement getExpandAll() {
        return driver.findElement(expandaAll);
    }

}
