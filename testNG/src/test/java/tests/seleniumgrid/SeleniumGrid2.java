package tests.seleniumgrid;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid2 {

    WebDriver driver;
    @Test
    public void test1() throws MalformedURLException, InterruptedException {

        driver = new RemoteWebDriver(new URL("http://localhost:4444"), new FirefoxOptions());
        driver.get("https://www.google.com");
        Thread.sleep(5000);
        driver.findElement(By.name("q")).sendKeys("Iphone x" + Keys.ENTER);
        Thread.sleep(5000);
        System.out.println("Current Thread : " + Thread.currentThread());
        System.out.println("Google title: " + driver.getTitle());
        driver.quit();

    }

}
