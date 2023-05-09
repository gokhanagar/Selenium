package tests.new_practice.practice04;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P06_ReadExcel extends TestBase{
    @Test
    public void name() throws IOException {

        //Bilgisayarınızdaki data isimli excel dosyasından kullanıcı bilgilerini alıp
        String dosyaYolu = "C:\\Users\\Lenovo\\OneDrive\\Masaüstü\\data.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        String email = workbook.getSheet("Sayfa1")
                .getRow(1).getCell(1).toString();
        System.out.println(email);
        String password = workbook.getSheet("Sayfa1")
                .getRow(2).getCell(1).toString();
        System.out.println(password);

        //https://www.bluerentalcars.com/ adresine gidip

        driver.get("https://www.bluerentalcars.com/");
        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
        WebElement emailBox = driver.findElement(By.xpath("//input[@id='formBasicEmail']"));
        emailBox.sendKeys(email, Keys.TAB,password);
        driver.findElement(By.xpath("(//*[text()=' Login'])[2]")).click();
        //Excel dosyasından aldığımız kullanıcı bilgileri ile login olalım
        //Login olduğumuzu doğrulayalım
        WebElement login = driver.findElement(By.id("dropdown-basic-button"));
        assert login.getText().equals("Erol Evren");


    }
}
