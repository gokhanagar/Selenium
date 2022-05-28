package automationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestCase10 {

    //1. Launch browser
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test() {
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("https://www.automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//html[@lang='en']"));
        Assert.assertTrue(homePage.isDisplayed());

        //Scroll down to footer
        driver.findElement(By.xpath("//html[@lang='en']")).sendKeys(Keys.END);

        //5. Verify text 'SUBSCRIPTION'
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()=\"Subscription\"]")).isDisplayed());

        //6. Enter email address in input and click arrow button
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gokhanagar1@gmail.com");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //7. Verify success message 'You have been successfully subscribed!' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()=\"You have been successfully subscribed!\"]")).isDisplayed());


    }
}
