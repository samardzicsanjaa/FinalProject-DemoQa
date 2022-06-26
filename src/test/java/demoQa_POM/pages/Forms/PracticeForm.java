package demoQa_POM.pages.Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PracticeForm extends Forms {

    public final String url = "https://demoqa.com/forms";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public PracticeForm(WebDriver driver, WebDriverWait wdwait) {
        super(driver);
        this.driver = driver;
        this.wdwait = wdwait;
    }

    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By userEmail = By.id("userEmail");
    By female = By.cssSelector("label[for=\"gender-radio-2\"]");
    By userMobile = By.id("userNumber");
    By dateField = By.id("dateOfBirthInput");
    By dayChoose = By.cssSelector("div[aria-label=\"Choose Tuesday, June 5th, 1990\"]");

    By subject = By.id("subjectsInput");
    By hobbiesSports = By.cssSelector("label[for=\"hobbies-checkbox-1\"]");
    By hobbiesReading = By.cssSelector("label[for=\"hobbies-checkbox-2\"]");
    By hobbiesMusic = By.cssSelector("label[for=\"hobbies-checkbox-3\"]");

    By chooseFile = By.id("uploadPicture");
    By currentAddres = By.id("currentAddress");
    By state = By.id("react-select-3-input");
    By city = By.id("react-select-4-input");
    By submit = By.id("submit");
    By close = By.id("closeLargeModal");

    public void getFirstName() {
        driver.findElement(firstName).sendKeys("Sanja");
    }

    public void getLastName() {
        driver.findElement(lastName).sendKeys("Samardzic");
    }

    public void getEmail() {
        driver.findElement(userEmail).sendKeys("testprojekat@yahoo.com");
    }

    public WebElement getFemale() {
        return driver.findElement(female);
    }

    public void getMobileNumber() {
        driver.findElement(userMobile).sendKeys("0641111111");
    }

    public void getDateField() throws InterruptedException {
        driver.findElement(dateField).click();
        Select dropdownMonth = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        List<WebElement> listMonth = dropdownMonth.getOptions();
        for (WebElement we : listMonth) {
        }
        dropdownMonth.selectByValue("4");

        Select dropdownYear = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        List<WebElement> listYear = dropdownYear.getOptions();
        for (WebElement web : listYear) {
        }
        dropdownYear.selectByValue("1990");

        driver.findElement(dayChoose).click();
    }

    public void getSubjects() {
        WebElement subjects = driver.findElement(subject);
        subjects.sendKeys("e");
        subjects.sendKeys(Keys.ENTER);
    }

    public void getHobbiesSports() {
        driver.findElement(hobbiesSports).click();
    }

    public void getHobbiesReading() {
        driver.findElement(hobbiesReading).click();
    }

    public void getHobbiesMusic() {
        driver.findElement(hobbiesMusic).click();
    }

    public WebElement getChooseFile() {
        return driver.findElement(chooseFile);
    }

    public void getCurrentAddress() {
        driver.findElement(currentAddres).sendKeys("Kralja Petra");
    }

    public void getState() {
        WebElement states = driver.findElement(state);
        states.sendKeys(Keys.ARROW_DOWN);
        states.sendKeys(Keys.ENTER);
    }

    public void getCity() {
        WebElement cities = driver.findElement(city);
        cities.sendKeys(Keys.ARROW_DOWN);
        cities.sendKeys(Keys.ENTER);
    }

    public void getSubmit() {
        driver.findElement(submit).submit();
    }

    public void getClose() {
        scroll();
        driver.findElement(close).sendKeys(Keys.TAB);
        driver.findElement(close).sendKeys(Keys.ENTER);
    }


}


