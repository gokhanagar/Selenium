package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazon anasayfasina")
    public void kullaniciAmazonSayfasinda() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici iphone icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {

        amazonPage.aramaKutusu.sendKeys("iphone" + Keys.ENTER);
    }

    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        String arananKelime = "iphone";
        String actualAramaSonucElementi = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucElementi.contains(arananKelime));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }


    @Then("kullanici tea pot icin arama yapar")
    public void kullaniciTeaPotIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("tea pot" + Keys.ENTER);

    }

    @And("sonuclarin tea pot icerdigini test eder")
    public void sonuclarinTeaPotIceridiginiTestEder() {
        String actualText = amazonPage.aramaSonucElementi.getText();
        String expectedText = "tea pot";
        Assert.assertTrue(actualText.contains(expectedText));
    }


    @Then("kullanici flower icin arama yapar")
    public void kullaniciFlowerIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("flower" + Keys.ENTER);
    }

    @And("sonuclarin flower icerdigini test eder")
    public void sonuclarinFlowerIcerdiginiTestEder() {
        String actualText = amazonPage.aramaSonucElementi.getText();
        String expectedText = "flower";
    }

    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String istenenKelime) {

        amazonPage.aramaKutusu.sendKeys(istenenKelime + Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String istenenKelime) {

        String actualText = amazonPage.aramaSonucElementi.getText();
        String expectedText = istenenKelime;
        Assert.assertTrue(actualText.contains(expectedText));
    }

    @Given("kullanici {string} anasayfasina")
    public void kullaniciAnasayfasina(String istenenUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSaniye) {

        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        String actualUrl =Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));

    }


}
