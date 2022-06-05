package tests.day17pom;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import tests.utilities.Driver;

public class NegativeTestMyCamp {
    HotelMyCampPage hotelmycamp = new HotelMyCampPage();
    @Test
    public void test01(){

        //https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");

        //login butonuna bas
        hotelmycamp.loginKutusu.click();

        //test data username: manager1
        hotelmycamp.userNameTexti.sendKeys("manager1");

        //test data username: manager1!
        hotelmycamp.passwordTexti.sendKeys("manager1!"+ Keys.ENTER);


        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hotelmycamp.girisYapilamadiElementi.isDisplayed());

        Driver.getDriver().close();


    }


















}
