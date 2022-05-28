package day06_radioButton_checkBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_CheckBox {
    WebDriver driver;
    //1. Bir class oluşturun : CheckBoxTest
    //2.Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test() throws InterruptedException {
        //a. Verilen web sayfasına gidin.
        //https://theinternet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //b. Checkbox1 ve checkbox2 elementlerini locate edin.
        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        //c. Checkbox1 seçili değilse onay kutusunu tıklayın

        if (!checkBox1.isSelected()) {
            checkBox1.click();
        }
        Thread.sleep(3000);
        //d. Checkbox2 seçili değilse onay kutusunu tıklayın
        if (!checkBox2.isSelected()) {
            checkBox2.click();
        }


    }


}
