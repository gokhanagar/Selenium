package stepDefinitions.UIStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.GknPage;
import utilities.Driver;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.JSUtils.clickElementByJS;
import static utilities.ReusableMethods.doctorLogin;
import static utilities.ReusableMethods.waitFor;

public class US0011 {
    GknPage dktr = new GknPage();

    //TC-001
    @Given("Doktor medunnaURl adresine gider ve kullanici bilgileri ile giris yapar")
    public void doktorMedunnaURlAdresineGiderVeKullaniciBilgileriIleGirisYapar() {

        doctorLogin();
    }
    
    @Then("Doktor My Pages menusunde ki My Appointments butonuna tiklar")
    public void doktorMyPagesMenusundeKiMyAppointmentsButonunaTiklar() {

        dktr.myPages.click();
        waitFor(2);
        dktr.myAppointments.click();
    }

    @And("Appointment'in gorunur oldugunu dogrula")
    public void appointmentinGorunurOldugunuDogrula() {

        dktr.myAppointmentsYazisi.isDisplayed();

    }

    @And("Onbes gunluk tarih araligini sec")
    public void onbesGunlukTarihAraliginiSec() {

        Actions action = new Actions(Driver.getDriver());

        action.doubleClick(dktr.fromDate).
                sendKeys("2022").sendKeys(Keys.ARROW_RIGHT).
                sendKeys("08").
                sendKeys("10").sendKeys(Keys.TAB).
                sendKeys("2022").sendKeys(Keys.ARROW_RIGHT).
                sendKeys("08").
                sendKeys("25").sendKeys(Keys.TAB).perform();
                waitFor(5);
    }

    @And("Zaman diliminin gorunur oldugunu dogrula")
    public void zamanDilimininGorunurOldugunuDogrula() {
        assertTrue(dktr.fromDate.isDisplayed());
        assertTrue(dktr.toDate.isDisplayed());

    }

    @And("ilk hasta icin Edit butonuna tikla")
    public void ilkHastaIcinEditButonunaTikla() {
        waitFor(3);
        dktr.editButton.click();
    }

    @Then("Doktor Create or Edit an Appointment sayfasina gittigini dogrular")
    public void doktorCreateOrEditAnAppointmentSayfasinaGittiginiDogrular() {

        assertTrue(dktr.createOrEditAnAppointment.isDisplayed());
    }

    @And("Status Anamnesis Treatment Diagnosis Prescription Aspirin Description kisimlarini doldur")
    public void statusAnamnesisTreatmentDiagnosisPrescriptionAspirinDescriptionKisimlariniDoldur() {

        Select select = new Select(dktr.status);
        select.selectByIndex(1);

        dktr.anamnesis.clear();
        dktr.anamnesis.sendKeys("Anamnesis");
        dktr.treatment.clear();
        dktr.treatment.sendKeys("Treatment");
        dktr.diagnosis.clear();
        dktr.diagnosis.sendKeys("Diagnosis");
        waitFor(2);
    }

    @And("Save butonuna tikla")
    public void saveButonunaTikla() {

        clickElementByJS(dktr.save);
    }

    @And("ilk hastanin tum bilgilerinin gorunur oldugunu dogrula")
    public void ilkHastaninTumBilgilerininGorunurOldugunuDogrula() {
        waitFor(3);
        System.out.println("Ilk hasta bilgileri " + dktr.ilkHasta.size());
        for(int i=0; i<dktr.ilkHasta.size(); i++){
            assertTrue(dktr.ilkHasta.get(i).isDisplayed());
        }
    }

    @Then("Doktor sayfayi kapatir")
    public void doktorSayfayiKapatir() {
        Driver.closeDriver();
    }

    //TC-002
    @And("Id Start DateTime End DateTime Status Physician Patient  bilgilerinin gorunur olgugunu dogrula")
    public void idStartDateTimeEndDateTimeStatusPhysicianPatientBilgilerininGorunurOlgugunuDogrula() {
        //Baslik Bilgileri
        List<WebElement> baslikBilgileri = dktr.baslikBilgileri; // baslik bilgileri liste atildi
        List<String> strBaslikBilgileri = new ArrayList<String>();
        for (int i=0; i< baslikBilgileri.size(); i++){
            strBaslikBilgileri.add(baslikBilgileri.get(i).getText());// webelemenet String liste atıldı
            assertTrue(baslikBilgileri.get(i).isDisplayed());// tüm baslık bilgilerini görüldüğü dogrulandı
        }

        List<String> actualBaslikBilgileri = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            actualBaslikBilgileri.add(strBaslikBilgileri.get(i));
        }
        System.out.println("actualBaslikBilgileri = " + actualBaslikBilgileri);

        List<String> expectedBaslikBilgileri = new ArrayList<String>();
        expectedBaslikBilgileri.add("ID");
        expectedBaslikBilgileri.add("Start DateTime");
        expectedBaslikBilgileri.add("End DateTime");
        expectedBaslikBilgileri.add("Status");
        assertEquals(expectedBaslikBilgileri, actualBaslikBilgileri);

        /*Hasta Bilgileri*/
        List<WebElement> hastaBilgileri = dktr.hastaBilgileri; // tüm hasta bilgileri liste atıldı

        for (int i = 0; i < hastaBilgileri.size(); i++) {
            assertTrue(hastaBilgileri.get(i).isDisplayed()); // tüm hasta bilgilerini görüntelebilir olduğu doğrulandı.

        }

    }

    //TC-003

    @And("Anamnesis Treatment Diagnosis bolumunu temizle")
    public void anamnesisTreatmentDiagnosisBolumunuTemizle() {
        dktr.anamnesis.clear();
        dktr.treatment.clear();
        dktr.diagnosis.clear();
        waitFor(2);
    }

    @And("This field is required ifadelerinin goruldugunu dogrula")
    public void thisFieldIsRequiredIfadelerininGoruldugunuDogrula() {

        assertTrue(dktr.anamnesisError.isDisplayed());
        assertTrue(dktr.diagnosisError.isDisplayed());
        assertTrue(dktr.treatmentError.isDisplayed());
    }


    @Given("Prescription Description bolumunu temizle")
    public void prescriptionDescriptionBolumunuTemizle() {

        dktr.prescription.clear();
        dktr.description.clear();
    }

    @Given("Status kismini tikla PENDING secimini yap")
    public void statusKisminiTiklaPENDINGSeciminiYap() {

        Select select=new Select(dktr.status);
        select.selectByValue("PENDING");
        waitFor(2);
        Assert.assertEquals("PENDING",dktr.status.getAttribute("value"));
    }

    @And("Status kismini tikla COMPLETED secimini yap")
    public void statusKisminiTiklaCOMPLETEDSeciminiYap() {

        Select select=new Select(dktr.status);
        select.selectByValue("COMPLETED");
        waitFor(2);
        Assert.assertEquals("COMPLETED",dktr.status.getAttribute("value"));
    }

    @And("Status kismini tikla CANCELLED secimini yap")
    public void statusKisminiTiklaCANCELLEDSeciminiYap() {

        Select select=new Select(dktr.status);
        select.selectByValue("CANCELLED");
        waitFor(2);
        Assert.assertEquals("CANCELLED",dktr.status.getAttribute("value"));
    }


}
