package tests.practiceSelf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

public class Q4 {

    // 1-Amazon sayfasina gidin
    // 2-sol ust taraftaki all secenegine tiklayiniz
    // 3-Digital Content & Devices yazisinin gorunur oldugundan emin olunuz
    // 4-Kindle E-readers & Books secenegine tiklayiniz
    // 5-Kindle Kids secegini tiklayiniz
    // 6-sol taraftaki 3. resmin gorunurlugunu dogrulayiniz
    // 7-Registry uzerine gelip iki kere tiklayiniz
    // 8-Registrant name kismina telephone yaziniz
    // 9-Select a registry or gift list type Birthday Gift List'i seciniz
    //10-Search butonuna tiklayin
    //11- "Sorry, no Gift Lists match your search." yazsinin ciktigini dogrulayiniz
    //12-amazonu kapatin

    @Test
    public void test() throws InterruptedException {
        AmazonPage amazonPage = new AmazonPage();
        // 1-Amazon sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // 2-sol ust taraftaki all secenegine tiklayiniz
        amazonPage.allHamburgerMenu.click();

        // 3-Digital Content & Devices yazisinin gorunur oldugundan emin olunuz
        WebElement digitalContentDevices = Driver.getDriver().findElement(By.xpath("(//ul[@class='hmenu hmenu-visible']/li)[1]"));
        Assert.assertTrue(digitalContentDevices.isDisplayed());

        // 4-Kindle E-readers & Books secenegine tiklayiniz
        Thread.sleep(1000);
        amazonPage.kindleEreadersBooksElementi.click();

        // 5-Kindle Kids secenegini tiklayiniz
        Thread.sleep(1000);
        amazonPage.kindleKidsElementi.click();

        // 6-sol taraftaki 3. resmin gorunurlugunu dogrulayiniz
        WebElement ucuncuResim = Driver.getDriver().findElement(By.xpath("(//input[@class='a-button-input'])[6]"));
        Assert.assertTrue(ucuncuResim.isDisplayed());

        // 7-Registry uzerine gelip iki kere tiklayiniz
        WebElement registryButton = Driver.getDriver().findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_registry']"));
       registryButton.click();

        // 8-Registrant name kismina telephone yaziniz
        WebElement registrantButton = Driver.getDriver().findElement(By.xpath("//input[@placeholder='Search by Registrant name']"));
        registrantButton.sendKeys("5418653295");

        // 9-Select a registry or gift list type Birthday Gift List'i seciniz
        WebElement ddm = Driver.getDriver().findElement(By.xpath("(//*[text()='Select a registry or gift list type'])[2]"));
        ddm.click();
        Driver.getDriver().findElement(By.xpath("(//a[@class='a-dropdown-link'])[3]")).click();

        //10-Search butonuna tiklayin
        WebElement searchButton = Driver.getDriver().findElement(By.xpath("//button[@class='gr-btn gr-btn--rounded gr-text gr-find-stripe__cta gr-find-stripe__submit']"));
        searchButton.click();

        //11- "Sorry, no Gift Lists match your search." yazsinin ciktigini dogrulayiniz
        WebElement sorryElementi = Driver.getDriver().findElement(By.xpath("(//div[@class='gr-search-no-result-container']//div)[2]"));
        Assert.assertTrue(sorryElementi.isDisplayed());

        //12-amazonu kapatin
        Driver.closeDriver();









    }















}
