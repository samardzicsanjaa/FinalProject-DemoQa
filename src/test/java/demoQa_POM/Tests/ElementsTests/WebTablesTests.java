package demoQa_POM.Tests.ElementsTests;

import demoQa_POM.basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesTests extends BasePage {

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
     * Click on Web Tables
     * */

    @Test(priority = 2)
    public void clickWebTables() {
        categoryElements();
        elements.getWebTables().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/webtables");
    }

    /*
     * Add New
     * */

    @Test(priority = 3)
    public void addNew() {
        clickWebTables();
        webTables.getAddNewRecordButton().click();
        webTables.inputFieldsWebTables("Sanja", "Samardzic", "testprojekat@yahoo.com", "27",
                "12050", "Compliance");
    }

    /*
     * Add new - Close
     * */

    @Test(priority = 4)
    public void addNewClose() {
        clickWebTables();

        webTables.getAddNewRecordButton().click();
        webTables.getClose().click();
        Assert.assertTrue(driver.findElement(By.cssSelector(".web-tables-wrapper")).isDisplayed());
    }

    /*
     * Sort
     * */

    @Test(priority = 5)
    public void sort() {
        addNew();

        webTables.getSortFirstName().click();
        webTables.getSortLastName().click();
        webTables.getSortEmail().click();
        webTables.getSortAge().click();
        webTables.getSortSalary().click();
        webTables.getSortDepartment().click();
        webTables.getSortActions().click();
        Assert.assertTrue(driver.findElement(By.xpath("(//div[@role='columnheader'])[1]")).isDisplayed());
    }


    /*
     * Type of Search
     * */

    @Test(priority = 6)
    public void typeOfSearch() {
        clickWebTables();

        webTables.inputSearchBox("Alden");
        Assert.assertTrue(driver.findElement(By.xpath("//div[normalize-space()='Alden']")).isDisplayed());
    }

    /*
     * Search Button is Displayed
     * */

    @Test(priority = 7)
    public void searchButtonIsDisplayed() {
        clickWebTables();

        webTables.getSearchButton().isDisplayed();
        Assert.assertTrue(driver.findElement(By.id("basic-addon2")).isDisplayed());
    }

    /*
     * Edit First Name
     * */

    @Test(priority = 8)
    public void editFirstName() {
        clickWebTables();

        webTables.getEdit().click();
        webTables.getFirstName().clear();
        webTables.getFirstName().sendKeys("Ana");
        webTables.getSubmit().click();
        Assert.assertEquals(driver.findElement(By.xpath("(//div[normalize-space()='Ana'])[1]")).getText(),
                "Ana");
    }

    /*
     * Delete Cierra Vega
     * */

    @Test(priority = 9)
    public void delete() {
        clickWebTables();

        webTables.delete(0);

        List<WebElement> name = driver.findElements(By.className("rt-tr-group"));

        for (int i = 0; i < name.size(); i++) {
            if (name.get(i).getText().compareTo(name.get(i).getText()) > 0) {
                Assert.fail();
            }
        }
    }

    /*
     * Rows
     * */

    @Test(priority = 10)
    public void rows() {
        clickWebTables();

        webTables.select("5");

        List<WebElement> filter = driver.findElements(By.className("rt-tr-group"));
        for (int i = 0; i < filter.size(); i++) {
            if (filter.size() != 5)
                Assert.fail();
        }
    }

    /*
     * Add Users
     * */

    @Test(priority = 11)
    public void addUsers() {
        clickWebTables();

        webTables.select("5");

        webTables.getAddNewRecordButton().click();
        webTables.inputFieldsWebTables("Nikola", "Nikolic", "testprojekat@yahoo.com",
                "33", "13450", "QA");

        webTables.getAddNewRecordButton().click();
        webTables.inputFieldsWebTables("Jovan", "Jovanovic", "testprojekat@yahoo.com",
                "20", "15000", "QA");

        webTables.getAddNewRecordButton().click();
        webTables.inputFieldsWebTables("Ivana", "Ivanovic", "testprojekat@yahoo.com",
                "40", "10000", "QA");
    }

    /*
     * Next Page
     * */

    @Test(priority = 12)
    public void nextPage() {
        addUsers();

        webTables.getPage().clear();
        webTables.getPage().sendKeys("2");
        webTables.getPage().sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.findElement(By.cssSelector(".-totalPages")).getText(), "2");
    }

    /*
     * Click on Button Next
     * */

    @Test(priority = 13)
    public void nextButton() {
        addUsers();

        webTables.getNextPage().click();
        Assert.assertTrue(driver.findElement(By.className("-next")).isDisplayed());
    }

    /*
     * Click on Button Previous
     * */

    @Test(priority = 14)
    public void previousButton() {
        nextButton();

        webTables.getPreviousPage().click();
        Assert.assertTrue(driver.findElement(By.className("-previous")).isDisplayed());
    }

}

