package demoQa_POM.Tests.BookStoreApplicationTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class ProfileTests extends LoginTests {

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
     * Click on Profile
     * */

    @Test(priority = 2)
    public void clickProfile() {
        categoryBookStoreApplication();

        bookStoreApplication.getProfile().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
        Assert.assertEquals(driver.findElement(By.id("notLoggin-label")).getText(),
                "Currently you are not logged into the Book Store application, " +
                        "please visit the login page to enter or register page to register yourself.");
    }

    /*
     * Click on Login - Profile
     * */

    @Test(priority = 3)
    public void clickLoginProfile() {
        clickProfile();

        profile.getLoginProfile().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");
        Assert.assertEquals(driver.findElement(By.xpath("(//div)[60]")).getText(),
                "Welcome,\n" +
                        "Login in Book Store");
    }

    /*
     * Click on Register - Profile
     * */

    @Test(priority = 4)
    public void clickRegisterProfile() {
        clickProfile();

        profile.getRegisterProfile().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/register");
    }

    /*
     * Login - Profile
     * */

    @Test(priority = 5)
    public void loginProfile() {
        clickLoginProfile();

        profile.inputFieldsLogin("automatizacija", "Itbootcamp13!");
        wdwait.until(ExpectedConditions.urlToBe("https://demoqa.com/profile"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }

    /*
     * Profile Login
     * */

    @Test(priority = 6)
    public void profileLogin() {
        login();
        wdwait.until(ExpectedConditions.urlToBe("https://demoqa.com/profile"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }

    /*
     * Add Book 1
     * */

    @Test(priority = 7)
    public void AddBook1() throws InterruptedException {
        profileLogin();

        profile.getGoToBookStoreBtn().click();
        bookStore.addBook("Git Pocket Guide");
        Thread.sleep(5000);
        bookStore.getAddToCollection();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        bookStore.getBackToBookStore();
    }

    /*
     * Add Book 2
     * */

    @Test(priority = 8)
    public void addBook2() throws InterruptedException {
        profileLogin();

        profile.getGoToBookStoreBtn().click();
        bookStore.addBook("Speaking JavaScript");
        Thread.sleep(2000);
        bookStore.getAddToCollection();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        bookStore.getBackToBookStore();
    }

    /*
     * Add Book 3
     * */

    @Test(priority = 9)
    public void addBook3() throws InterruptedException {
        profileLogin();

        profile.getGoToBookStoreBtn().click();
        bookStore.addBook("Learning JavaScript Design Patterns");
        Thread.sleep(2000);
        bookStore.getAddToCollection();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        bookStore.getBackToBookStore();
    }

    /*
     * Add Book 4
     * */

    @Test(priority = 10)
    public void addBook4() throws InterruptedException {
        profileLogin();

        profile.getGoToBookStoreBtn().click();
        bookStore.addBook("Designing Evolvable Web APIs with ASP.NET");
        Thread.sleep(2000);
        bookStore.getAddToCollection();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        bookStore.getBackToBookStore();
    }

    /*
     * Add Book 5
     * */

    @Test(priority = 11)
    public void addBook5() throws InterruptedException {
        profileLogin();

        profile.getGoToBookStoreBtn().click();
        bookStore.addBook("Programming JavaScript Applications");
        Thread.sleep(2000);
        bookStore.getAddToCollection();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        bookStore.getBackToBookStore();
    }

    /*
     * Cancel Delete Book
     * */

    @Test(priority = 12)
    public void cancelDeleteBook() {
        profileLogin();

        profile.delete(0);

        List<WebElement> name = driver.findElements(By.className("rt-tr-group"));

        for (int i = 0; i < name.size(); i++) {
            if (name.get(i).getText().compareTo(name.get(i).getText()) > 0) {
                Assert.fail();
            }
        }profile.getCancelBtn();
    }

    /*
     * Delete Book
     * */

    @Test(priority = 13)
    public void deleteBook() {
        profileLogin();

        profile.delete(0);

        List<WebElement> name = driver.findElements(By.className("rt-tr-group"));

        for (int i = 0; i < name.size(); i++) {
            if (name.get(i).getText().compareTo(name.get(i).getText()) > 0) {
                Assert.fail();
            }
        }

        profile.getOkBtn();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    /*
     * Rows
     * */

    @Test(priority = 14)
    public void rows() throws AWTException {
        loginProfile();

        profile.select("10");

        List<WebElement> filter = driver.findElements(By.className("rt-tr-group"));
        for (int i = 0; i < filter.size(); i++) {
            if (filter.size() != 10)
                Assert.fail();
        }
    }

    /*
     * Type to Search
     * */

    @Test(priority = 15)
    public void typeToSearch() {
        loginProfile();

        profile.inputSearchBox("Speaking JavaScript");
        Assert.assertTrue(driver.findElement(By.cssSelector("div[class='rt-tr -odd']")).isDisplayed());
    }

    /*
     * Sort
     * */

    @Test(priority = 16)
    public void sort() {
        loginProfile();

        profile.getSortImageBtn().click();
        profile.getSortTitleBtn().click();
        profile.getSortAuthorBtn().click();
        profile.getSortPublisherBtn().click();
        profile.getSortActionBtn().click();
    }

    @Test
    public void deleteAllBooks() throws AWTException {
        profileLogin();
        profile.zoomOut();
        profile.getDeleteAllBooksBtn().click();
        profile.getOkBtn();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    /*
     * Delete Account - Cancel
     * */

    @Test(priority = 17)
    public void deleteAccountCancel() {
        profileLogin();

        profile.getDeleteAccountBtn();
        profile.getCancelBtn();
    }

    /*
     * Delete Account
     * */

    @Test(priority = 18)
    public void deleteAccount() {
        profileLogin();

        profile.getDeleteAccountBtn();
        profile.getOkBtn();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    /*
     * Log out
     * */

    @Test(priority = 19)
    public void logOut(){
        profileLogin();

        profile.getLogOutBtn().click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/login");
    }
}

