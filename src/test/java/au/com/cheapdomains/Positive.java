package au.com.cheapdomains;

import au.com.cheapdomains.WebDriverFactory.engine.DriverTypes;
import au.com.cheapdomains.WebDriverFactory.engine.WebDriverFactory;
import au.com.cheapdomains.dataproviders.RegDataProvider;
import au.com.cheapdomains.model.Account;
import au.com.cheapdomains.pages.Page;
import au.com.cheapdomains.utils.TestHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Positive {
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

    @Test(dataProvider = "regUsers", dataProviderClass = RegDataProvider.class)
    public void fillAll_noAlerts(Account account){
        SoftAssert as = new SoftAssert();
        driver.get(config.getProperty("baseurl"));
        regPage = new Page(driver);

        regPage.fillRegForm(account).continueOrderClick();
//        TestHelper.sleep5Seconds();
        as.assertTrue(!regPage.isAlertPresent(), "Alert is present");
        as.assertAll();
    }

    // !!! Incompleted !!!
    @Test
    public void startCondition(){
        SoftAssert as = new SoftAssert();
        driver.get(config.getProperty("baseurl"));
        regPage = new Page(driver);
        TestHelper.sleep5Seconds();

//        as.assertTrue(regPage.getText_first_name_input().equals(""), "first_name_input is not empty");
        as.assertEquals(regPage.getText_first_name_input(),"", "first_name_input is not empty");

        as.assertEquals(regPage.getText_last_name_input(),"", "last_name_input is not empty");
        as.assertEquals(regPage.getText_address_input(),"", "address_input is not empty");
        as.assertEquals(regPage.getText_city_input(),"", "city_input is not empty");

        as.assertEquals(regPage.getText_post_code_input(),"", "post_code_input is not empty");
        TestHelper.sleep5Seconds();
        as.assertTrue(regPage.getText_countrySelect().equals("Select a Country"), "Country SELECT is not empty"); // No Default Values
        as.assertEquals (regPage.getText_countrySelect(),"Select a Country"/*, "Country SELECT is not empty"*/); // No Default Values
        as.assertTrue(regPage.getTag_state_field().equals("input"), "state_field is not empty");
        as.assertTrue(regPage.getText_state_field().equals(""), "state_field is not empty"); // No Default Values

        as.assertTrue(regPage.getText_phone_number().equals(""), "phone_number is not empty");
        as.assertTrue(regPage.getText_email_input().equals(""), "email_input is not empty");

        as.assertTrue(regPage.getText_email_input().equals(""), "email_input is not empty");

        as.assertTrue(regPage.getText_username_input().equals(""), "username_input is not empty");
        as.assertTrue(regPage.getText_password_input().equals(""), "password_input is not empty");

        as.assertAll();
    }

    @AfterTest
    public void cleanup() {
        driver.manage().deleteAllCookies();
//        TestHelper.sleep5Seconds();
        driver.close();
    }
}
