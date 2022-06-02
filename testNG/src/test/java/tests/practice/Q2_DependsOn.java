package tests.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

public class Q2_DependsOn  {

       /*
    birbirine bagimli testler olusturun..
    .beforeClass olusturup setUp ayarlarini yapin..
      birbirine bagimli testler olusturarak;
          ilk once facebook a gidin
          sonra facebook a bagimli olarak google a gidin,
          daha sonra google a bagimli olarak amazon a gidin
    driver i kapatin

 */

    @Test
    public void test01() {
        //ilk facebook'a git
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        //facebook'a bagli google'a git
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

    }

    @Test(dependsOnMethods = "test02" )
    public void test03(){
        //google'a bagli amazon'a git
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.closeDriver();

    }







}
