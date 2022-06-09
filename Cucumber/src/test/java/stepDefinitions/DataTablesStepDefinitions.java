package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTablesStepDefinitions {

    DataTablesPage dataTablesPage = new DataTablesPage();
    @Then("new butonuna basar")
    public void newButonunaBasar() {
        dataTablesPage.newButonu.click();
    }

    @And("isim bolumune {string} yazar")
    public void isimBolumuneYazar(String firstName) {
        dataTablesPage.firstName.sendKeys(firstName);
    }

    @And("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) throws InterruptedException {
        Thread.sleep(istenenSaniye*1000);
    }

    @And("soyisim bolumune {string} yazar")
    public void soyisimBolumuneYazar(String lastName) {
        dataTablesPage.lastName.sendKeys(lastName);
    }

    @And("position bolumune {string} yazar")
    public void positionBolumuneYazar(String position) {
        dataTablesPage.position.sendKeys(position);
    }

    @And("ofis bolumune {string} yazar")
    public void ofisBolumuneYazar(String office) {
        dataTablesPage.office.sendKeys(office);
    }

    @And("extension bolumune {string} yazar")
    public void extensionBolumuneYazar(String extension) {
       dataTablesPage.extn.sendKeys(extension);
    }

    @And("start_date bolumune {string} yazar")
    public void start_dateBolumuneYazar(String startDate) {
        dataTablesPage.startDate.sendKeys(startDate);
    }

    @And("salary bolumune {string} yazar")
    public void salaryBolumuneYazar(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }

    @And("Create butonuna basar")
    public void createButonunaBasar() {
        dataTablesPage.create.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
        dataTablesPage.search.sendKeys(firstName);

    }

    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String firstName) {

        Assert.assertTrue(dataTablesPage.aramaSonucIlkElement.getText().contains(firstName));
    }
}
