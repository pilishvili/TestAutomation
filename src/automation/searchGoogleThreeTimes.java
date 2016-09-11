package automation;

import Other.settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by davitpilishvili on 9/10/16.
 */
public class searchGoogleThreeTimes extends settings {

    @Test
    public void searchgoogleThreeTimes () throws InterruptedException {

        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.id("lst-ib"));

        WebElement searchBtn = driver.findElement(By.name("btnG"));

        String term [] = {"selenium", "atomation", "webdriver"};

        String eachPageTitle = "";

        boolean titleContainsTerm = false;

        for (int i = 0; i < term.length; i++) {

            searchBox.clear();

            searchBox.sendKeys(term[i]);

            searchBtn.click();

            Thread.sleep(2000);

            eachPageTitle = driver.getTitle();

            titleContainsTerm = eachPageTitle.contains(term[i]);
           //  System.out.println(eachPageTitle + i);

            if (eachPageTitle.contains(term[i])){
                System.out.println("Page Title: " + eachPageTitle);
                System.out.println("Search Term: " + term[i]);
                System.out.println("Page Title Contains search terms");
                System.out.println("");
            } else {
                System.out.println("Page Title: " + eachPageTitle);
                System.out.println("Search Term: " + term[i]);
                System.out.println("Page Title Contains search terms");
                System.out.println("");

                Assert.fail();
            }
        }



    }
}
