package tests.new_practice.practice04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class P04_ExtentReport extends TestBase {

    @Test
    public void invisibleTest() {

        /*
        extentTest = extentReports.createTest("Wait Testi", "Test Raporu");
        //https://automationfc.github.io/dynamic-loading/ sayfasına gidelim
        driver.get("https://automationfc.github.io/dynamic-loading/");
        extentTest.info("Url'e gidildi");

        //Start button'nuna basalım
        driver.findElement(By.xpath("//*[text()='Start']")).click();
        extentTest.info("Start buttonuna basıldı");
        //Hello World! yazısının çıktığını doğrulayalım
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[text()='Loading... ']")));
        extentTest.info("Hello World yazısının çıkması için explicit wait ile beklendi");
        //Start buttonuna bastıktan sonra Loading webelementi kaybolana kadar bekledik
        System.out.println(System.getProperty("user.dir"));
        assert driver.findElement(By.xpath("//*[text()='Hello World!']")).isDisplayed();
        extentTest.pass("Sonuc doğrulandı");

         */
    }

}
