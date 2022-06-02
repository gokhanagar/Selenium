package tests.practice;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TwitterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

import java.time.format.DateTimeFormatter;

public class Q6_DropDown_FakerClass {
    //twitter a faker class kullanarak mail ile kayit olmaya calisiniz
    //actions class kullanmayin twitteri deneyen instagram i denesin

    @Test
    public void test01() throws InterruptedException {
        TwitterPage twitterPage = new TwitterPage();
        //Twitter sayfasina gidildi.
        Driver.getDriver().get(ConfigReader.getProperty("twitterUrl"));

        //Kayit ol butonuna tiklandi
        twitterPage.signUpWithPhoneOrEmailButton.click();

        //isim gonderildi.
        Faker faker = new Faker();
        twitterPage.nameElementi.sendKeys(faker.name().fullName());

        //telefon numarasi gonderildi.
        twitterPage.phoneNumberElementi.sendKeys("5418953265");

        //ay gonderildi
        Select select1 = new Select(twitterPage.monthDDM);
        select1.selectByValue("5");

        //gun gonderildi
        Select select2 = new Select(twitterPage.dayDDM);
        select2.selectByValue("10");

        //yil gonderildi
        Select select3 = new Select(twitterPage.yearDDM);
        select3.selectByValue("1996");

        //Next butonuna tiklandi
        Thread.sleep(1000);
        twitterPage.nextButton.click();


    }


}
