package tests.day21_reusableMethods_HtmlReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;
import tests.utilities.TestBaseRapor;

public class C03_PositiveLoginTestiRaporu extends TestBaseRapor {

    BrcPage brcPage = new BrcPage();

    @Test
    public void positiveLoginTest() {
        extentTest = extentReports.createTest("Positive Login", "Valid username");
        // Bir test method olustur positiveLoginTest()
        //  https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Brc anasayfaya gidildi");

        //      login butonuna bas
        brcPage.ilkLoginButonu.click();
        extentTest.info("login butonuna tiklandi");

        //test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        extentTest.info("Gecerli email yazdirildi");

        //test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        extentTest.info("Gecerli sifre yazildi");

        //login butonuna tiklayin
        brcPage.ikinciLoginButonu.click();
        extentTest.info("Login butonuna tiklandi");

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(brcPage.kullaniciProfilIsmi.isDisplayed());
        extentTest.info("Kullanici basarili bir sekilde giris yapti");

        Driver.closeDriver();
    }


}