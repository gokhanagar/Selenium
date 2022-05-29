package day08_alerts_Iframe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Alerts {

    //● Bir class olusturun: Alerts
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //● https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    //● Bir metod olusturun: acceptAlert
    @Test
    public void acceptAlert() {
        //      ○ 1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        driver.switchTo().alert().accept();
        //      “You successfully clicked an alert” oldugunu test edin.
        String expectedResult = "You successfully clicked an alert";
        WebElement sonucYaziElementi = driver.findElement(By.id("result"));
        String actualResult = sonucYaziElementi.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    //● Bir metod olusturun: dismissAlert
    @Test
    public void dismissAlert() {
        //      ○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();
        //      “successfuly” icermedigini test edin.
        String expectedResult = "successfully";
        WebElement sonucYaziElementi = driver.findElement(By.id("result"));
        String actualResult = sonucYaziElementi.getText();
        Assert.assertFalse("Succesfully içeriyor", actualResult.contains(expectedResult));
    }

    //● Bir metod olusturun: sendKeysAlert
    @Test
    public void sendKeysAlert() {
        //      ○ 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin,
        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
        //      OK butonuna     tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.
        driver.switchTo().alert().sendKeys("Defne");
        driver.switchTo().alert().accept();
        String expectedResult = "Defne";
        WebElement sonucYaziElementi = driver.findElement(By.xpath("(//p)[2]"));
        String actualResult = sonucYaziElementi.getText();
        Assert.assertTrue("İsim içermiyor", actualResult.contains(expectedResult));
    }
}
