package tests.day21_reusableMethods_HtmlReports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.utilities.Driver;
import tests.utilities.ReusableMethods;

import java.util.Set;

public class C01_WindowHandleReusableMethods {

    @Test
    public void test01() {

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaWHD = Driver.getDriver().getWindowHandle();

        //● Click Here butonuna basın.
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        Set<String> windowHandleseti = Driver.getDriver().getWindowHandles();
        String ikinciSayfaWDD = "";
        for (String each : windowHandleseti) {
            if (!ilkSayfaWHD.equals(each)) {
                ikinciSayfaWDD = each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWDD);
        System.out.println(Driver.getDriver().getTitle());
        //acilan yeni tab'in title'inin "New Window" oldugunu test edin
        String expectedTitle = "New Window";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        Driver.closeDriver();
    }

    @Test
    public void test02() {
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        //● Click Here butonuna basın.
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        // acilan yeni tab'in title'inin "New Window" oldugunu test edin
        ReusableMethods.switchToWindow("New Window");
        String expectedTitle1 = "New Window";
        String actualTitle1 = Driver.getDriver().getTitle();
        System.out.println(actualTitle1);

        Assert.assertEquals(actualTitle1, expectedTitle1);
        Driver.closeDriver();


    }


}