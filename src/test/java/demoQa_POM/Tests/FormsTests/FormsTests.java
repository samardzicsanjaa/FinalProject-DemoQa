package demoQa_POM.Tests.FormsTests;

import demoQa_POM.basePage.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormsTests extends BasePage {

    @BeforeMethod
    public void beforeMethod() {
        driver.navigate().to(url);
    }

    /*
     * Forms
     * */

    @Test
    public void categoryForms() {
        demoQaHomePage.getForms().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/forms");
    }
}

