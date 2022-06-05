package tests.day21_reusableMethods_HtmlReports;

import org.testng.annotations.Test;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;
import tests.utilities.ReusableMethods;

import java.io.IOException;

public class C02_ScreenShotReusableMethod {

    @Test
    public void test01() throws IOException{
        // amazon sayfasina gidip fotografini cekelim

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.getScreenshot("amazon");
        Driver.closeDriver();
    }
}
