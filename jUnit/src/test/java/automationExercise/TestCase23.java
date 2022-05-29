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

public class TestCase23 extends TestBase {


    @Test
    public void test() throws InterruptedException {

        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//html[@lang='en']"));
        Assert.assertTrue(homePage.isDisplayed());

        //4. Click 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();

        //5. Fill all details in Signup and create account
        Actions action = new Actions(driver);
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
        WebElement adresElementi = driver.findElement(By.xpath("//input[@data-qa='address']"));
        adresElementi.sendKeys("turkey/eskisehir");
        String actualAdres = "turkey/eskisehir";
        WebElement adres2Elementi = driver.findElement(By.xpath("//input[@data-qa='address2']"));
        adres2Elementi.sendKeys("turkey/eskisehir");
        String actual2Adres = "turkey/eskisehir";

        WebElement countryDDM = driver.findElement(By.xpath("//select[@data-qa='country']"));
        Select opt4 = new Select(countryDDM);
        opt4.selectByVisibleText("Canada");

        driver.findElement(By.xpath("//input[@data-qa='state']")).sendKeys("Sentosa");
        driver.findElement(By.xpath("//input[@data-qa='city']")).sendKeys("Sentosa");
        driver.findElement(By.xpath("//input[@data-qa='zipcode']")).sendKeys("684965");
        driver.findElement(By.xpath("//input[@data-qa='mobile_number']")).sendKeys("05459632475");
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();

        //6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        driver.findElement(By.xpath("//*[text()='Account Created!']")).isDisplayed();
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();

        //7. Verify ' Logged in as username' at top
        driver.findElement(By.xpath("//div//li[9]")).isDisplayed();

        //8. Add products to cart
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]")).click();
        Thread.sleep(3000);

        //9. Click 'Cart' button
        WebElement continueButton = driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']"));
        continueButton.click();
        action.sendKeys(Keys.PAGE_UP).perform();
        driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();

        //10. Verify that cart page is displayed
        driver.findElement(By.xpath("//section[@id='cart_items']")).isDisplayed();

        //11. Click Proceed To Checkout
        driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
        action.sendKeys(Keys.PAGE_DOWN).perform();

        //12. Verify that the delivery address is same address filled at the time registration of account
        WebElement deliveryAddressBir = driver.findElement(By.xpath("(//li[@class='address_address1 address_address2'])[2]"));
        WebElement deliveryAddressIki = driver.findElement(By.xpath("(//li[@class='address_address1 address_address2'])[3]"));
        String expectedDeliveryAddress = deliveryAddressBir.getText();
        String expectedDeliveryAddressIki = deliveryAddressIki.getText();

        Assert.assertEquals(expectedDeliveryAddress, actualAdres);
        Assert.assertEquals(expectedDeliveryAddressIki, actual2Adres);

        // 13. Verify that the billing address is same address filled at the time registration of account
        WebElement billingAddressBir = driver.findElement(By.xpath("(//li[@class='address_address1 address_address2'])[5]"));
        WebElement billingAddressIki = driver.findElement(By.xpath("(//li[@class='address_address1 address_address2'])[6]"));
        String expectedBillingAddress = billingAddressBir.getText();
        String expectedBillingAddressIki = billingAddressIki.getText();

        Assert.assertEquals(expectedBillingAddress, actualAdres);
        Assert.assertEquals(expectedBillingAddressIki, actual2Adres);

        //14. Click 'Delete Account' button
        driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();


    }


}
