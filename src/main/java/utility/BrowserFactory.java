package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import java.io.File;

/**
 * Created by Admin on 10-10-2020.
 */
public class BrowserFactory {

   static WebDriver driver;

    public static WebDriver startBrowser(String browserName,String URL)
    {

        if(browserName.equalsIgnoreCase("chrome"))
        {
            File driverFile = new File("C:\\IE Driver\\chromedriver.exe");

            System.setProperty("webdriver.chrome.driver", driverFile.getAbsolutePath());
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        }



        driver.manage().window().maximize();
        driver.get(URL);

        return driver;

    }


}
