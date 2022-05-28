package automationExercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TestCase11 extends TestBase {

    @Test
    public void test() {

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        driver.findElement(By.xpath("//html[@lang='en']")).isDisplayed();

        //4. Click 'Cart' button
        driver.findElement(By.xpath("//a[@href='/view_cart']")).click();

        //5. Scroll down to footer
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).perform();

        //6. Verify text 'SUBSCRIPTION'
        driver.findElement(By.xpath("//*[text()='Subscription']")).isDisplayed();

        //7. Enter email address in input and click arrow button
        WebElement subscription = driver.findElement(By.xpath("//input[@type='email']"));
        subscription.sendKeys("asd@gmail.com" + Keys.ENTER);


        //8. Verify success message 'You have been successfully subscribed!' is visible
        driver.findElement(By.xpath("//*[text()='You have been successfully subscribed!']")).isDisplayed();


    }


}
