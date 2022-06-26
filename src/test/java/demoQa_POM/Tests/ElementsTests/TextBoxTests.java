package demoQa_POM.Tests.ElementsTests;

import demoQa_POM.basePage.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTests extends BasePage {


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
     * Click on Text Box
     * */

    @Test(priority = 2)
    public void clickTextBoxElements() {
        categoryElements();

        elements.getTextBox().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/text-box");
    }

    /*
     * Text Box
     * */

    @Test(priority = 3)
    public void textBoxElements() {
        clickTextBoxElements();

        textBox.inputFieldsTextBox("Sanja Samardzic", "testprojekat@yahoo.com",
                "Kopaonicka", "Kralja Petra");
        Assert.assertTrue(driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12")).isDisplayed());
    }

}
