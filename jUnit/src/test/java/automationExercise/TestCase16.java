package automationExercise;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TestCase16 extends TestBase {

    @Test
    public void test() throws InterruptedException {

        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//html[@lang='en']"));
        Assert.assertTrue(homePage.isDisplayed());

        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();

        // 5. Fill email, password and click 'Login' button
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("gokhanagar1@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

        //6. Verify 'Logged in as username' at top
        driver.findElement(By.xpath("//div//li[9]")).isDisplayed();

        //7. Add products to cart
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]")).click();
        Thread.sleep(2000);

        //8. Click 'Cart' button
        WebElement continueButton = driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']"));
        continueButton.click();
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_UP).perform();
        driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();

        //9. Verify that cart page is displayed
        driver.findElement(By.xpath("//section[@id='cart_items']")).isDisplayed();

        //10. Click Proceed To Checkout
        driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();

        //11. Verify Address Details and Review Your Order
        driver.findElement(By.xpath("//div[@class = 'checkout-information']")).isDisplayed();
        action.sendKeys((Keys.PAGE_DOWN)).perform();
        driver.findElement(By.xpath("//div[@class = 'table-responsive cart_info']")).isDisplayed();

        //12. Enter description in comment text area and click 'Place Order'
        WebElement textAreaElementi = driver.findElement(By.xpath("//textarea[@class='form-control']"));
        textAreaElementi.sendKeys("I need that clothe. Please send it asap.");
        driver.findElement(By.xpath("//*[text()='Place Order']")).click();

        //13. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        WebElement nameOnCardElementi = driver.findElement(By.xpath("//input[@class ='form-control']"));
        Faker faker = new Faker();
        action.click(nameOnCardElementi).sendKeys(faker.name().fullName()).
                sendKeys(Keys.TAB).sendKeys(faker.business().creditCardNumber()).
                sendKeys(Keys.TAB).sendKeys(faker.business().creditCardExpiry()).
                sendKeys(Keys.TAB).sendKeys(faker.business().creditCardExpiry()).
                sendKeys(Keys.TAB).sendKeys(faker.business().creditCardExpiry()).perform();

        //14. Click 'Pay and Confirm Order' button
        driver.findElement(By.xpath("//button[@class='form-control btn btn-primary submit-button']")).click();

        //15. Verify success message 'Your order has been placed successfully!'
        driver.findElement(By.xpath("(//div[@class='alert-success alert'])[1]")).isDisplayed();

        //16. Click 'Delete Account' button
        driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();


    }


}
