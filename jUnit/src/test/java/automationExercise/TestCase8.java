package automationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestCase8 {

    //1. Launch browser
    WebDriver driver;
    JavascriptExecutor js;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test() throws InterruptedException {
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("https://www.automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//html[@lang='en']"));
        Assert.assertTrue(homePage.isDisplayed());

        //4. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();

        //5. Verify user is navigated to ALL PRODUCTS page successfully
        driver.findElement(By.xpath("(//div[@class='row'])[2]")).isDisplayed();

        //6. The products list is visible
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='features_items']")).isDisplayed());

        //7. Click on 'View Product' of first product
        js.executeScript("scroll(0, 1000)");
        WebElement viewProduct = driver.findElement(By.xpath("//a[@href='/product_details/1']"));


        //8. User is landed to product detail page
        driver.findElement(By.xpath("(//div[@class='row'])[2]")).isDisplayed();

        //9. Verify that detail is visible: product name, category, price, availability, condition, brand
        driver.findElement(By.xpath("//*[text()='Blue Top']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Category: Women > Tops']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Rs. 500']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Availability:']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Condition:']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Brand:']")).isDisplayed();


    }
}
