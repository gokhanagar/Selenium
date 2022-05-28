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

public class TestCases9 {
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

        //4. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();

        //5. Verify user is navigated to ALL PRODUCTS page successfully
        driver.findElement(By.xpath("(//div[@class='row'])[2]")).isDisplayed();

        //6. Enter product name in search input and click search button
        driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("Premium Polo T-Shirts");
        driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();

        //7. Verify 'SEARCHED PRODUCTS' is visible
        driver.findElement(By.xpath("//*[text()='Searched Products']")).isDisplayed();

        //8. Verify all the products related to search are visible
        driver.findElement(By.xpath("//div[@class='product-image-wrapper']")).isDisplayed();


    }
}
