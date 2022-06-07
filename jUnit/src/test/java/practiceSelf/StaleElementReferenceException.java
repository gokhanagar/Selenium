package practiceSelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void staleElementReferenceExceptionTest01() {
        driver.get("https://www.carettahotel.com/");
        WebElement home = driver.findElement(By.linkText("Home"));
        home.click();

        driver.navigate().refresh();
        home.click(); //StaleElementReferenceException
    }

    @Test
    public void staleElementReferenceExceptionTest02() {

        driver.get("https://www.carettahotel.com/");
        WebElement home = driver.findElement(By.linkText("Home"));
        home.click();

        driver.navigate().refresh();

        WebElement home2 = driver.findElement(By.linkText("Home"));
        home2.click();

        driver.navigate().refresh();

        driver.findElement(By.linkText("Home")).click();

        /*
        Solution :
        1. We should relocate the web element
        2. We should not use same variable for the same element
         */

    }


}
