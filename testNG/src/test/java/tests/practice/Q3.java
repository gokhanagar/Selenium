package tests.practice;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.ReactPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class Q3 {


    @Test
    public void test(){
        ReactPage reactPage = new ReactPage();
    // 1."https://react-shopping-cart-67954.firebaseapp.com/" adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("reactUrl"));

    // 2.Web sitesindeki tüm öğeleri listeleyin ve yazdirin
    // (sitede 16 urun var, 1.urun : 2.urun :.....seklinde yazdirin )
    for(int i=0; i<reactPage.urunlerIsimListesi.size(); i++){
        System.out.println(i+1+". urun " + reactPage.urunlerIsimListesi.get(i).getText()+
                "  " + reactPage.urunFiyatListesi.get(i).getText());
    }

    // 3.Stringlerden olusan bir ArrayList oluşturun ve Ürün Adlarını ArrayList'e yerleştirin
        List<String> urunlerIsimListesi = new ArrayList<String>();
        for(WebElement each: reactPage.urunlerIsimListesi){
            urunlerIsimListesi.add(each.getText());
        }

    // 4.Siteden Rastgele 5 öğe seçin, sepete ekleyin ve sectiginiz öğelerin adlarını yazdırın


    // (Her ürün 1 defadan fazla eklenemez!)


    // 5.Her bir öğenin fiyatını toplayın ve sonucunuzu web sitesiyle karşılaştırın


    // 6.Sonuçlar eşleşiyorsa  konsola test pass yazirin


    // 7.Checkout'a tıklayın

























    }




































}
