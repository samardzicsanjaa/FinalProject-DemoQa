package demoQa_POM.Tests.ElementsTests;

import demoQa_POM.basePage.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadAndDownloadTests extends BasePage {

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
     * Click on Upload and Download
     * */

    @Test(priority = 2)
    public void clickUploadAndDownload() {
        categoryElements();

        elements.getUploadAndDownload().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/upload-download");
    }

    /*
     * Click on Upload
     * */

    @Test(priority = 3)
    public void upload() {
        clickUploadAndDownload();
        uploadAndDownload.getchooseFile().sendKeys("C:\\Users\\Dusan\\OneDrive\\Desktop\\vezba sa casa");
        Assert.assertEquals(uploadAndDownload.getAddress().getText(), "C:\\fakepath\\vezba sa casa");
    }

    /*
     * Click on Download
     * */

    @Test(priority = 4)
    public void download() {
        clickUploadAndDownload();

        uploadAndDownload.getdownload().click();
    }
}
