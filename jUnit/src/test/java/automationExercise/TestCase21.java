package automationExercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TestCase21 extends TestBase {

    @Test
    public void test() {

        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");

        //3. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();

        //4. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement allProductsPage = driver.findElement(By.xpath("(//div[@class='container'])[3]"));
        Assert.assertTrue(allProductsPage.isDisplayed());

        //5. Click on 'View Product' button
        driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();

        //6. Verify 'Write Your Review' is visible
        driver.findElement(By.xpath("//a[@href='#reviews']")).isDisplayed();

        //7. Enter name, email and review
        Actions action = new Actions(driver);
        WebElement nameElementi = driver.findElement(By.xpath("//input[@id='name']"));
        action.click(nameElementi).sendKeys("gokhan").sendKeys(Keys.TAB).
                sendKeys("gokhanagar1@gmail.com").sendKeys(Keys.TAB).
                sendKeys("Thank you for your help").perform();

        //8. Click 'Submit' button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //9. Verify success message 'Thank you for your review.'
        WebElement basariliMesajElementi = driver.findElement(By.xpath("//*[text()='Thank you for your review.']"));
        Assert.assertTrue(basariliMesajElementi.isDisplayed());


    }


}
