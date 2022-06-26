package demoQa_POM.Tests.ElementsTests;

import demoQa_POM.basePage.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTests extends BasePage {

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
     * Click Check Box
     * */

    @Test(priority = 2)
    public void clickCheckBoxElements() {
        categoryElements();

        elements.getCheckBox().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/checkbox");

    }

    /*
     * Check Box
     * */

    @Test(priority = 3)
    public void checkBoxElements() {
        clickCheckBoxElements();

        checkBox.getOpenHome().click();
        Assert.assertTrue(driver.findElement(By.xpath("(//ol)[2]")).isDisplayed());

        checkBox.getSelectHome().click();
        Assert.assertEquals(driver.findElement(By.cssSelector("#result")).getText(),
                "You have selected :\n" + "home\n" + "desktop\n" + "notes\n" + "commands\n" +
                        "documents\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" +
                        "office\n" + "public\n" + "private\n" + "classified\n" + "general\n" +
                        "downloads\n" + "wordFile\n" + "excelFile"); // proveri za assert

        checkBox.getOpenDesktop().click();
        Assert.assertTrue(driver.findElement(By.xpath("(//button[@title='Toggle'])[2]")).isDisplayed());

        checkBox.getOpenDocuments().click();
        Assert.assertTrue(driver.findElement(By.xpath("(//button[@title='Toggle'])[3]")).isDisplayed());

        checkBox.getOpenWorkSpace().click();
        Assert.assertTrue(driver.findElement(By.xpath("(//*[name()='path'])[67]")).isDisplayed());

        checkBox.getOpenOffice().click();
        Assert.assertTrue(driver.findElement(By.xpath("(//button[@title='Toggle'])[5]")).isDisplayed());

        checkBox.getOpenDownloads().click();
        Assert.assertTrue(driver.findElement(By.xpath("//li[3]//span[1]//button[1]//*[name()='svg']")).isDisplayed());

        checkBox.getCollapseAll().click();
        Assert.assertTrue(driver.findElement(By.cssSelector("button[title=\"Collapse all\"]")).isDisplayed());

        checkBox.getExpandAll().click();
        Assert.assertTrue(driver.findElement(By.cssSelector("button[title=\"Expand all\"]")).isDisplayed());

        checkBox.getDeSelectHome().click();
        Assert.assertTrue(driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-all")).isDisplayed());

    }

}
