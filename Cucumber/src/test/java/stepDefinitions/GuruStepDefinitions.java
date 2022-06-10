package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;


public class GuruStepDefinitions {
    GuruPage guruPage = new GuruPage();
    /*
    @Given("cookies sorulursa kabul eder")
    public void cookies_sorulursa_kabul_eder() {
        Driver.getDriver().switchTo().frame(guruPage.cookiesIframe);
        guruPage.acceptCookies.click();
    }
    */

    @And("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenenSutun) {

        List<WebElement> tabloBasliklariListesi = guruPage.baslikListesi;
        // listemiz webelementlerden olusuyor dolasiyla bu weblemenetlerden
        //hangisi istenen sutun basligini tasiyor bilemeyiz

        int istenenBaslikIndexi = -3;
        for(int i=0; i< tabloBasliklariListesi.size(); i++){
            if(tabloBasliklariListesi.get(i).getText().equals(istenenSutun)){
                istenenBaslikIndexi = i + 1;
                break;
            }
        }

        //for loop ile tum sutun basliklarini bana verilen istenenSutun degeri ile
        //karsilastirdim loop bittiginde basligin bulunup bulunmadigini kontrol etmek ve
        //bulundu ise yoluna devam etmek istiyorum

        if(istenenBaslikIndexi != -3){
            List<WebElement> istenenSutundakiElementler =
                    Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+ istenenBaslikIndexi+"]"));

            for(WebElement each : istenenSutundakiElementler){
                System.out.println(each.getText());
            }
        }else{
            System.out.println("istenen baslik bulunamadi");
        }

    }




}
