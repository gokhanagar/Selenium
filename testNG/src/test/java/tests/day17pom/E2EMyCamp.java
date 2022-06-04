package tests.day17pom;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import tests.day22_crossBrowser.utilities.ConfigReader;
import tests.day22_crossBrowser.utilities.Driver;

public class E2EMyCamp {

    @Test
    public void test(){
        HotelMyCampPage hotelmycamp = new HotelMyCampPage();
        //1.Tests packagenin altına class olusturun: CreateHotel
        //2. Bir metod olusturun: createHotel
        //3.https://www.hotelmycamp.com adresine gi t
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        //login butonuna bas
        hotelmycamp.loginKutusu.click();

        /*4.
        Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
        a. Username: manager
        b. Password: Manager1!
        */

        hotelmycamp.userNameTexti.sendKeys("manager");
        hotelmycamp.passwordTexti.sendKeys("manager1!"+ Keys.ENTER);

        //. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin.
        hotelmycamp.hotelManagementMenu.click();
        hotelmycamp.hotelListButton.click();
        hotelmycamp.addHotelButton.click();

        //Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.


















    }

















}
