package tests.day18_pom;

import org.testng.annotations.Test;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

public class C01_ConfigReader {

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        Driver.closeDriver();
    }


}