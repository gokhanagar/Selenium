package day02_driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {

        /*
        Eger testimiz sirasinda birden fazla sayfa arasinda ileri geri hareket edeceksek
        driver.get() yerine driver.navigate().to() methodunu kullaniriz ve sonrasinda forward(),
        back(), veya refresh() methodlarini kullaabiliriz
         */


        System.setProperty("webdriver.chrome.driver", "src/recources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        //amazona geri don
        driver.navigate().back();
        Thread.sleep(2000);

        //yeniden facebook'a gidelim
        driver.navigate().forward();
        Thread.sleep(2000);

        //sayfayi yenile
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.close();


    }
}
