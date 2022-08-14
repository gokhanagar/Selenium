package stepDefinitions.UIStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.GknPage;
import utilities.Driver;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.doctorLogin;
import static utilities.ReusableMethods.waitFor;

public class US0011 {
    GknPage dktr = new GknPage();

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
    }

    @And("Zaman diliminin gorunur oldugunu dogrula")
    public void zamanDilimininGorunurOldugunuDogrula() {
        assertTrue(dktr.fromDate.isDisplayed());
        assertTrue(dktr.toDate.isDisplayed());

    }

    @And("ilk hasta icin Edit butonuna tikla")
    public void ilkHastaIcinEditButonunaTikla() {

        dktr.editButton.click();
    }

    @And("Doktor ekranin saginda gorunen edit butonuna tiklar")
    public void doktorEkraninSagindaGorunenEditButonunaTiklar() {
    }

    @Then("Doktor Create or Edit an Appointment sayfasina gittigini dogrular")
    public void doktorCreateOrEditAnAppointmentSayfasinaGittiginiDogrular() {
    }

    @And("Status Anamnesis Treatment Diagnosis Prescription Aspirin Description kismlarini doldur")
    public void statusAnamnesisTreatmentDiagnosisPrescriptionAspirinDescriptionKismlariniDoldur() {
    }

    @And("Save butonuna tikla")
    public void saveButonunaTikla() {
    }

    @And("ilk hastanin tum bilgilerinin gorunur oldugunu dogrula")
    public void ilkHastaninTumBilgilerininGorunurOldugunuDogrula() {
    }

    @Then("Doktor sayfayi kapatir")
    public void doktorSayfayiKapatir() {
    }

    @And("Id Start DateTime End DateTime Status Physician Patient  bilgilerinin gorunur olgugunu dogrula")
    public void idStartDateTimeEndDateTimeStatusPhysicianPatientBilgilerininGorunurOlgugunuDogrula() {
    }

    @And("Anamnesis Treatment Diagnosis bolumunu temizle")
    public void anamnesisTreatmentDiagnosisBolumunuTemizle() {
    }

    @And("This field is required ifadelerinin goruldugunu dogrula")
    public void thisFieldIsRequiredIfadelerininGoruldugunuDogrula() {
    }

    @And("Create or Edit an Appointment yazisinin gorunur oldugunu dogrula")
    public void createOrEditAnAppointmentYazisininGorunurOldugunuDogrula() {
    }

    @Given("Prescription Description bolumunu temizle")
    public void prescriptionDescriptionBolumunuTemizle() {
    }

    @And("ucuncu hasta icin Edit butonuna tikla")
    public void ucuncuHastaIcinEditButonunaTikla() {
    }

    @Given("Status kismini tikla PENDING secimini yap")
    public void statusKisminiTiklaPENDINGSeciminiYap() {
    }

    @And("Statusun PENDING oldugunu dogrula")
    public void statusunPENDINGOldugunuDogrula() {
    }

    @And("Status kismini tikla COMPLETED secimini yap")
    public void statusKisminiTiklaCOMPLETEDSeciminiYap() {
    }

    @And("Statusun COMPLETED oldugunu dogrula")
    public void statusunCOMPLETEDOldugunuDogrula() {
    }

    @And("ikinci hasta icin Edit butonuna tikla")
    public void ikinciHastaIcinEditButonunaTikla() {
    }

    @And("Status kismini tikla CANCELLED secimini yap")
    public void statusKisminiTiklaCANCELLEDSeciminiYap() {
    }

    @And("Statusun CANCELLED oldugunu dogrula")
    public void statusunCANCELLEDOldugunuDogrula() {
    }
}
