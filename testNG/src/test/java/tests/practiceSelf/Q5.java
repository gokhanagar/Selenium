package tests.practiceSelf;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoqaPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;
import tests.utilities.ReusableMethods;

public class Q5 {

    @Test
    public void test() {
        DemoqaPage demoqaPage = new DemoqaPage();
        //1. "https://demoqa.com/" adresine gidiniz.
        Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));

        //2. Alerts, Frame & windows elementini tiklayiniz.
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
        demoqaPage.alertsFrameWindowsBolumu.click();

        //3. Alerts, Frame & windows secenegini tiklayiniz.
        action.sendKeys(Keys.PAGE_DOWN).perform();
        demoqaPage.alertsFrameWindowsMenusu.click();

        // 4. Sirasiyla 'Browser window' ve 'New tab' butonlarini secerek
        demoqaPage.browserWindowsMenusu.click();
        Driver.getDriver().findElement(By.xpath("//button[@id='tabButton']")).click();

        // 'This is a sample page'yazisinin ciktigini dogrulayiniz.
        ReusableMethods.switchToWindow("New Window2");
        String expectedTitle = "This is a sample page";
        String actulaTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actulaTitle, expectedTitle);

        // 5.'New window' u secerek acilan sayfayi tam ekran yapiniz.
        Driver.getDriver().manage().window().maximize();






















































    }
}
