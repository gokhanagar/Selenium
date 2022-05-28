package day02_driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {

    public static void main(String[] args) {
        /*
        1- https://www.amazon.com url'ine gidin
        2- Basligin Amazon kelimesi icerdigini test edin.
        3- Url'in "https://www.amazon.com" a esit oldugunu test edin
        4-sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver", "src/recources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1- https://www.amazon.com url'ine gidin
        driver.get("https://www.amazon.com");

        //2- Basligin Amazon kelimesi icerdigini test edin.
        String actualTitle = driver.getTitle();
        String arananKelime = "Amazon";

        if (actualTitle.contains(arananKelime)) {
            System.out.println("Title testi PASSED");
        } else {
            System.out.println("Title " + arananKelime + " yi icermiyor, title testi FAILED");
        }


        //3- Url'in "https://www.amazon.com" a esit oldugunu test edin

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Url testi PASSED");
        } else {
            System.out.println("Url " + expectedUrl + " li icermiyor, Url testi FAILED");
        }

        // 4-sayfayi kapatin
        driver.close();


    }


}
