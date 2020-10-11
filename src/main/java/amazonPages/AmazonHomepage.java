package amazonPages;

/**
 * Created by Shraddha Gupta on 10-10-2020.
 */

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AmazonHomepage {
    WebDriver driver;


    @FindBy(xpath="//div[@id='a-page']")
    WebElement resultPageFrame;

    @FindBy(how = How.ID,  using ="twotabsearchtextbox" )
    static WebElement searchbox ;


    @FindBy(how= How.ID,using ="nav-hamburger-menu" )
    static WebElement homePageMenu;



    @FindBy(how= How.CLASS_NAME,using ="nav-sprite hmenu-close-icon" )
    static WebElement ClosehomePageMenu;



    @FindBy(how= How.CLASS_NAME,using ="nav-logo-link" )
    @CacheLookup
    static WebElement amazonlogo;

    public AmazonHomepage(WebDriver driver)
    {
        driver=this.driver;

    }

    public static void click_HomePageMenu(WebDriver driver)
    {
        homePageMenu.click();
    }
    public static void close_HomePageMenu(WebDriver driver)
    {
        ClosehomePageMenu.click();
    }

    public static void click_AmazonLogo(WebDriver driver)
    {
        amazonlogo.click();
    }


    public static void setTxt_AmazonSearch(WebDriver driver,String searchCriteria)
    {
        searchbox.sendKeys(searchCriteria);
    }

    public static void setTxt_AmazonSearch(WebDriver driver,Keys searchCriteria)
    {
        searchbox.sendKeys(searchCriteria);
    }
}





