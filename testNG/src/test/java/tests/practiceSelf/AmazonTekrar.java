package tests.practiceSelf;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;
import tests.utilities.ReusableMethods;
import tests.utilities.TestBaseRapor;

import java.io.IOException;
import java.util.List;


public class AmazonTekrar extends TestBaseRapor {
    AmazonPage amazon = new AmazonPage();

    @Test
    public void test01() {

        //➢ Amazon ana sayfasinda en altta bulunan Webtable’i inceleyebilmek icin AmazonPage
        //clasinda en altta gitme isini yapacak bir method olusturun
        extentTest = extentReports.createTest("amazonTable", "Satir ve Sutun Raporu");
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Amazon sayfasina gidildi");
        AmazonPage.enAltaGit();
        extentTest.info("Amazon sayfasinin en altina inildi");
        //➢ Tests paketi altinda yeni bir class olusturun: D26_AmazonSatirSutunSayisi
        //➢ Bu class’in altinda bir test method olusturun : satirSayisi() ve webtable’da 10 satir oldugunu
        //test edin
        satirSayisi();
        extentTest.info("Expected satir sayisi = 10, Actual Satir Sayisi = " + amazon.satirSayisi.size());
        //➢ Yeni bir method olusturun : sutunSayisi() ve yazi olan sutun sayisinin 7 oldugunu test edin
        sutunSayisi();
        extentTest.info("Sutun sayisi alindi = " + amazon.sutunSayisi.size());
        try {
            ReusableMethods.getScreenshot("amazonTable");
        } catch (IOException e) {
            e.printStackTrace();
        }
        extentTest.info("Satir ve sutun sayilari goruldu");
    }
    private void satirSayisi() {
        List<WebElement> satirSayisi = amazon.satirSayisi;
        //satirSayisi.forEach(t-> System.out.println(t.getText()));
        System.out.println("Satir Sayisi = " + satirSayisi.size());
        int expectedSatirSayisi = 10;
        Assert.assertEquals(expectedSatirSayisi, amazon.satirSayisi.size());
    }
    private void sutunSayisi() {
        List<WebElement> sutunSayisi = amazon.sutunSayisi;
        System.out.println("Sutun Sayisi = " + sutunSayisi.size());
        int expectedSutunSayisi = 7;
        int actualSutunSayisi = (int) sutunSayisi.stream().filter(t -> !t.getText().isEmpty()).count();
        System.out.println("Yazi olan sutun sayisi = "+actualSutunSayisi);
        extentTest.info("Yazi olan sutun sayisi alindi = "+actualSutunSayisi);
        Assert.assertEquals(expectedSutunSayisi, actualSutunSayisi);
    }
}
