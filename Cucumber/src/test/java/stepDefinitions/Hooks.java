package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    /*
    Cucumber'da step definitions package'i icerisinde @before @after gibi bir
    annotaion varsa extends testBase dememize gerek kalmadan her scenario'dan once
    ve/veya sonra bu methodlar calisacaktir

    Buda bizim isteyecegimiz bir durum degildir

    Cucumber'da @before, @after kullanma ihtiyacimiz olursa bunu stepdefinitions
    package'i altinda olusturacagimiz hooks class'ina koyariz

    Biz her scenario'dan sonra test sonucunu kontrol edip failed olan scenario'lar icin
    screenshot almasi amaciyla @After method'u kullanacagiz
     */

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }

}
