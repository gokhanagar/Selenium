package tests.day18_pom;

import org.testng.annotations.Test;
import tests.day22_crossBrowser.utilities.ConfigReader;
import tests.day22_crossBrowser.utilities.Driver;

public class C01_ConfigReader {

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        Driver.closeDriver();
    }


}
