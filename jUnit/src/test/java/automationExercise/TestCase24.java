package automationExercise;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class TestCase24 extends TestBase {

    @Test
    public void test() throws InterruptedException {

        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//html[@lang='en']"));
        Assert.assertTrue(homePage.isDisplayed());

        //4. Add products to cart
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]")).click();

        //5. Click 'Cart' button
        Actions action = new Actions(driver);
        WebElement continueButton = driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']"));
        continueButton.click();
        action.sendKeys(Keys.PAGE_UP).perform();
        driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();


        //6. Verify that cart page is displayed
        driver.findElement(By.xpath("//section[@id='cart_items']")).isDisplayed();

        //7. Click Proceed To Checkout
        driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();

        //8. Click 'Register / Login' button
        driver.findElement(By.xpath("(//a[@href='/login'])[2]")).click();

        //9. Fill all details in Signup and create account
        WebElement nameElement = driver.findElement(By.xpath("//input[@type='text']"));
        Faker faker = new Faker();
        action.click(nameElement).sendKeys(faker.name().fullName()).
                sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress() + Keys.ENTER).perform();

        driver.findElement(By.xpath("//input[@type='radio']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(faker.internet().password());

        WebElement dayDDM = driver.findElement(By.xpath("//select[@data-qa='days']"));
        Select opt1 = new Select(dayDDM);
        opt1.selectByVisibleText("25");

        WebElement monthDDM = driver.findElement(By.xpath("//select[@data-qa='months']"));
        Select opt2 = new Select(monthDDM);
        opt2.selectByVisibleText("August");

        WebElement yearDDM = driver.findElement(By.xpath("//select[@data-qa='years']"));
        Select opt3 = new Select(yearDDM);
        opt3.selectByVisibleText("1991");
        driver.findElement(By.xpath("//input[@type='checkbox']"));
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        driver.findElement(By.xpath("//input[@data-qa='first_name']")).sendKeys("gokhan");
        driver.findElement(By.xpath("//input[@data-qa='last_name']")).sendKeys("meduna");
        driver.findElement(By.xpath("//input[@data-qa='company']")).sendKeys("wse");
        driver.findElement(By.xpath("//input[@data-qa='address']")).sendKeys("turkey/eskisehir");
        driver.findElement(By.xpath("//input[@data-qa='address2']")).sendKeys("turkey/eskisehir");


        WebElement countryDDM = driver.findElement(By.xpath("//select[@data-qa='country']"));
        Select opt4 = new Select(countryDDM);
        opt4.selectByVisibleText("Canada");

        driver.findElement(By.xpath("//input[@data-qa='state']")).sendKeys("Sentosa");
        driver.findElement(By.xpath("//input[@data-qa='city']")).sendKeys("Sentosa");
        driver.findElement(By.xpath("//input[@data-qa='zipcode']")).sendKeys("684965");
        driver.findElement(By.xpath("//input[@data-qa='mobile_number']")).sendKeys("05459632475");
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();

        //10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        driver.findElement(By.xpath("//*[text()='Account Created!']")).isDisplayed();
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();


        //11. Verify ' Logged in as username' at top
        driver.findElement(By.xpath("//div//li[9]")).isDisplayed();

        //12.Click 'Cart' button
        driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();

        //13. Click 'Proceed To Checkout' button
        driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();

        //14. Verify Address Details and Review Your Order
        driver.findElement(By.xpath("//*[text() = 'Address Details']")).isDisplayed();
        action.sendKeys((Keys.PAGE_DOWN)).perform();
        driver.findElement(By.xpath("//*[text() = 'Review Your Order']")).isDisplayed();

        //15. Enter description in comment text area and click 'Place Order'
        WebElement textAreaElementi = driver.findElement(By.xpath("//textarea[@class='form-control']"));
        textAreaElementi.sendKeys("I need that clothe. Please send it asap.");
        driver.findElement(By.xpath("//*[text()='Place Order']")).click();

        //16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        WebElement nameOnCardElementi = driver.findElement(By.xpath("//input[@class ='form-control']"));
        action.click(nameOnCardElementi).sendKeys(faker.name().fullName()).
                sendKeys(Keys.TAB).sendKeys(faker.business().creditCardNumber()).
                sendKeys(Keys.TAB).sendKeys(faker.business().creditCardExpiry()).
                sendKeys(Keys.TAB).sendKeys(faker.business().creditCardExpiry()).
                sendKeys(Keys.TAB).sendKeys(faker.business().creditCardExpiry()).perform();

        //17. Click 'Pay and Confirm Order' button
        driver.findElement(By.xpath("//button[@class='form-control btn btn-primary submit-button']")).click();

        //18. Verify success message 'Your order has been placed successfully!'
        driver.findElement(By.xpath("(//div[@class='alert-success alert'])[1]")).isDisplayed();

        //19. Click 'Download Invoice' button and verify invoice is downloaded successfully.
        WebElement downloadElementi = driver.findElement(By.xpath("//a[@href='/download_invoice/500']"));
        downloadElementi.click();
        Thread.sleep(5000);

        String ortakKisim = "\\Downloads\\invoice.txt";
        String farkliKisim = System.getProperty("user.home");

        String klasorYolu = farkliKisim + ortakKisim;
        System.out.println(klasorYolu);
        System.out.println(Files.exists(Paths.get(klasorYolu)));
        Assert.assertTrue(Files.exists(Paths.get(klasorYolu)));

        //20. Click 'Continue' button
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();

        //21. Click 'Delete Account' button
        driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();


    }


}
