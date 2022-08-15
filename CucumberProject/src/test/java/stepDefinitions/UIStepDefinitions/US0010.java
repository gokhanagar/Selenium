package stepDefinitions.UIStepDefinitions;

import io.cucumber.java.en.And;
import pages.GknPage;

import static org.junit.Assert.assertTrue;

public class US0010 {
    GknPage dktr = new GknPage();

    @And("from ve to zaman dilimlerini gor")
    public void fromVeToZamanDilimleriniGor() {

        assertTrue(dktr.fromDate.isDisplayed());
        assertTrue(dktr.toDate.isDisplayed());
    }


    @And("Kullanici randevu listesini gorebilmeli")
    public void kullaniciRandevuListesiniGorebilmeli() {

        System.out.println(dktr.hastaBilgileri.size());
        for (int i = 0; i <dktr.hastaBilgileri.size(); i++){
            assertTrue(dktr.hastaBilgileri.get(i).isDisplayed());
        }
    }

    @And("Kullanici hast id, start date, end date, status bilgilerini gorebilmeli")
    public void kullaniciHastIdStartDateEndDateStatusBilgileriniGorebilmeli() {
        for(int i=0; i<dktr.ilkHasta.size(); i++){
            assertTrue(dktr.ilkHasta.get(i).isDisplayed());
        }

    }

}
