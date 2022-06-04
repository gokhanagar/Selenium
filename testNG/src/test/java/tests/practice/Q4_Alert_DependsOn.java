package tests.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebDriverUniversityPage;
import tests.day22_crossBrowser.utilities.ConfigReader;
import tests.day22_crossBrowser.utilities.Driver;

import static tests.day22_crossBrowser.utilities.Driver.getDriver;

public class Q4_Alert_DependsOn  {

       /*
     // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
     // 2. CLICK ME of JavaScript Alert e tıklayın
     // 3. pop up text i alın
     // 4. Mesajın "I am an alert box!"  olduğunu doğrulayın.
     // 5. pop up i kabul edin

     // Yine ayni class da baska test methodu olusturun
     // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
     // 2.  CLICK ME of JavaScript Confirm Box i  TIKLAYIN
     // 3.  pop up text i alın
     // 4. Mesajın "Press a button!" olduğunu doğrulayın
     // 5. Açılır pencereyi kapat
     // 6. pop up i iptal edin,
     // 7. "You pressed Cancel!" yazisinin goruntulendigini dogrulayin
     // 8. alert1'e göre dependsOnMethods kullanın
 */

    @Test
    public void test01() {
        WebDriverUniversityPage webDriverUniversityPage = new WebDriverUniversityPage();
        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        getDriver().get(ConfigReader.getProperty("webDriverUniversityUrl"));

        // 2.  CLICK ME of JavaScript Alert e tıklayın
        webDriverUniversityPage.clickMeOfJSAlertBox.click();

        // 3. pop up text i alın
        String actualJSAlertMessage = Driver.getDriver().switchTo().alert().getText();

        // 4. Mesajın "I am an alert box!"  olduğunu doğrulayın.
        String expectedConfirmBoxAlertMessage = "I am an alert box!";
        Assert.assertEquals(actualJSAlertMessage, expectedConfirmBoxAlertMessage);

        // 5. pop up i kabul edin
        Driver.getDriver().switchTo().alert().accept();

    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        WebDriverUniversityPage webDriverUniversityPage = new WebDriverUniversityPage();
        // Yine ayni class da baska test methodu olusturun
        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("webDriverUniversityUrl"));

        // 2.  CLICK ME of JavaScript Confirm Box i  TIKLAYIN
        webDriverUniversityPage.clickMeOfJSConfirmBox.click();

        // 3.  pop up text i alın
        String actualJSConfimBoxAlertMessage = Driver.getDriver().switchTo().alert().getText();

        // 4. Mesajın "Press a button!" olduğunu doğrulayın
        String expectedJSConfirmBoxAlertMessage = "Press a button!";
        Assert.assertEquals(actualJSConfimBoxAlertMessage, expectedJSConfirmBoxAlertMessage);

        // 5. Açılır pencereyi kapat


        // 6. pop up i iptal edin,
        Driver.getDriver().switchTo().alert().dismiss();

        // 7. "You pressed Cancel!" yazisinin goruntulendigini dogrulayin
        Assert.assertTrue(webDriverUniversityPage.jsConfirmBoxAlertCancelledText.isDisplayed());

        // 8. alert1'e göre dependsOnMethods kullanın


    }


}

