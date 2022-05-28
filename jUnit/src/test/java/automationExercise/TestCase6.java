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

public class TestCase6 {

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

        //4. Click on 'Contact Us' button
        driver.findElement(By.xpath("//a[@href='/contact_us']")).click();

        //5. Verify 'GET IN TOUCH' is visible
        driver.findElement(By.xpath("//*[text()='Get In Touch']")).isDisplayed();


        //6. Enter name, email, subject and message
        driver.findElement(By.xpath("//input[@data-qa='name']")).sendKeys("gokhanagar");
        driver.findElement(By.xpath("//input[@data-qa='email']")).sendKeys("gokhanagar1@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa='subject']")).sendKeys("shopping problem");
        driver.findElement(By.xpath("//textarea[@data-qa='message']")).sendKeys("The system does not let me buy");

        //7. Upload file
        driver.findElement(By.xpath("//*[@name='upload_file']")).
                sendKeys("C:\\Users\\gokha\\OneDrive\\Desktop\\maven.png");


        //8. Click 'Submit' button
        driver.findElement(By.xpath("//input[@data-qa='submit-button']")).click();

        //9. Click OK button
        driver.switchTo().alert().accept();

        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
        Assert.assertTrue(successMessage.isDisplayed());

        //11. Click 'Home' button and verify that landed to home page successfully
        driver.findElement(By.xpath("(//a[@href='/'])[2]")).click();
        driver.findElement(By.xpath("//html[@lang='en']")).isDisplayed();

    }


}
