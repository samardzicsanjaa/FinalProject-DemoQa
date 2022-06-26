package demoQa_POM.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebTables extends Elements {

    public final String url = "https://demoqa.com/webtables";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public WebTables(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By addNewRecordButton = By.id("addNewRecordButton");
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By userEmail = By.id("userEmail");
    By age = By.id("age");
    By salary = By.id("salary");
    By department = By.id("department");
    By submit = By.id("submit");
    By close = By.className("close");

    By searchBox = By.id("searchBox");
    By searchButton = By.id("basic-addon2");

    By sortFirstName = By.xpath("(//div[contains(text(),'First Name')])[1]");
    By sortLastName = By.xpath("(//div[contains(text(),'Last Name')])[1]");
    By sortAge = By.xpath("(//div[contains(text(),'Age')])[1]");
    By sortEmail = By.xpath("(//div[contains(text(),'Email')])[1]");
    By sortSalary = By.xpath("(//div[contains(text(),'Salary')])[1]");
    By sortDepartment = By.xpath("(//div[contains(text(),'Department')])[1]");
    By sortActions = By.xpath("(//div[contains(text(),'Action')])[1]");
    By edit = By.id("edit-record-1");
    By delete = By.id("delete-record-1");
    By exist = By.cssSelector(".rt-tbody");

    By page = By.cssSelector("input[value=\"1\"]");
    By nextPage = By.className("-next");
    By previousPage = By.className("-previous");
    By rows = By.cssSelector("select[aria-label=\"rows per page\"]");


    public WebElement getAddNewRecordButton() {
        return driver.findElement(addNewRecordButton);
    }

    public WebElement getFirstName() {
        return driver.findElement(firstName);
    }

    public WebElement getLastName() {
        return driver.findElement(lastName);
    }

    public WebElement getUserEmail() {
        return driver.findElement(userEmail);
    }

    public WebElement getAge() {
        return driver.findElement(age);
    }

    public WebElement getSalary() {
        return driver.findElement(salary);
    }

    public WebElement getDepartment() {
        return driver.findElement(department);
    }

    public WebElement getSubmit() {
        return driver.findElement(submit);
    }

    public WebElement getClose() {
        return driver.findElement(close);
    }

    public WebElement getSearchBox() {
        return driver.findElement(searchBox);
    }

    public WebElement getSearchButton() {
        return driver.findElement(searchButton);
    }

    public WebElement getSortFirstName() {
        return driver.findElement(sortFirstName);
    }

    public WebElement getSortLastName() {
        return driver.findElement(sortLastName);
    }

    public WebElement getSortAge() {
        return driver.findElement(sortAge);
    }

    public WebElement getSortEmail() {
        return driver.findElement(sortEmail);
    }

    public WebElement getSortSalary() {
        return driver.findElement(sortSalary);
    }

    public WebElement getSortDepartment() {
        return driver.findElement(sortDepartment);
    }

    public WebElement getSortActions() {
        return driver.findElement(sortActions);
    }

    public WebElement getEdit() {
        return driver.findElement(edit);
    }

    public WebElement getPage() {
        return driver.findElement(page);
    }

    public WebElement getNextPage() {
        return driver.findElement(nextPage);
    }

    public WebElement getPreviousPage() {
        return driver.findElement(previousPage);
    }

    public void inputSearchBox(String input) {
        getSearchBox().sendKeys(input);
    }

    public void inputFieldsWebTables(String firstName, String lastName, String userEmail, String age, String salary,
                                     String department) {
        getFirstName().sendKeys(firstName);
        getLastName().sendKeys(lastName);
        getUserEmail().sendKeys(userEmail);
        getAge().sendKeys(age);
        getSalary().sendKeys(salary);
        getDepartment().sendKeys(department);
        getSubmit().click();
    }

    public List<WebElement> getExist() {
        return driver.findElements(exist);
    }

    public void delete(int i) {
        getExist().get(i).findElement(delete).click();
    }

    public void select(String value) {
        Select sort = new Select(driver.findElement(rows));
        sort.selectByValue(value);
    }
}
