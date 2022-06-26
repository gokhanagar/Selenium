package tests.practiceSelf;

import org.junit.jupiter.api.Order;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GittiGidiyorPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

import java.util.ArrayList;
import java.util.Random;

public class GittiGidiyorTest {

    GittiGidiyorPage gittiGidiyorPage=new GittiGidiyorPage();
    Actions actions=new Actions(Driver.getDriver());
    ArrayList<String> secilenUrunList=new ArrayList<>();
    String fiyat;
    @Test
    @Order(1)
    public void bilgisayar_arat() {
        Driver.getDriver().get(ConfigReader.getProperty("gittigidiyorUrl"));
        gittiGidiyorPage.aramaKutusu.sendKeys("bilgisayar"+ Keys.ENTER);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().toString().contains("bilgisayar"));
    }
    @Test
    @Order(2)
    public void ikinci_sayfaya_git_kontrol_et() throws InterruptedException {
        gittiGidiyorPage.cookies.click();
        actions.moveToElement(gittiGidiyorPage.ikincisayfa).perform();
        gittiGidiyorPage.ikincisayfa.click();
        Thread.sleep(1000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().toString().contains("2"));
    }

    @Test
    @Order(3)
    public void rastgele_ürün_sec_sepete_ekle(){
        Random rnd = new Random();
        int sayi = rnd.nextInt(gittiGidiyorPage.urunlerList.size());
        gittiGidiyorPage.urunlerList.get(sayi+1).click();
        gittiGidiyorPage.cookies.click();
        fiyat=gittiGidiyorPage.urunfiyat.getText();
        gittiGidiyorPage.sepeteEkle.click();
        //Assert.assertTrue(gittiGidiyorPage.sepetegit.isDisplayed());
    }

    @Test
    @Order(4)
    public void secilen_urun_fiyat_ile_sepettekini_karsilastir() {
        gittiGidiyorPage.sepetegit.click();
        String sepettekiFiyati=gittiGidiyorPage.sepettekiFiyat.getText();
        Assert.assertEquals(fiyat,sepettekiFiyati);
    }

    @Test
    @Order(5)
    public void secilen_urun_miktar_arttir() {
        gittiGidiyorPage.urunadedi.click();
        Assert.assertTrue(gittiGidiyorPage.urunadedi.getText().contains("2"));
    }

    @Test
    @Order(6)
    public void urun_sepetten_silinerek_sepeti_bos_oldugunu_kontrol_edilir() throws InterruptedException {
        gittiGidiyorPage.urundelete.click();
        Thread.sleep(1000);
        Assert.assertTrue(gittiGidiyorPage.bosSepet.isDisplayed());
    }



























































}
