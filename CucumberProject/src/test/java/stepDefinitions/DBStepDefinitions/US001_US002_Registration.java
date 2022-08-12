package stepDefinitions.DBStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

public class US001_US002_Registration {
    @Given("Kullanici Database ile baglanti saglar")
    public void kullaniciDatabaseIleBaglantiSaglar() {
        DBUtils.createConnection();
    }

    @When("Kullanici {string} tablosundan tum kullanicilarin {string} bilgilerini alir")
    public void kullaniciTablosundanTumKullanicilarinBilgileriniAlir(String tablo, String sutun) {
        String query = "Select " + sutun + " from " + tablo + "";
        DBUtils.executeQuery(query);
    }

    @And("Kullanici {string} tablosunun {string} sutununda {string} verisi oldugunu dogrular")
    public void kullaniciTablosununSutunundaVerisiOldugunuDogrular(String tablo, String sutun, String ssn) {
        List<Object> allColumnData = DBUtils.getColumnData("select * from " + tablo + "", sutun);
        Assert.assertTrue(allColumnData.contains(ssn));

    }

    @Then("Kullanici database ile baglantisini keser")
    public void kullanicidatabaseIleBaglantisiniKeser() {
        DBUtils.closeConnection();
    }
}
