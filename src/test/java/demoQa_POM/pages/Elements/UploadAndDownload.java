package demoQa_POM.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadAndDownload extends Elements {

    public final String url = "https://demoqa.com/upload-download";
    public WebDriver driver;
    public WebDriverWait wdwait;


    public UploadAndDownload(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    By download = By.id("downloadButton");
    By chooseFile = By.id("uploadFile");
    By fileAddress = By.id("uploadedFilePath");


    public WebElement getdownload() {
        return driver.findElement(download);
    }

    public WebElement getchooseFile() {
        return driver.findElement(chooseFile);
    }

    public WebElement getAddress() {
        return driver.findElement(fileAddress);
    }

}


