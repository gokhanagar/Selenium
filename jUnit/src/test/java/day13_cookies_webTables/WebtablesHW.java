package day13_cookies_webTables;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class WebtablesHW extends TestBase {

    @Test
    public void test() {
        //  1. “https://demoqa.com/webtables” sayfasina gidin
        driver.get("https://demoqa.com/webtables");

        //  2. Headers da bulunan department isimlerini yazdirin
        System.out.println("TASK 2: ");
        List<WebElement> headList = driver.findElements(By.xpath("//div[@class='rt-tr']//div[@role='columnheader']"));
        int departmentNo = 0;

        for (int i = 0; i < headList.size(); i++) {

            if (headList.get(i).getText().equals("Department")) {

                departmentNo = i;
            }
        }
        System.out.println(departmentNo);
        List<WebElement> departmentList = driver.findElements(By.xpath("(//div[@class='rt-table']//div[@class='rt-td'][" + (departmentNo + 1) + "])"));

        for (WebElement each : departmentList) {
            System.out.println(each.getText());
        }

        //  3. sutunun basligini yazdirin
        System.out.println("TASK 3: ");
        System.out.println(headList.get(2).getText());

        //  4. Tablodaki tum datalari yazdirin
        WebElement table = driver.findElement(By.xpath("//div[@class='rt-table']"));
        System.out.println(table.getText());

        //2. yontem....
        int tableSatirSayisi = driver.findElements(By.xpath("(//div[@class='rt-tr-group'])")).size();
        int tumTableHucreSayisi = driver.findElements(By.xpath("(//div[@class='rt-tbody'])//div[@class='rt-td']")).size();
        int satirHucreSayisi = tumTableHucreSayisi / tableSatirSayisi;
        List<WebElement> tumCellBilgileri = driver.findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-tr-group']//div[@class='rt-td']"));
        System.out.println("2. yontem: ");
        for (int i = 0; i < tumCellBilgileri.size(); i++) {
            if (i % satirHucreSayisi == 0 && i > satirHucreSayisi) {
                System.out.println();
            }
            System.out.print(tumCellBilgileri.get(i).getText() + "   ");

        }

        //3.yontem
        //(//div[@class='rt-tr-group'][1]//div[@class='rt-td'])[3]
        System.out.println("3. yontem: ");
        for (int satir = 1; satir <= tableSatirSayisi; satir++) {
            for (int hucre = 1; hucre <= satirHucreSayisi; hucre++) {
                WebElement istenenHucre = driver.findElement(By.xpath("(//div[@class='rt-tr-group'][" + satir + "]//div[@class='rt-td'])[" + hucre + "]"));
                System.out.print(istenenHucre.getText() + "   ");
            }
            System.out.println("");
        }

        //  5. Tabloda kac cell (data) oldugunu yazdirin
        System.out.println("TASK 5: ");
        List<WebElement> toplamHucreSayisiList = driver.findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-tr-group']//div[@class='rt-td']"));
        System.out.println(toplamHucreSayisiList.size());

        //  6. Tablodaki satir sayisini yazdirin
        List<WebElement> satirSayisiList = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
        System.out.println(satirSayisiList.size());

        //  7. Tablodaki sutun sayisini yazdirin
        System.out.println("TASK 7: ");
        System.out.println("1. yontem: ");
        int sutunSayisi = toplamHucreSayisiList.size() / satirSayisiList.size();
        System.out.println("Sutun sayisi : " + sutunSayisi);

        //2.yontem:
        System.out.println("2. yontem: ");
        List<WebElement> ilkSatirBilgileriList = driver.findElements(By.xpath("(//div[@class='rt-tr-group'])[1]//div[@class='rt-td']")); // bir satirdaki rt-td sayisi
        System.out.println("Sutun sayisi : " + ilkSatirBilgileriList.size());

        //  8. Tablodaki 3.kolonu yazdirin
        System.out.println("TASK 8: ");
        List<WebElement> ucuncuSutunList = driver.findElements(By.xpath("(//div[@class='rt-table']//div[@class='rt-td'][3])"));
        for (WebElement each : ucuncuSutunList) {

            System.out.println(each.getText());
        }

        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        System.out.println("TASK 9 : ");
        System.out.println(driver.findElement(By.xpath("//div[@class='rt-tr-group'][3]//div[@class='rt-td'][5]")).getText());

        // 10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin
        detayYazdir(2, 6);


    }

    private void detayYazdir(int satir, int sutun) {

        System.out.println(driver.findElement(By.xpath("//div[@class='rt-tr-group'][" + satir + "]//div[@class='rt-td'][" + sutun + "]")).getText());

    }


}
