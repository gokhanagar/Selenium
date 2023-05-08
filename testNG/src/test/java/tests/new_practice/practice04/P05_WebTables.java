package tests.new_practice.practice04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class P05_WebTables extends TestBase {
    @Test
    public void name() {
        //https://www.techlistic.com/p/demo-selenium-practice.html adresine gidelim
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        //Demo Table altındaki tablodaki otel bilgilerini yazdırınız
        List<WebElement> satirlar = driver.findElements(By.xpath("//*[@class='tsc_table_s13']/tbody/tr"));
        satirlar.forEach(t -> System.out.println(t.getText()));
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        //Demo Table altındaki otel bilgileri olan tablodan Height değeri 601m olan otelin bilgilerini yazdırınız
        int row = 1;
        for (WebElement trElement : satirlar) {
            if (trElement.getText().contains("601m")) {
                System.out.println("Tablodaki " + row + ". satırdaki otel bilgileri : " + trElement.getText());
            }
            row++;
        }
        //Bütün Height bilgilerini yazdırınız
        WebElement heightBaslik = driver.findElement(By.xpath("//*[@class='tsc_table_s13']//thead//th[4]"));
        System.out.println(heightBaslik.getText());
        System.out.println("------------------");
        List<WebElement> height = driver.findElements(By.xpath("//*[@class='tsc_table_s13']//tbody//tr//td[3]"));
        height.forEach(x -> System.out.println(x.getText()));
        //Otel uzunluklarının hepsini toplayınız
        List<String> list = new ArrayList<String>();
        for (WebElement w : height) {
            list.add(w.getText());
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i).replace("m",""));
        }
        list.forEach(System.out::println);
        int sonuc = 0;
        for (String s:list) {
            sonuc+=Integer.parseInt(s);
        }
        System.out.println("Toplam otel uzunluğu = " +sonuc);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        //Bir method ile satır ve sutun bilgilerini çağıralım
        tabloSatirSutun(3, 4);
    }
    private void tabloSatirSutun(int satir, int sutun) {
        System.out.println(satir + ". satır " + sutun + ". sutun bilgisi : " + driver.findElement
                (By.xpath("//*[@class='tsc_table_s13']//tbody//tr[" + satir + "]//td[" + sutun + "]")).getText());

    }





}
