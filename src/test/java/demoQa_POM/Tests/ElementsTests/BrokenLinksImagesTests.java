package demoQa_POM.Tests.ElementsTests;

import demoQa_POM.basePage.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenLinksImagesTests extends BasePage {

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
     * Click on Broken Links - Images
     * */

    @Test(priority = 2)
    public void clickBrokenLinksImages() {
        categoryElements();

        elements.getBrokenLinksImages().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/broken");
    }

    /*
     * Valid Image
     * */

    @Test(priority = 3)
    public void brokenLinkImagesValidImage() {
        clickBrokenLinksImages();

        Assert.assertEquals(driver.findElement(By.cssSelector("p:nth-child(1)")).getText(), "Valid image");

        brokenLinksImages.getValidImage().isDisplayed();
        Assert.assertTrue(driver.findElement(By.cssSelector("img[src=\"/images/Toolsqa.jpg\"]")).isDisplayed());
    }

    /*
     * Broken Image
     * */

    @Test(priority = 4)
    public void brokenLinkImagesBrokenImage() {
        clickBrokenLinksImages();

        Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='Broken image']")).getText(), "Broken image");

        brokenLinksImages.getBrokenImage().isDisplayed();
        Assert.assertTrue(driver.findElement(By.cssSelector("img[src=\"/images/Toolsqa_1.jpg\"]")).isDisplayed());
    }

    /*
     * Valid link
     * */

    @Test(priority = 5)
    public void brokenLinkImagesValidlink() {
        clickBrokenLinksImages();

        Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='Valid Link']")).getText(), "Valid Link");

        brokenLinksImages.getClickHereForValidLink().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
    }

    /*
     * Broken Link
     * */

    @Test(priority = 6)
    public void brokenLinkImagesBrokenLink() {
        clickBrokenLinksImages();

        Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='Broken Link']")).getText(), "Broken Link");

        brokenLinksImages.getClickHereForBrokenLink().click();
        Assert.assertEquals(driver.getCurrentUrl(), "http://the-internet.herokuapp.com/status_codes/500");

    }
}
