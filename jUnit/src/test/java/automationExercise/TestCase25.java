package automationExercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestCase25 extends TestBase {

    @Test
    public void test() {
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//html[@lang='en']"));
        Assert.assertTrue(homePage.isDisplayed());

        //4. Scroll to bottom of page
        driver.findElement(By.xpath("//html[@lang='en']")).sendKeys(Keys.END);

        //5. Verify 'SUBSCRIPTION' is visible
        driver.findElement(By.xpath("//*[text()='Subscription']")).isDisplayed();

        //6. Click on arrow at bottom right side to move upward
        driver.findElement(By.xpath("//i[@class='fa fa-angle-up']")).click();

        //7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
        driver.findElement(By.xpath("(//*[text()='Full-Fledged practice website for Automation Engineers'])")).isDisplayed();


    }


}
