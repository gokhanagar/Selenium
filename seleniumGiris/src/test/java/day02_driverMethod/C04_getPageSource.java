package day02_driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSource {
    // amazon sitesine gidip kaynak kodlarinda "spend less" yasdigini test edin
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/recources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        String sayfaKaynakKodlari = driver.getPageSource();
        String arananKelime = "Gateway";


        if (sayfaKaynakKodlari.contains(arananKelime)) {

            System.out.println("Kaynak kodu testi PASSED");

        } else {
            System.out.println("Kaynak kodlarinda " + arananKelime + " yok, test FAILED");
        }

        driver.close();


    }
}
