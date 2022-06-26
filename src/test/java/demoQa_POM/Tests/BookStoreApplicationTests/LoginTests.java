package demoQa_POM.Tests.BookStoreApplicationTests;

import demoQa_POM.basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends BasePage {

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
     * Click on Login
     * */

    @Test(priority = 2)
    public void clickLogin() {
        categoryBookStoreApplication();

        bookStoreApplication.getLogin().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");
    }

    /*
     * Login - New User
     * */

    @Test(priority = 3)
    public void loginNewUser() {
        clickLogin();

        login.getNewUserButton().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/register");
    }

    /*
     * Login
     * */

    @Test(priority = 4)
    public void login() {
        clickLogin();
       /* Assert.assertEquals(driver.findElement(By.xpath("(//div)[60]")).getText(),
                "Welcome,\n" +
                        "Login in Book Store");*/

        login.inputFields("automatizacija", "Itbootcamp13!");
        wdwait.until(ExpectedConditions.urlToBe("https://demoqa.com/profile"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");

    }

    /*
     * Logout
     * */

    @Test(priority = 5)
    public void logout() {
        login();

        login.getLogOutButton().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");
    }
}
