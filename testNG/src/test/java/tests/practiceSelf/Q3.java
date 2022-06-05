package tests.practiceSelf;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ReactPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

import java.util.ArrayList;
import java.util.Random;

public class Q3 {
    @Test
    public void test01() {
        // 1."https://react-shopping-cart-67954.firebaseapp.com/" adresine gidin
        ReactPage reactPage = new ReactPage();
        Driver.getDriver().get(ConfigReader.getProperty("shoppingUrl"));
        // 2.Web sitesindeki tüm öğeleri listeleyin ve yazdirin
        // (sitede 16 urun var, 1.urun : 2.urun :.....seklinde yazdirin )
        // 3.Stringlerden olusan bir ArrayList oluşturun ve Ürün Adlarını ArrayList'e yerleştirin
        ArrayList<String> urunAdlariArrayList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            System.out.println((i + 1) + ".ürün: " + (reactPage.urunlerIsim.get(i).getText()) + " ürün fiyatı: " + reactPage.urunFiyat.get(i).getText());
        }
        ArrayList<Double> urunFiyatArrayList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            urunFiyatArrayList.add(Double.parseDouble(reactPage.urunFiyat.get(i).getText().replace("$", "")));
        }
        System.out.println(urunFiyatArrayList);

// 4.Siteden Rastgele 5 öğe seçin, sepete ekleyin ve sectiginiz öğelerin adlarını yazdırın
// (Her ürün 1 defadan fazla eklenemez!)
// 5.Her bir öğenin fiyatını toplayın ve sonucunuzu web sitesiyle karşılaştırın
// 6.Sonuçlar eşleşiyorsa  konsola test pass yazirin

        ArrayList<Integer> randomSayiList = new ArrayList<>(); //önce 5 tane random sayı belirleyelim
        while (randomSayiList.size() < 5) {
            Random rnd = new Random();
            int sayi = rnd.nextInt(15);
            if (!(randomSayiList.contains(sayi + 1))) {
                randomSayiList.add(sayi + 1);
            }
        }
        System.out.println(randomSayiList);
        double urunToplamFiyat = 0;
        for (int e : randomSayiList) {
            reactPage.Addtocart.get(e).click(); //sepete ekledik
            System.out.println(reactPage.urunlerIsim.get(e).getText()); //eklediğimiz ürünün ismini yazdırdık
            System.out.println(urunFiyatArrayList.get(e).doubleValue());
            urunToplamFiyat += (urunFiyatArrayList.get(e).doubleValue()); //ürünün fiyatını alıp toplama ekledik
            reactPage.sepetiKapat.click(); //her seçilen ürün sonrası ürün sepeti ekranını kapattık
        }
        System.out.println("eklenen ürünlerin toplam fiyatı: " + urunToplamFiyat);

        reactPage.sepetimButton.click(); //sepetim ekranını açtık
        Double sepettekiToplamFiyat = Double.valueOf(reactPage.subTotal.getText().replace("$", ""));
        System.out.println("sepette yazan ToplamFiyat = " + sepettekiToplamFiyat);
        Assert.assertEquals(sepettekiToplamFiyat, urunToplamFiyat, "test pass");

        // 7.Checkout'a tıklayın
        reactPage.Checkout.click();
    }


}
