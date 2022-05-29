package day08_alerts_Iframe;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class IFrameHW extends TestBase {
    /*
     Iframe Home Work
    1. “http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
    2. “Our Products” butonuna basin
    3. “Cameras product”i tiklayin
    4. Popup mesajini yazdirin
    5. “close” butonuna basin
    6. "WebdriverUniversity.com (IFrame)" linkini tiklayin
    7. "http://webdriveruniversity.com/index.html" adresine gittigini test edin
  */
    @Test
    public void Test() {
        //1. “http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
        driver.get("http://webdriveruniversity.com/IFrame/index.html");

        //2. “Our Products” butonuna basin
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='frame']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//*[text()='Our Products']")).click();
        //3. “Cameras product”i tiklayin
        driver.findElement(By.xpath("(//p[@class='sub-heading'])[2]")).click();

        //4. Popup mesajini yazdirin
        WebElement popElementi = driver.findElement(By.xpath("//div[@class='modal-body']"));
        System.out.println(popElementi.getText());

        //5. “close” butonuna basin
        driver.findElement(By.xpath("(//button[@data-dismiss='modal'])[3]")).click();

        //6. "WebdriverUniversity.com (IFrame)" linkini tiklayin
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();

        //7. "http://webdriveruniversity.com/index.html" adresine gittigini test edin
        String expectedUrl = "http://webdriveruniversity.com/index.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);


    }


}
