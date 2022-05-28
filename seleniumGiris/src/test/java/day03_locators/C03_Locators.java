package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/recources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //         a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        //b. Sign in butonuna basin
        WebElement singInLinki = driver.findElement(By.linkText("Sign in"));
        singInLinki.click();

        // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordTextBox = driver.findElement(By.name("session[password]"));
        WebElement singInButonu = driver.findElement(By.name("commit"));

        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        singInButonu.click();


        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).

        WebElement actualKullaniciAdiElementi = driver.findElement(By.className("navbar-text"));
        System.out.println(actualKullaniciAdiElementi.getText());
        String expectedUserMail = "testtechproed@gmail.com";
        //bir webElementin uzerinde ne yazdigini gormek istersek webElementIsmi.getText() kullaniriz

        if (expectedUserMail.equals(actualKullaniciAdiElementi.getText())) {
            System.out.println("Expected kullanici testi PASSED");
        } else {
            System.out.println("Expected kullanici testi FAILED");
        }


        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement addressesElementi = driver.findElement(By.linkText("Addresses"));
        WebElement signoutElementi = driver.findElement(By.linkText("Sign out"));

        if (addressesElementi.isDisplayed()) {
            System.out.println("addresses testi PASSED");
        } else System.out.println("Addresses testi FAILED");


        if (signoutElementi.isDisplayed()) {
            System.out.println("signOut testi PASSED");
        } else System.out.println("signOut testi FAILED");


        //  3. Sayfada kac tane link oldugunu bulun.

        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("sayfadaki link sayisi : " + linklerListesi.size());

        //Listemiz webElementlerden olsutugu icin. direk yazdirisak referanslari yazdirir
        //onun yerine for-each loop yapip her bir link webelementinin uzerindeki yaziyi yazdirmaliyiz

        //Linkleri yazdiralim

        for (WebElement each : linklerListesi) {

            System.out.println(each.getText());


        }
        driver.close();


    }
}
