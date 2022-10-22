package tests.day17pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import tests.utilities.Driver;

public class PositiveTestMyCamp {


    @Test
    public void test01(){

        HotelMyCampPage HotelMyCampPage =  new HotelMyCampPage();
        //https://www.hotelmycamp.com/  adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");

        //login butonuna bas
        HotelMyCampPage.loginKutusu.click();

        //test data username: manager
        HotelMyCampPage.userNameTexti.sendKeys("manager");

        //test data password :Manager1!
        HotelMyCampPage.passwordTexti.sendKeys("Manager1!" + Keys.ENTER);

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Actions action= new Actions(Driver.getDriver());
        action.moveToElement(HotelMyCampPage.userNameAfterLogin).perform();
        Assert.assertTrue(HotelMyCampPage.logOutButton.isDisplayed());
        Driver.closeDriver();












    }


}
