package day06_radioButton_checkBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_BeforeClass_AfterClass {
        /*
        @BeforeClass ve @AfterClass notasyonlari sadece static methodlar icin calisir
         */


    static WebDriver driver;

    @BeforeClass
    public static void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }


    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
    }


    @Test
    public void test02() {
        driver.get("https://www.google.com");
    }


    @Test
    public void test03() {
        driver.get("https://www.facebook.com");
    }


}
