package au.com.cheapdomains;

import au.com.cheapdomains.WebDriverFactory.engine.DriverTypes;
import au.com.cheapdomains.WebDriverFactory.engine.WebDriverFactory;
import au.com.cheapdomains.model.Account;
import au.com.cheapdomains.model.AccountBuilder;
import au.com.cheapdomains.pages.Page;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class PositiveWithErrors {
    public WebDriver driver;
    private final Properties config = Config.loadProperties("src/main/resources/test.properties");
    private Page regPage;

    //    @BeforeMethod
    @BeforeTest
    public void beforeMethod(){
        driver = WebDriverFactory.getDriver(DriverTypes.CHROME);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //driver.get(config.getProperty("baseurl"));
    }

    // !!!Incompleted!!!
    @Test
    public void test1(){
        SoftAssert as = new SoftAssert();
        driver.get(config.getProperty("baseurl"));
        regPage = new Page(driver);

        as.assertAll();
    }

    @AfterTest
    public void cleanup() {
        driver.manage().deleteAllCookies();
//        TestHelper.sleep5Seconds();
        driver.close();
    }
}
