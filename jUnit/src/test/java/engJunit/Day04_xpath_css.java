package engJunit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04_xpath_css {
    WebDriver driver;

    @Before
    public void setUp() {
//        Prerequisites
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

//        user goes to http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
    }

    @Test
    public void xpath_css() {
        /*Locating username, password, and button using xpath*/
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testtechproed@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test1234!");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Test
    public void css() {
        /*1. Locationg username, password, and button usign cssSelector
        There is no // 2. There is no @ symbol */
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("testtechproed@gmail.com");
//        Alternative cssLocator for email : input#session_email  OR   #session_email
//        Alternative cssLocator for email : input.form-control   OR   .form-control
//        Note: # = id    and     . = class
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Test1234!");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }

    //2:05 pm
    @After
    public void tearDown() {
        driver.quit();
    }


}