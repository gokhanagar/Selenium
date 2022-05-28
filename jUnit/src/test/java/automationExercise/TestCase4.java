package automationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestCase4 {

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
        driver.navigate().to("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//html[@lang='en']"));
        Assert.assertTrue(homePage.isDisplayed());

        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();

        //5. Verify 'Login to your account' is visible
        WebElement loginYourAccount = driver.findElement(By.xpath("//*[text() = 'Login to your account']"));
        Assert.assertTrue(loginYourAccount.isDisplayed());

        //6. Enter correct email address and password
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("gokhanagar1@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("12345");

        //7. Click 'login' button
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

        //8. Verify that 'Logged in as username' is visible
        WebElement loggedInAsUsername = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[9]/a"));
        Assert.assertTrue(loggedInAsUsername.isDisplayed());

        //9. Click 'Logout' button
        driver.findElement(By.xpath("//a[@href='/logout']")).click();

        //10. Verify that user is navigated to login page
        driver.findElement(By.xpath("//*[text() = 'Login to your account']")).isDisplayed();


    }


}
