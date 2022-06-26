package demoQa_POM.pages.BookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStoreApplication {

    public final String url = "https://demoqa.com/books";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public BookStoreApplication(WebDriver driver) {
        this.driver = driver;
    }

    By login = By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']");
    By bookStore = By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']");
    By profile = By.xpath("//div[@class='element-list collapse show']//li[@id='item-3']");
    By bookStoreAPI = By.xpath("//div[@class='element-list collapse show']//li[@id='item-4']");

    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    public WebElement getLogin() {
        scroll();
        return driver.findElement(login);
    }

    public WebElement getBookStore() {
        scroll();
        return driver.findElement(bookStore);
    }

    public WebElement getProfile() {
        scroll();
        return driver.findElement(profile);
    }

    public WebElement getBookStoreAPI() {
        scroll();
        return driver.findElement(bookStoreAPI);
    }

}
