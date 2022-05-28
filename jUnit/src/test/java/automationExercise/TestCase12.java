package automationExercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TestCase12 extends TestBase {

    @Test
    public void test() throws InterruptedException {

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        driver.findElement(By.xpath("//html[@lang='en']")).isDisplayed();

        //4. Click 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();

        //5. Hover over first product and click 'Add to cart'
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]")).click();

        //6. Click 'Continue Shopping' button
        //driver.findElement(By.xpath("//*[text()='Continue Shopping']")).isDisplayed();
        driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();


        //7. Hover over second product and click 'Add to cart'
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[3]")).click();

        //8. Click 'View Cart' button
        driver.findElement(By.xpath("//*[text()='View Cart']")).click();

        //9. Verify both products are added to Cart
        action.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.xpath("//a[@href='/product_details/1']")).isDisplayed();
        driver.findElement(By.xpath("//a[@href='/product_details/2']")).isDisplayed();

        //10. Verify their prices, quantity and total price
        driver.findElement(By.xpath("//td[@class='cart_price']")).isDisplayed();
        driver.findElement(By.xpath("//td[@class='cart_quantity']")).isDisplayed();
        driver.findElement(By.xpath("//td[@class='cart_total']")).isDisplayed();


        driver.findElement(By.xpath("(//td[@class='cart_price'])[2]")).isDisplayed();
        driver.findElement(By.xpath("(//td[@class='cart_quantity'])[2]")).isDisplayed();
        driver.findElement(By.xpath("(//td[@class='cart_total'])[2]")).isDisplayed();


    }


}
