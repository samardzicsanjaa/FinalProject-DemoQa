package demoQa_POM.Tests.ElementsTests;

import demoQa_POM.basePage.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinksTests extends BasePage {

    @BeforeMethod
    public void beforeMethod() {
        driver.navigate().to(url);
    }

    /*
     * Elements
     * */

    @Test(priority = 1)
    public void categoryElements() {
        demoQaHomePage.getElements().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/elements");
    }

    /*
     * Click on Links
     * */

    @Test(priority = 2)
    public void clickLinksElements() {
        categoryElements();
        elements.getLinks().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/links");
    }

    /*
     * Links new Tabs
     * */

    @Test(priority = 3)
    public void linksOpenNewTabElements() throws InterruptedException {
        clickLinksElements();

        Assert.assertEquals(driver.findElement
                        (By.xpath("//strong[normalize-space()='Following links will open new tab']")).getText(),
                "Following links will open new tab");

        Thread.sleep(2000);
        links.getNewTab(1, links.getHome("simleLink"), "https://demoqa.com/");

        Thread.sleep(2000);
        links.getNewTab(1, links.getHomeDynamic("dynamicLink"), "https://demoqa.com/");
    }

    /*
     * Api Call Links
     * */

    @Test(priority = 4)
    public void apiCallLinks() {
        clickLinksElements();

        Assert.assertEquals(driver.findElement(By.xpath("(//h5)[2]")).getText(),
                "Following links will send an api call");
    }

    /*
     * Created
     * */

    @Test(priority = 5)
    public void apiCallLinksCreated() throws InterruptedException {
        apiCallLinks();

        Thread.sleep(2000);
        links.getCreated().click();
        Assert.assertEquals(driver.findElement(By.id("linkResponse")).getText(),
                "Link has responded with staus 201 and status text Created");
    }

    /*
     * No Content
     * */

    @Test(priority = 6)
    public void apiCallLinksNoContent() throws InterruptedException {
        apiCallLinks();

        Thread.sleep(2000);
        links.getNoContent().click();
        Assert.assertEquals(driver.findElement(By.id("linkResponse")).getText(),
                "Link has responded with staus 204 and status text No Content");
    }

    /*
     * Moved
     * */

    @Test(priority = 7)
    public void apiCallLinksMoved() throws InterruptedException {
        apiCallLinks();

        Thread.sleep(2000);
        links.getMoved().click();
        Assert.assertEquals(driver.findElement(By.id("linkResponse")).getText(),
                "Link has responded with staus 301 and status text Moved Permanently");
    }

    /*
     * Bad Request
     * */

    @Test(priority = 8)
    public void apiCallLinksBadRequest() throws InterruptedException {
        apiCallLinks();

        Thread.sleep(2000);
        links.getBadRequest().click();
        Assert.assertEquals(driver.findElement(By.id("linkResponse")).getText(),
                "Link has responded with staus 400 and status text Bad Request");
    }

    /*
     * Unauthorized
     * */

    @Test(priority = 9)
    public void apiCallLinksUnauthorized() throws InterruptedException {
        apiCallLinks();

        Thread.sleep(2000);
        links.getUnauthorized().click();
        Assert.assertEquals(driver.findElement(By.id("linkResponse")).getText(),
                "Link has responded with staus 401 and status text Unauthorized");
    }

    /*
     * Forbidden
     * */

    @Test(priority = 10)
    public void apiCallLinksForbidden() throws InterruptedException {
        apiCallLinks();

        Thread.sleep(2000);
        links.getForbidden().click();
        Assert.assertEquals(driver.findElement(By.id("linkResponse")).getText(),
                "Link has responded with staus 403 and status text Forbidden");
    }

    /*
     * Not Found
     * */

    @Test(priority = 11)
    public void apiCallLinksNotFound() throws InterruptedException {
        apiCallLinks();

        Thread.sleep(2000);
        links.getNotFound().click();
        Assert.assertEquals(driver.findElement(By.id("linkResponse")).getText(),
                "Link has responded with staus 404 and status text Not Found");
    }

}
