package automation;

import Other.settings;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by davitpilishvili on 9/10/16.
 */
public class searchHelp extends settings {

    @Test
    public void searchHelpTopics () {

        driver.get("https://www.google.com");

        driver.findElement(By.id("lst-ib")).clear();

        driver.findElement(By.id("lst-ib")).sendKeys("google");

        driver.findElement(By.name("btnG")).click();

        driver.findElement(By.linkText("×")).click();

        driver.findElement(By.id("ab_opt_icon")).click();

        driver.findElement(By.linkText("Search help")).click();

        String attributeValueOfFirstHelpTopicBefore = driver.findElement(By.xpath("//article/nav[@class='accordion-homepage']/section[h2[text()='Popular articles']]/div/div")).getAttribute("style");

        Assert.assertTrue(attributeValueOfFirstHelpTopicBefore.equals("margin-top: 0px;"));

        //System.out.println("attribute Value Of First Help Topic Before: " + attributeValueOfFirstHelpTopicBefore);

        driver.findElement(By.cssSelector("article>nav[class='accordion-homepage']>section:last-child")).click();

        String attributeValueOfFirstHelpTopicAfter = driver.findElement(By.xpath("//article/nav[@class='accordion-homepage']/section[h2[text()='Popular articles']]/div/div")).getAttribute("style");

        Assert.assertFalse(attributeValueOfFirstHelpTopicAfter.equals("margin-top: 0px;"));
        //System.out.println("attribute Value Of First Help Topic After: " + attributeValueOfFirstHelpTopicAfter);











    }
}
