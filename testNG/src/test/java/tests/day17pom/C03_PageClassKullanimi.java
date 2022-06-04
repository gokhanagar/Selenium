package tests.day17pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import tests.day22_crossBrowser.utilities.Driver;

public class C03_PageClassKullanimi {

    @Test
    public void test02() {
        FacebookPage facebookPage = new FacebookPage();
        // facebook anasayfaya gidin
        Driver.getDriver().get("https://www.facebook.com");

        // cikarsa cookies kabul edin
        // kullanici mail kutusuna rastgele bir isim yazdirin
        Faker faker = new Faker();
        facebookPage.mailKutusu.sendKeys(faker.internet().emailAddress());

        // kullanici sifre kutusuna rastgele bir password yazdirin
        facebookPage.sifreKutusu.sendKeys(faker.internet().password());
        // login butonuna basin
        facebookPage.loginTusu.click();
        // giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilemediYaziElementi.isDisplayed());
        Driver.closeDriver();


    }


}
