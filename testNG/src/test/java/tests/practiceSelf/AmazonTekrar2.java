package tests.practiceSelf;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;
import tests.utilities.ReusableMethods;
import tests.utilities.TestBaseRapor;

import java.io.IOException;

public class AmazonTekrar2 extends TestBaseRapor {

    AmazonPage amazon = new AmazonPage();

    @Test
    public void amazonHucreTesti(){
        //➢ AmazonPage sayfasinda istedigim satir ve sutun sayisi ile cagirdigimda
        //bana hucredeki yaziyi getirecek bir method olusturun
        //➢ Tests paketi altinda yeni bir class olusturun: D26_AmazonHucreTesti
        //➢ Bu class’in altinda bir test method olusturun : hucretesti() ve
        //webtable’da 3. satir 2.sutundaki yazinin “Home Services” yazisi
        //icerdigini test edin
        extentTest = extentReports.createTest("amazonTable", "Satir ve Sutun Raporu");
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage.enAltaGit();
        extentTest.pass("Amazon url'ye gidildi ve en alta inildi");
        String expectedSatirSutun = "Home Services";
        String actualSatirSutun = amazon.satirSutun.getText();
        Assert.assertNotEquals(expectedSatirSutun,actualSatirSutun);
        System.out.println(amazon.satirSutun.getText());
        extentTest.pass("3. Satirin 2. sutununda Home Services yazisi icermedigi test edildi");
        //➢ Yeni bir method olusturun : AmazonYazisi() ve tabloda 9 Hucrede
        //“Amazon” yazisi bulundugunu test edin
        amazonYazisi();
        extentTest.pass("Tabloda 9 adet Amazon yazisi bulundugu test edildi");
        try {
            ReusableMethods.getScreenshot("amazonTable");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Driver.closeDriver();
    }
    private void amazonYazisi() {
        int actualAmazonYazisiAdedi = (int) amazon.hucreler.
                stream().filter(t -> t.getText().contains("Amazon")).count();
        System.out.println("Hucrelerdeki amazon yazisi adedi = "+actualAmazonYazisiAdedi);
        int expectedAmazonYazisiAdedi = 9;
        Assert.assertEquals(expectedAmazonYazisiAdedi,actualAmazonYazisiAdedi);
        
    }

}