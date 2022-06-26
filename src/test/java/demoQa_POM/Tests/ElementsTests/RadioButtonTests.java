package demoQa_POM.Tests.ElementsTests;

import demoQa_POM.basePage.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTests extends BasePage {

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
     * Click on Radio Button
     * */

    @Test(priority = 2)
    public void clickRadioButtonElements() {
        categoryElements();

        elements.getRadioButton().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/radio-button");
    }

    /*
     * Radio Button
     * */

    @Test(priority = 3)
    public void radioButtonElements() {
        clickRadioButtonElements();

        radioButton.getButtonYes().click();
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You have selected Yes");

        radioButton.getButtonImpressive().click();
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You have selected Impressive");

        radioButton.getButtonNo().click();
        Assert.assertFalse(driver.findElement(By.cssSelector("label[for=\"noRadio\"]")).isSelected());
    }


}
