package Other;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by davitpilishvili on 9/10/16.
 */
public class settings {

   public WebDriver driver;

    @BeforeMethod
     public void setUp () {

        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void scloseBrowser(){
        driver.quit();
    }
}
