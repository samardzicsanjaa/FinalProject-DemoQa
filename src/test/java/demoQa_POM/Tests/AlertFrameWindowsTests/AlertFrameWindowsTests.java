package demoQa_POM.Tests.AlertFrameWindowsTests;

import demoQa_POM.basePage.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertFrameWindowsTests extends BasePage {

    @BeforeMethod
    public void beforeMethod() {
        driver.navigate().to(url);
    }

    /*
     * Alert, Frame & Windows
     * */

    @Test
    public void categoryAlertFrameWindows() {
        demoQaHomePage.getAlertsFrameWindows().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/alertsWindows");
    }

}
