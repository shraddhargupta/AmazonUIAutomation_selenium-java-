import jdk.nashorn.internal.ir.annotations.Ignore;
import org.assertj.core.api.*;
import org.junit.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import amazonPages.AmazonHomepage;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserFactory;

import java.io.FileReader;
import java.util.Properties;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by Shraddha Gupta on 08-10-2020.
 */

public class SmokeTestPack {
    private static WebDriver driver;


    @BeforeClass
    public static void setUp() {
        driver = BrowserFactory.startBrowser("Chrome", "https://www.amazon.in/");
    }


    @Ignore
    public void Verify_HomePageMenu() {
        PageFactory.initElements(driver, AmazonHomepage.class);
        AmazonHomepage.click_HomePageMenu(driver);
//        AmazonHomepage.close_HomePageMenu(driver);
    }

    @Test
    public void ClickOnAmazonLogo() {
        PageFactory.initElements(driver, AmazonHomepage.class);
        AmazonHomepage.click_AmazonLogo(driver);

    }

    @Test
    public void VerifyAmazonSearch() {
        String searchCriteria ="Watch";
        PageFactory.initElements(driver, AmazonHomepage.class);
        AmazonHomepage.setTxt_AmazonSearch(driver, searchCriteria);
        AmazonHomepage.setTxt_AmazonSearch(driver, Keys.ENTER);
        String browsertitle=driver.getTitle();
        System.out.println("Browser Title After Search :"+browsertitle);
        assertThat(browsertitle).contains(searchCriteria);


    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
