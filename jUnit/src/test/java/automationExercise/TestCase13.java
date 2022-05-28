package automationExercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TestCase13 extends TestBase {

    @Test
    public void test() throws InterruptedException {

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        driver.findElement(By.xpath("//html[@lang='en']")).isDisplayed();

        //4. Click 'View Product' for any product on home page
        Actions action = new Actions(driver);
        //action.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();

        //5. Verify product detail is opened
        driver.findElement(By.xpath("//div[@class='product-information']")).isDisplayed();

        //6. Increase quantity to 4
        WebElement quantity = driver.findElement(By.xpath("//input[@name='quantity']"));
        quantity.clear();
        //  quantity.sendKeys(Keys.DELETE);
        quantity.sendKeys("4");
        Thread.sleep(3000);

        //7. Click 'Add to cart' button
        driver.findElement(By.xpath("//button[@type='button']")).click();

        //8. Click 'View Cart' button
        driver.findElement(By.xpath("(//a[@href='/view_cart'])[2]")).click();

        //9. Verify that product is displayed in cart page with exact quantity
        action.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.xpath("//td[@class='cart_description']")).isDisplayed();

        WebElement cartQuantity = driver.findElement(By.xpath("//td[@class='cart_quantity']"));
        String actualQuantity = cartQuantity.getText();
        String expectedQuantity = "4";

        Assert.assertEquals(expectedQuantity, actualQuantity);


    }


}
