package tests.day19_smokeTest;

import pages.BrcPage;
import utilities.ConfigReader;
import org.testng.annotations.Test;
import utilities.Driver;
import org.testng.Assert;

public class PositiveLoginTest {


    @Test
    public void positiveLoginTest() {
        BrcPage brcPage = new BrcPage();
        // Bir test method olustur positiveLoginTest()
        //  https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        //      login butonuna bas
        brcPage.ilkLoginButonu.click();

        //test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));

        //test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));

        //login butonuna tiklayin
        brcPage.ikinciLoginButonu.click();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(brcPage.kullaniciProfilIsmi.isDisplayed());


    }


}
