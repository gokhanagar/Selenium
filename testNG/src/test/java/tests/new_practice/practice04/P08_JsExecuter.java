package tests.new_practice.practice04;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class P08_JsExecuter extends TestBase {
    @Test
    public void name() throws InterruptedException {
        driver.get("https://amazon.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        /*
        -- ID'si ILE LOCATE
        WebElement element = (WebElement)
                js.executeScript("return document.getElementById('twotabsearchtextbox');");

          js.executeScript("return document.getElementById('twotabsearchtextbox');")
       kodu, JavaScriptExecutor aracılığıyla belirli bir ID değerine sahip bir web elementini locate etmek için
       kullanılan bir koddur. Bu kod, JavaScriptExecutor aracılığıyla tarayıcıda çalıştırılır ve getElementById()
       metodu kullanılarak 'twotabsearchtextbox' ID değerine sahip bir elementi locate eder.
       Bu kodun döndürdüğü sonuç, locate edilen elementi temsil eden bir WebElement nesnesidir.
       Bu WebElement nesnesi, daha sonra Selenium komutları ile bu element üzerinde işlem yapmak için kullanılabilir.
       Örneğin, bu elementin içeriğini almak veya tıklamak için kullanılabilir.

        -- XPATH ILE LOCATE
        WebElement element = (WebElement) js.executeScript
                ("return document.evaluate(\"//*[@id='twotabsearchtextbox']\", " +
                        "document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null ).singleNodeValue;");
        */
        //--CSS SELECTOR ILE LOCATE
        WebElement element = (WebElement)
                js.executeScript("return document.querySelector('input[id=twotabsearchtextbox]');");

        //METIN GÖNDERİYORUZ
        js.executeScript("arguments[0].value='selenium'", element);

        element.submit();
        //CLASSNAME ILE LOCATE
        WebElement element2 = (WebElement)
                js.executeScript("return document.getElementsByClassName('navFooterBackToTopText')[0];");

        //LOCATE ALDIĞIMIZ WEB ELEMENTE SCROLL YAPTIK
        js.executeScript("arguments[0].scrollIntoView(true);", element2);

        Thread.sleep(3000);

        //WEB ELEMENTE CLICK YAPTIK
        js.executeScript("arguments[0].click();",element2);


    }
}
