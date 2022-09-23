package demoQa_POM.Tests.AlertFrameWindowsTests;

import demoQa_POM.basePage.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

public class BrowserWindowsTests extends BasePage {
    @BeforeMethod
    public void beforeMethod() {
        driver.navigate().to(url);
    }

    /*
     * Alert, Frame & Windows
     * */

    @Test(priority = 1)
    public void categoryAlertFrameWindows() {
        demoQaHomePage.getAlertsFrameWindows().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/alertsWindows");
    }

    /*
     * Click on Browser Windows
     * */

    @Test(priority = 2)
    public void clickBrowserWindows() {
        categoryAlertFrameWindows();

        alertFrameWindows.getBrowserWindows().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/browser-windows");
    }

    /*
     * Click on New tab
     * */

    @Test(priority = 3)
    public void clickNewTab() {
        clickBrowserWindows();

        browserWindows.getNewTab().click();
        Set<String> skuptabova = driver.getWindowHandles();
        ArrayList<String> tabovi = new ArrayList<>(skuptabova);
        driver.switchTo().window(tabovi.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/sample");
        Assert.assertEquals(driver.findElement(By.cssSelector("#sampleHeading")).getText(), "This is a sample page");
    }

    /*
     * Click on New window
     * */

    @Test(priority = 4)
    public void clickNewWindow() {
        clickBrowserWindows();

        browserWindows.getNewWindow().click();
        Set<String> skupProzora = driver.getWindowHandles();
        ArrayList<String> prozori = new ArrayList<>(skupProzora);
        driver.switchTo().window(prozori.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/sample");
        Assert.assertEquals(driver.findElement(By.id("sampleHeading")).getText(), "This is a sample page");
    }

    /*
     * Click on New window
     * */

    @Test(priority = 5)
    public void clickNewWindowMessage() {
        clickBrowserWindows();

        browserWindows.getNewWindowMessage().click();

    }

}
