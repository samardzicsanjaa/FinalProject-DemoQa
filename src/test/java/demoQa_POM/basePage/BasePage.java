package demoQa_POM.basePage;

import demoQa_POM.demoQAHomePage.DemoQaHomePage;
import demoQa_POM.pages.BookStoreApplication.BookStore;
import demoQa_POM.pages.BookStoreApplication.BookStoreApplication;
import demoQa_POM.pages.BookStoreApplication.Login;
import demoQa_POM.pages.BookStoreApplication.Profile;
import demoQa_POM.pages.Elements.*;
import demoQa_POM.pages.Forms.Forms;
import demoQa_POM.pages.Forms.PracticeForm;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePage {

    public final String url = "https://demoqa.com/";
    public WebDriverManager wmd;
    public WebDriver driver;
    public WebDriverWait wdwait;
    public DemoQaHomePage demoQaHomePage;
    public Elements elements;
    public TextBox textBox;
    public CheckBox checkBox;
    public RadioButton radioButton;
    public WebTables webTables;
    public Buttons buttons;
    public Links links;
    public BrokenLinksImages brokenLinksImages;
    public UploadAndDownload uploadAndDownload;
    public DynamicProperties dynamicProperties;
    public Forms forms;
    public PracticeForm practiceForm;
    public BookStoreApplication bookStoreApplication;
    public Login login;
    public BookStore bookStore;
    public Profile profile;

    @BeforeClass
    public void beforeClass() {
        wmd = new ChromeDriverManager();
        wmd.setup();
        driver = new ChromeDriver();
        //driver.manage().window().minimize();
        driver.manage().window().maximize();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        demoQaHomePage = new DemoQaHomePage(driver);
        elements = new Elements(driver);
        textBox = new TextBox(driver);
        checkBox = new CheckBox(driver);
        radioButton = new RadioButton(driver);
        webTables = new WebTables(driver);
        buttons = new Buttons(driver);
        links = new Links(driver);
        brokenLinksImages = new BrokenLinksImages(driver);
        uploadAndDownload = new UploadAndDownload(driver);
        dynamicProperties = new DynamicProperties(driver, wdwait);
        forms = new Forms(driver);
        practiceForm = new PracticeForm(driver, wdwait);
        bookStoreApplication = new BookStoreApplication(driver);
        login = new Login(driver);
        bookStore = new BookStore(driver);
        profile = new Profile(driver);
    }


    @AfterClass
    public void afterClass() {
        //wdwait = null;
       // driver.quit();
      //  driver = null;
       // wmd = null;
    }
}
