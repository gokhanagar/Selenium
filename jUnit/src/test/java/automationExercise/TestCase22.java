package automationExercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestCase22 extends TestBase {

    @Test
    public void test() throws InterruptedException {

        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");

        //3. Scroll to bottom of page
        driver.findElement(By.xpath("//html[@lang='en']")).sendKeys(Keys.END);

        //4. Verify 'RECOMMENDED ITEMS' are visible
        driver.findElement(By.xpath("(//h2[@class = 'title text-center'])[2]")).isDisplayed();

        //5. Click on 'Add To Cart' on Recommended product
        driver.findElement(By.xpath("//a[@class = 'btn btn-default add-to-cart']")).click();

        // 6. Click on 'View Cart' button
        driver.findElement(By.xpath("(//a[@href='/view_cart'])[2]")).click();

        //7. Verify that product is displayed in cart page
        WebElement cartPage = driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        Assert.assertTrue(cartPage.isDisplayed());


    }


}
