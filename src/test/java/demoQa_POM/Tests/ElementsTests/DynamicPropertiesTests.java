package demoQa_POM.Tests.ElementsTests;

import demoQa_POM.basePage.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicPropertiesTests extends BasePage {

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
     * Click on Dynamic Properties
     * */

    @Test(priority = 2)
    public void clickDynamicProperties() {
        categoryElements();
        elements.getDynamicProperties().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/dynamic-properties");
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "This text has random Id");
    }

    /*
     * Enable After
     * */

    @Test(priority = 3)
    public void enableAfter() {
        clickDynamicProperties();

        dynamicProperties.getEnableAfter();
        Assert.assertTrue(driver.findElement(By.id("enableAfter")).isEnabled());
    }

    /*
     * Color Change
     * */

    @Test(priority = 4)
    public void colorChange(){
        clickDynamicProperties();

        dynamicProperties.getColorChange();
        Assert.assertTrue(driver.findElement(By.cssSelector(".mt-4.text-danger.btn.btn-primary")).isDisplayed());
    }

    /*
     * Visible After 5 Seconds
     * */

    @Test(priority = 5)
    public void visibleAfter5Seconds(){
        clickDynamicProperties();

        dynamicProperties.getVisibleAfter5Seconds();
        Assert.assertTrue(driver.findElement(By.id("visibleAfter")).isDisplayed());
    }
}
