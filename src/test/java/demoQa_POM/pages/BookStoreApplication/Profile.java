package demoQa_POM.pages.BookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class Profile extends BookStoreApplication {

    public final String url = "https://demoqa.com/profile";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Profile(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By loginProfile = By.linkText("login");
    By registerProfile = By.linkText("register");

    By userName = By.id("userName");
    By password = By.id("password");
    By loginButton = By.id("login");

    By searchBox = By.id("searchBox");
    By logOutBtn = By.xpath("(//button[normalize-space()='Log out'])[1]");

    By sortImageBtn = By.xpath("//div[contains(text(),'Image')]");
    By sortTitleBtn = By.xpath("//div[contains(text(),'Title')]");
    By sortAuthorBtn = By.xpath("//div[contains(text(),'Author')]");
    By sortPublisherBtn = By.xpath("//div[contains(text(),'Publisher')]");
    By sortActionBtn = By.xpath("//div[contains(text(),'Action')]");

    By rows = By.cssSelector("select[aria-label=\"rows per page\"]");

    By goToBookStoreBtn = By.id("gotoStore");
    By deleteAccountBtn = By.xpath("//div[@class='text-center button']//button[@id='submit']");
    By deleteAllBooksBtn = By.cssSelector(".text-right.button.di");

    By website = By.xpath("//div[@id='website-wrapper']//label[@id='userName-value']");
    By backToBookStore = By.cssSelector(".text-left.fullButton");
    By addToYourCollection = By.cssSelector(".text-right.fullButton");
    By deleteBook = By.cssSelector(".rt-tbody");
    By deleteBtn = By.xpath("(//*[name()='path'])[54]");
    By okBtn = By.id("closeSmallModal-ok");
    By cancelBtn = By.id("closeSmallModal-cancel");

    public List<WebElement> getDeleteBook() {
        return driver.findElements(deleteBook);
    }

    public void delete(int i) {
        getDeleteBook().get(i).findElement(deleteBtn).click();
    }

    public void getOkBtn() {
        driver.findElement(okBtn).click();
    }

    public void getCancelBtn() {
        driver.findElement(cancelBtn).click();
    }

    public WebElement getLoginProfile() {
        return driver.findElement(loginProfile);
    }

    public WebElement getRegisterProfile() {
        return driver.findElement(registerProfile);
    }

    public WebElement getUserName() {
        return driver.findElement(userName);
    }

    public WebElement getPassword() {
        return driver.findElement(password);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    public void inputFieldsLogin(String userName, String password) {
        getUserName().sendKeys(userName);
        getPassword().sendKeys(password);
        getLoginButton().click();
    }

    public WebElement getSearchBox() {
        return driver.findElement(searchBox);
    }

    public WebElement getLogOutBtn() {
        return driver.findElement(logOutBtn);
    }

    public WebElement getSortImageBtn() {
        return driver.findElement(sortImageBtn);
    }

    public WebElement getSortTitleBtn() {
        return driver.findElement(sortTitleBtn);
    }

    public WebElement getSortAuthorBtn() {
        return driver.findElement(sortAuthorBtn);
    }

    public WebElement getSortPublisherBtn() {
        return driver.findElement(sortPublisherBtn);
    }

    public WebElement getSortActionBtn() {
        return driver.findElement(sortActionBtn);
    }

    public WebElement getGoToBookStoreBtn() {
        scroll();
        return driver.findElement(goToBookStoreBtn);
    }

    public void getDeleteAccountBtn() {
        scroll();
        driver.findElement(deleteAccountBtn).sendKeys(Keys.TAB);
        driver.findElement(deleteAccountBtn).sendKeys(Keys.ENTER);
    }

    public WebElement getDeleteAllBooksBtn() {
        scroll();
        return driver.findElement(deleteAllBooksBtn);
    }

    public WebElement getWebsite() {
        return driver.findElement(website);
    }

    public WebElement getBackToBookStore() {
        wdwait.until(ExpectedConditions.elementToBeClickable(backToBookStore));
        return driver.findElement(backToBookStore);
    }

    public WebElement getAddToYourCollection() {
        return driver.findElement(addToYourCollection);
    }

    public void select(String value) {
        Select sort = new Select(driver.findElement(rows));
        sort.selectByValue(value);
    }

    public void inputSearchBox(String input) {
        getSearchBox().sendKeys(input);
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
