package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkClass {

    public static void main(String[] args) throws InterruptedException {

        /*En ilkel haliyle bir otomasyon yapmak icin
        Class'imiza otomasyon icin gerekli olan webdriver'in yerini gostermemiz gerekir
        Bunun icin Java kutuphanesinden System.setProperty() methodu kullaniriz.
        method 2 parametre istemektedir
        Ilki kullanacagimiz driver: webdriver.chrome.driver
        ikincisi ise bu driverin fiziki yolu:
         */


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokha\\IdeaProjects\\com.Batch59Selenium\\src\\recources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com");
        Thread.sleep(2000);
        driver.get("https://www.amazon.com");

    }


}
