package demoQa_POM.pages.Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Forms {

    public final String url = "https://demoqa.com/forms";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Forms(WebDriver driver) {
        this.driver = driver;
    }

    By praticeForm = By.cssSelector(".element-list.collapse.show");

    public WebElement getPracticeForm(){
        return driver.findElement(praticeForm);
    }

    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,490)");
    }
}
