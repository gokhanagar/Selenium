package practiceSelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TimeOutException {
    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void timeOutExceptionTest(){
        driver.get("https://www.carettahotel.com/");

        // Create web driver wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log")));//TimeOutException

        //Even though the reason is not time, it gives us TimeOutException
        //In this case, it waits for 10 seconds, and we get TimeOutException
        //Reason for TimeOutException => wrong locator + explicit wait

        //actual time problem  => you put 5 sec waits, but it is loading in 10 seconds

    }
}
