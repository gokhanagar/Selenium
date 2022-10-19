package tests.day17pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

public class E2EMyCamp {

    @Test
    public void test() throws InterruptedException {
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
        hotelmycamp.passwordTexti.sendKeys("Manager1!" + Keys.ENTER);

        //. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin.
        hotelmycamp.hotelManagementMenu.click();
        hotelmycamp.hotelListButton.click();
        hotelmycamp.addHotelButton.click();

        //Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        WebElement codeElementi = Driver.getDriver().findElement(By.xpath("//input[@class='form-control input-lg required']"));
        Actions action = new Actions(Driver.getDriver());
        action.click(codeElementi).sendKeys("89745").sendKeys(Keys.TAB).
                sendKeys("gkn").sendKeys(Keys.TAB).sendKeys("esk").sendKeys(Keys.TAB).
                sendKeys("5458975412").sendKeys(Keys.TAB).sendKeys("asd@gmail.com").perform();

        WebElement ddm = Driver.getDriver().findElement(By.xpath("//select[@id='IDGroup']"));
        Select select = new Select(ddm);
        select.selectByVisibleText("Hotel Type1");
        action.sendKeys(Keys.END).perform();

        Driver.getDriver().findElement(By.id("btnSubmit")).click();
        Thread.sleep(1000);

        //9. “Hotel was inserted successfully” textinin göründüğünü test edin.
        WebElement textAreaElementi = Driver.getDriver().findElement(By.xpath("(//div[@class='modal-body'])[2]"));
        Assert.assertTrue(textAreaElementi.isDisplayed());

        //10. OK butonuna tıklayın.
        Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary']")).click();


    }


}