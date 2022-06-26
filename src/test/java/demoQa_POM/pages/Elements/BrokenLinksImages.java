package demoQa_POM.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinksImages extends Elements {

    public final String url = "https://demoqa.com/broken";
    public WebDriver driver;
    public WebDriverWait wdwait;


    public BrokenLinksImages(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By validImage = By.cssSelector("img[src=\"/images/Toolsqa.jpg\"]");
    By brokenImage = By.cssSelector("img[src=\"/images/Toolsqa_1.jpg\"]");
    By clickHereForValidLink = By.linkText("Click Here for Valid Link");
    By clickHereForBrokenLink = By.linkText("Click Here for Broken Link");

    public WebElement getValidImage() {
        return driver.findElement(validImage);
    }

    public WebElement getBrokenImage() {
        return driver.findElement(brokenImage);
    }

    public WebElement getClickHereForValidLink() {
        return driver.findElement(clickHereForValidLink);
    }

    public WebElement getClickHereForBrokenLink() {
        scroll();
        return driver.findElement(clickHereForBrokenLink);
    }

}
