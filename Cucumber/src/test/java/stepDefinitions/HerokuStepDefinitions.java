package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuappPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuStepDefinitions {

    HerokuappPage herokuappPage = new HerokuappPage();
    @Given("add element butonuna basar")
    public void add_element_butonuna_basar(){
        herokuappPage.addElementButtonu.click();
    }

    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void deleteButonuGorunurOluncayaKadarBekler() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herokuappPage.deleteElementButonu));
    }

    @And("Delete butonunun gorunur oldugunu test eder")
    public void deleteButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(herokuappPage.deleteElementButonu.isDisplayed());
    }


    @Then("Delete butonuna basar")
    public void deleteButonunaBasar() {
        herokuappPage.deleteElementButonu.click();
    }

    @And("Delete butonunun gorunmedigini test eder")
    public void deleteButonununGorunmediginiTestEder() {
        Assert.assertTrue(herokuappPage.deleteListesi.isEmpty());
    }
    /*
    @And("Delete butonunun gorunmedigini test eder")
    public void deleteButonununGorunmediginiTestEder() {
        Assert.assertTrue(herokuappPage.deleteListesi.isEmpty());
        Assert.assertFalse(Boolean.parseBoolean(herokuappPage.deleteElementButonu.getAccessibleName()));
    }
     */
}
