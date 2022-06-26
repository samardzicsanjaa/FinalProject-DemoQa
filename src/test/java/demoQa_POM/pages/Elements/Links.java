package demoQa_POM.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Set;

public class Links extends Elements {

    public final String url = "https://demoqa.com/links";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Links(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By home = By.id("simpleLink");
    By homeDynamic = By.id("dynamicLink");

    By created = By.id("created");
    By noContent = By.id("no-content");
    By moved = By.id("moved");
    By badRequest = By.id("bad-request");
    By unauthorized = By.id("unauthorized");
    By forbidden = By.id("forbidden");
    By notFound = By.id("invalid-url");

    public WebElement getCreated() {
        return driver.findElement(created);
    }

    public WebElement getNoContent() {
        return driver.findElement(noContent);
    }

    public WebElement getMoved() {
        return driver.findElement(moved);
    }

    public WebElement getBadRequest() {
        return driver.findElement(badRequest);
    }

    public WebElement getUnauthorized() {
        return driver.findElement(unauthorized);
    }

    public WebElement getForbidden() {
        scroll();
        return driver.findElement(forbidden);
    }

    public WebElement getNotFound() {
        scroll();
        return driver.findElement(notFound);
    }

    public String getHome(String link) {
        link = "simpleLink";
        return link;
    }

    public String getHomeDynamic(String link) {
        link = "dynamicLink";
        return link;
    }

    public void getNewTab(int i, String homeLink, String url) {
        driver.findElement(By.id(homeLink)).click();
        Set<String> setTabs = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(setTabs);
        driver.switchTo().window(tabs.get(i));
        Assert.assertEquals(driver.getCurrentUrl(), url);
        driver.close();
        driver.switchTo().window(tabs.get(0));

    }

}
