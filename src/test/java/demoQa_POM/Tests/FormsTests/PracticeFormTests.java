package demoQa_POM.Tests.FormsTests;

import demoQa_POM.basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTests extends BasePage {

    @BeforeMethod
    public void beforeMethod() {
        driver.navigate().to(url);
    }

    /*
     * Forms
     * */

    @Test(priority = 1)
    public void categoryForms() {
        demoQaHomePage.getForms().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/forms");
    }

    /*
     * Click on Practice Form
     * */

    @Test(priority = 2)
    public void clickPracticeForm() {
        categoryForms();

        forms.getPracticeForm().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/automation-practice-form");
    }

    /*
     * Student Registration Form
     * */

    @Test(priority = 3)
    public void studentRegistrationForm() throws InterruptedException {
        clickPracticeForm();

        practiceForm.getFirstName();
        practiceForm.getLastName();
        practiceForm.getEmail();
        practiceForm.getFemale().click();
        practiceForm.getMobileNumber();
        practiceForm.getDateField();
        practiceForm.getSubjects();
        practiceForm.getHobbiesReading();
        practiceForm.getHobbiesMusic();
        practiceForm.getChooseFile().sendKeys("C:\\Users\\Dusan\\Downloads");
        practiceForm.getCurrentAddress();
        practiceForm.getState();
        practiceForm.getCity();
        practiceForm.getSubmit();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("example-modal-sizes-title-lg")));
        Assert.assertEquals(driver.findElement(By.id("example-modal-sizes-title-lg")).getText(),
                "Thanks for submitting the form");
        Assert.assertTrue(driver.findElement(By.className("modal-body")).isDisplayed());
        Thread.sleep(4000);
        practiceForm.getClose();

    }

}

