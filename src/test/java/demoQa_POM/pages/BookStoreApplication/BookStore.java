package demoQa_POM.pages.BookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class BookStore extends BookStoreApplication {

    public final String url = "https://demoqa.com/books";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public BookStore(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By searchBox = By.id("searchBox");
    By loginButton = By.id("login");

    By bookStore = By.className("rt-tr-group");
    By backToBookStore = By.cssSelector(".text-left.fullButton");
    By addToYourCollection = By.cssSelector(".text-right.fullButton");

    By page = By.cssSelector("input[value=\"1\"]");
    By rows = By.cssSelector("select[aria-label=\"rows per page\"]");
    By nextPageBtn = By.cssSelector(".-next");
    By previousPageBtn = By.cssSelector(".-previous");

    public List<WebElement> getAllBooks() {
        return driver.findElements(bookStore);
    }

    public void addBook(String text) throws InterruptedException {
        Thread.sleep(2500);
        scroll();
        List<WebElement> listBooks = getAllBooks();
        driver.findElement(By.xpath("//a[text()='" + text + "']")).click();
    }

    public void getAddToCollection() {
        scroll();
        driver.findElement(addToYourCollection).click();
    }

    public void getBackToBookStore() {
        scroll();
        driver.findElement(backToBookStore).click();
    }

    public WebElement getSearchBox() {
        return driver.findElement(searchBox);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    public WebElement getPage() {
        return driver.findElement(page);
    }

    public WebElement getNextPageBtn() {
        return driver.findElement(nextPageBtn);
    }

    public WebElement getNextPreviousBtn() {
        return driver.findElement(previousPageBtn);
    }

    public void select(String value) {
        scroll();
        Select sort = new Select(driver.findElement(rows));
        sort.selectByValue(value);
    }

    public void zoomOut() throws AWTException {
        Robot robot = new Robot();
        for(int i = 0; i < 4; i++){
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
    }
}
