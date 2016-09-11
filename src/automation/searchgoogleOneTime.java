package automation;

import Other.settings;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by davitpilishvili on 9/10/16.
 */
public class searchgoogleOneTime extends settings {

    @Test
    public void searchGoogleOneTime() throws InterruptedException {

        driver.get("https://www.google.com");

        // WebElement SearchBox =
        driver.findElement(By.id("lst-ib")).clear();

        driver.findElement(By.id("lst-ib")).sendKeys("google");

        //WebElement searchBtn =
        driver.findElement(By.name("btnG")).click();

        Thread.sleep(2000);

        String pageTitle = driver.getTitle();

        if (pageTitle.contains("google")) {

            System.out.println(pageTitle);
        } else {
            Assert.fail();
            System.out.println(pageTitle);
        }
    }
}