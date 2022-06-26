package demoQa_POM.Tests.BookStoreApplicationTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class BookStoreTests extends ProfileTests {

    @BeforeMethod
    public void beforeMethod() {
        driver.navigate().to(url);
    }

    /*
     * Book Store Application
     * */

    @Test(priority = 1)
    public void categoryBookStoreApplication() {
        demoQaHomePage.getBookStoreApplication().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books");
    }

    /*
     * Click on Login Book Store
     * */

    @Test(priority = 2)
    public void loginBookStore() {
        categoryBookStoreApplication();

        bookStore.getLoginButton().click();
        wdwait.until(ExpectedConditions.urlToBe("https://demoqa.com/login"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");
    }

    /*
     * Add Book
     * */

    @Test(priority = 3)
    public void addBook() throws InterruptedException {
        profileLogin();

        profile.getGoToBookStoreBtn().click();
        bookStore.addBook("Speaking JavaScript");
        bookStore.getAddToCollection();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    /*
     * Search Box
     * */

    @Test(priority = 4)
    public void searchBook() throws InterruptedException {
        categoryBookStoreApplication();

        Thread.sleep(1000);
        bookStore.getSearchBox().sendKeys("You Don't Know JS");
        Assert.assertEquals(driver.findElement(By.linkText("You Don't Know JS")).getText(), "You Don't Know JS");
    }

    /*
     * Rows
     * */

    @Test(priority = 5)
    public void rows() throws AWTException {
        categoryBookStoreApplication();

        bookStore.zoomOut();

        bookStore.select("5");

        List<WebElement> filter = driver.findElements(By.className("rt-tr-group"));
        for (int i = 0; i < filter.size(); i++) {
            if (filter.size() != 5)
                Assert.fail();
        }
    }

    /*
     * Page
     * */

    @Test(priority = 6)
    public void page() throws AWTException {
        rows();

        bookStore.getPage().clear();
        bookStore.getPage().sendKeys("2");
        Assert.assertEquals(driver.findElement(By.cssSelector(".-totalPages")).getText(), "2");
    }

    /*
     * Click on Next Page
     * */

    @Test(priority = 7)
    public void nextPage() throws AWTException {
        rows();

        bookStore.getNextPageBtn().click();
        Assert.assertTrue(driver.findElement(By.className("-next")).isDisplayed());
    }

    /*
     * Click on Previous Page
     * */

    @Test(priority = 8)
    public void previousPage() throws AWTException {
        nextPage();

        bookStore.getNextPreviousBtn().click();
        Assert.assertTrue(driver.findElement(By.className("-previous")).isDisplayed());
    }

    /*
     * Click on Book
     * */

    @Test(priority = 9)
    public void clickOnBook() throws InterruptedException, AWTException {
        previousPage();

        bookStore.addBook("Speaking JavaScript");
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books?book=9781449365035");

        bookStore.getBackToBookStore();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books");
    }
}

