package day02_driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_ManageMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/recources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amaazon.com");

         /*
            Ilerde wait konusunu daha genis olarak ele alacagiz
            Bir sayfa acilirken, ilk basta sayfanin icerisinde bulunan elementlere gore
            bir yuklenme suresine ihtiyac vardir
            veya bir web elementinin kullanilabilmesi icin zaman ihtiyac olabilir
            implicitlyWait bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icn beklenecek
            MAXIMUM sureyi belirleme olanagi tanir
         */

        driver.close();


    }
}
