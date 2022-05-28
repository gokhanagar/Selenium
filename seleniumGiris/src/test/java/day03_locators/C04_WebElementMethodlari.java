package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {
    /*
    1- amazon.com'a gidip arama kutusunu locate edin
    2- arama kutusunun tagName'inin input oldugunu test edin
    3- arama kutusunun name attribute'nun degerinin ...... oldugunu test edin
    */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/recources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://www.amazon.com");

        //2- arama kutusunun tagName'inin input oldugunu test edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();

        if (expectedTagName.equals("input")) {
            System.out.println("TagName testi PASSED");
        } else System.out.println("TagName testi FAILED");


        // 3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
        String expectedNameDegeri = "field-keywords";
        String actualNameDegeri = aramaKutusu.getAttribute("name");

        if (expectedNameDegeri.equals(actualNameDegeri)) {
            System.out.println("name attribute testi PASSED");
        } else {
            System.out.println("name attribute testi FAILED");
        }

        System.out.println("konum : " + aramaKutusu.getLocation());
        System.out.println("webelement yuksekligi : " + aramaKutusu.getSize().height);
        driver.close();

        /*
        <input type="text" id="twotabsearchtextbox" value="nutella"
        name="field-keywords" autocomplete="off" placeholder=""
        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">


        webElementIsmi.getTagName() --> daha once locate ettigimiz bir webelementin tagname'ni dondurur
        webElementIsmi.getAttribute(attributeIsmi) --> daha once locate ettigimiz bir webelementin
                                                      istedigim attribute'unun degerini dondurur
         */

    }
}
