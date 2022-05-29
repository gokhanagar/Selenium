package day09_handlewindows_testBase;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.Set;

public class WindowHandleHomeWork extends TestBase {
    @Test
    public void test() {
        //1."http://webdriveruniversity.com/" adresine gidin
        driver.get("http://webdriveruniversity.com/");

        //2."Login Portal" a kadar asagi inin
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        String ilkSayfa = driver.getWindowHandle();

        //3."Login Portal" a tiklayin
        driver.findElement(By.xpath("//*[text()='LOGIN PORTAL']")).click();

        //4.Diger window'a gecin
        String ikinciSayfaWHD = "";
        Set<String> windowHandleSeti = driver.getWindowHandles();
        for (String each : windowHandleSeti) {

            if (!each.equals(ilkSayfa)) {
                ikinciSayfaWHD = each;
            }
        }

        driver.switchTo().window(ikinciSayfaWHD);

        //5."username" ve "password" kutularina deger yazdirin
        Faker faker = new Faker();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(faker.name().firstName());
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(faker.internet().password());

        // 6."login" butonuna basin
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
        String actualText = driver.switchTo().alert().getText();
        String expectedText = "validation failed";

        Assert.assertEquals(expectedText, actualText);

        //8.Ok diyerek Popup'i kapatin
        driver.switchTo().alert().accept();

        //9.Ilk sayfaya geri donun
        driver.switchTo().window(ilkSayfa);

        //10.Ilk sayfaya donuldugunu test edin
        driver.findElement(By.xpath("//div[@class='row']")).isDisplayed();


    }


}
