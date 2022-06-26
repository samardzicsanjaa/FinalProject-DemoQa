package demoQa_POM.Tests.BookStoreApplicationTests;

import demoQa_POM.basePage.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookStoreApplicationTests extends BasePage {

    @BeforeMethod
    public void beforeMethod() {
        driver.navigate().to(url);
    }

    /*
     * Book Store Application
     * */

    @Test
    public void categoryBookStoreApplication() {
        demoQaHomePage.getBookStoreApplication().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books");
    }
}
