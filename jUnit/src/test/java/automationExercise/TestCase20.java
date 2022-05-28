package automationExercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TestCase20 extends TestBase {

    @Test
    public void test() {
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");

        //3. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();

        //4. Verify user is navigated to ALL PRODUCTS page successfully
        driver.findElement(By.xpath("(//div[@class='container'])[3]")).isDisplayed();

        //5. Enter product name in search input and click search button
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@type = 'text']"));
        aramaKutusu.sendKeys("Blue Top");
        driver.findElement(By.xpath("//button[@type='button']")).click();

        //6. Verify 'SEARCHED PRODUCTS' is visible
        driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed();

        //7. Verify all the products related to search are visible
        driver.findElement(By.xpath("//div[@class='productinfo text-center']")).isDisplayed();

        //8. Add those products to cart
        driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']")).click();

        //9. Click 'Cart' button and verify that products are visible in cart
        WebElement continueButton = driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']"));
        continueButton.click();
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_UP).perform();
        driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();

        driver.findElement(By.xpath("//section[@id='cart_items']")).isDisplayed();

        //10. Click 'Signup / Login' button and submit login details
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        WebElement emailElement = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        action.click(emailElement).sendKeys("gokhanagar1@gmail.com").
                sendKeys(Keys.TAB).sendKeys("12345").sendKeys(Keys.ENTER);

        //11. Again, go to Cart page
        driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();

        // 12. Verify that those products are visible in cart after login as well
        driver.findElement(By.xpath("//section[@id='cart_items']")).isDisplayed();


    }


}
