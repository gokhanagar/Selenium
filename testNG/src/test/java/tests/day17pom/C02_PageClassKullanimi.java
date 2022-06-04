package tests.day17pom;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import tests.day22_crossBrowser.utilities.Driver;

public class C02_PageClassKullanimi {


    @Test
    public void test01() {
        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get("https://www.amazon.com");
        amazonPage.aramaKutusu.sendKeys("nutella" + Keys.ENTER);

        String actualSonuc = amazonPage.aramaSonucElementi.getText();
        String expectedSonuc = "nutella";
        Assert.assertTrue(actualSonuc.contains(expectedSonuc));

        Driver.closeDriver();

    }


}
