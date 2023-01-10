package tests.practiceSelf;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.N11Page;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Q2 {

    @Test
    public void test() throws IOException {

        N11Page n11Page = new N11Page();
        //n11 sitesine giris yapin
        Driver.getDriver().get(ConfigReader.getProperty("n11Url"));

        //Sayfada cikan cookies 'leri kapatin
        Driver.getDriver().manage().deleteAllCookies();
        n11Page.closeCookie.click();

        // Mağazalar yazısının üzerine gelin.
        //Açılan menü-de Mağazaları gör butonuna tiklayin.
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(n11Page.magazalarElementi).click(n11Page.magazalariGorElementi).perform();

        //Açılan sayfada Tüm Mağazalar tıklayin.
        n11Page.tumMagazalarElementi.click();

        //M harfi ile başlayan mağazalara tiklayin.
        Driver.getDriver().findElement(By.xpath("//span[@title='M']")).click();

        //Cikan magazalari excel dosyasina atin
        List<WebElement> mHarfliListe = Driver.getDriver().findElements(By.xpath("//div[@class='tabPanel allSellers']//div//ul//li"));
        String dosyaYolu = "src/test/resources/n11.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);

        for (int i = 0; i < mHarfliListe.size(); i++) {

            workbook.getSheet("Sayfa1").
                    createRow(i).
                    createCell(0).
                    setCellValue(mHarfliListe.get(i).getText());
        }


        //Satir sayisini yazdirin
        int sonSatir = workbook.getSheet("Sayfa1").getLastRowNum();
        System.out.println(sonSatir);

        //excel dosyasini kaydedin
        FileOutputStream fos = new FileOutputStream(dosyaYolu);
        workbook.write(fos);

        // n11 sayfasini kapatin
        Driver.closeDriver();


    }


}