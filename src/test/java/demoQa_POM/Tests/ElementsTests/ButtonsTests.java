package demoQa_POM.Tests.ElementsTests;

import demoQa_POM.basePage.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTests extends BasePage {

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
     * Click on Buttons
     * */

    @Test(priority = 2)
    public void clickButtons() {
        categoryElements();
        elements.getButtons().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/buttons");
    }

    /*
     * Buttons
     * */

    @Test(priority = 3)
    public void buttonsElements() {
        clickButtons();

        buttons.getDoubleClickMe();
        Assert.assertEquals(driver.findElement(By.id("doubleClickMessage")).getText(), "You have done a double click");

        buttons.getRightClickMe();
        Assert.assertEquals(driver.findElement(By.id("rightClickMessage")).getText(), "You have done a right click");

        buttons.getClickMe().click();
        Assert.assertEquals(driver.findElement(By.cssSelector("p[id = \"dynamicClickMessage\"]")).getText(),
                "You have done a dynamic click");

    }
}
