package day14_excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Practice02 extends TestBase {

    @Test
    public void test01() throws IOException {
        //n11 sitesine gidildi.
        driver.get("https://www.n11.com");
        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//button[@class='dn-slide-deny-btn']")).click();

        //Actions ile Mağazalar yazısının üstüne gelindi.
        WebElement magazalar = driver.findElement(By.xpath("//span[@title='Mağazalar']"));
        //Açılan menü-de Mağazaları gör tıklandı.
        Actions action = new Actions(driver);

        WebElement magazaGor = driver.findElement(By.xpath("//a[@class = 'active']"));
        action.moveToElement(magazalar).click(magazaGor).perform();

        //Açılan sayfada Tüm Mağazalar tıklandı
        driver.findElement(By.xpath("(//*[text()='Tüm Mağazalar'])[1]")).click();

        //A harfi ile başlayan mağazalar Liste aktarıldı.
        List<WebElement> aHarfliMagazalarList = driver.findElements(By.xpath("//div[@class='tabPanel allSellers']//div//ul//li"));
        System.out.println(aHarfliMagazalarList.get(0).getText());
        // workbook'da N11 adında sheet oluşturuldu.
        String dosyaYolu = "src/test/resources/n11.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);

        // Sheet içinde satır-1,hücre-1 Mağazalar olarak isimlendirildi
        workbook.getSheet("Sayfa1").
                createRow(0).
                createCell(0).
                setCellValue("Magazalar");


        //For loop içinde N11 ismindeki sheet çağrıldı, her satırın 1-ci hücresine
        // a harfiyle başlayan mağazaların isimleri aktarıldı.

        for (int i = 0; i < aHarfliMagazalarList.size(); i++) {

            workbook.getSheet("Sayfa1").
                    createRow(i + 1).
                    createCell(0).
                    setCellValue(aHarfliMagazalarList.get(i).getText());

        }
        //Dosyayi kaydedelim
        FileOutputStream fos = new FileOutputStream(dosyaYolu);
        workbook.write(fos);

        //Dosyayi kapatalim
        fis.close();
        fos.close();


    }


}










