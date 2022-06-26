package demoQa_POM.demoQAHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DemoQaHomePage {

    public WebDriver driver;

    By categoryCards = By.cssSelector(".card.mt-4.top-card");

    public DemoQaHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getAllCategoryCards() {
        return driver.findElements(categoryCards);
    }

    public WebElement getElements() {
        return getAllCategoryCards().get(0);
    }

    public WebElement getForms() {
        return getAllCategoryCards().get(1);
    }

    public WebElement getAlertsFrameWindows() {
        return getAllCategoryCards().get(2);
    }

    public WebElement getWidgets() {
        return getAllCategoryCards().get(3);
    }

    public WebElement getInteractions() {
        return getAllCategoryCards().get(4);
    }

    public WebElement getBookStoreApplication() {
        return getAllCategoryCards().get(5);
    }

}
