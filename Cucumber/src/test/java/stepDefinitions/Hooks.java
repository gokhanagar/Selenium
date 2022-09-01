package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static utilities.Driver.driver;

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
     //   Driver.closeDriver();
    }



    /*
    public static void takeScreenShot() throws IOException {
//        1. Taking screenshot using getScreenshotAs
        File image = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        /*
        Alternatively
        TakesScreenshot ts=(TakesScreenshot)driver;
        File image = ts.getScreenshotAs(OutputType.FILE);


//        2. We will save the image in this path. using currentDate for getting different name every time
        String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//        System.out.println(currentDate);
        String path = System.getProperty("user.dir") + "/test-output/Screenshots/" + currentDate + "test-image.png";
        File finalPath = new File(path);
        FileUtils.copyFile(image, finalPath);

    }
    */

}
