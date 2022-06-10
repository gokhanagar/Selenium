package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DataTablesPage;
import utilities.Driver;

public class DataTablesDefs {
    Actions actions = new Actions(Driver.getDriver());
    DataTablesPage dtb = new DataTablesPage();


    @And("tum bilgileri {string},{string},{string},{string},{string},{string},{string} girer")
    public void tumBilgileriGirer(String firstName, String lastName,
                                  String position, String office ,
                                  String extension, String startDate,
                                  String salary) {
        actions.click(dtb.firstName).sendKeys(firstName).sendKeys(Keys.TAB).sendKeys(lastName).sendKeys(Keys.TAB)
                .sendKeys(position).sendKeys(Keys.TAB).sendKeys(office).sendKeys(Keys.TAB)
                .sendKeys(extension).sendKeys(Keys.TAB).sendKeys(startDate).sendKeys(Keys.TAB).sendKeys(salary).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("kullanici ilk isim ile arama yapar{string}")
    public void kullaniciIlkIsimIleAramaYapar(String firstName) {
        dtb.search.sendKeys(firstName+Keys.ENTER);
    }

    @Then("isim bolumunde isminin oldugunu dogrular{string}")
    public void isimBolumundeIsmininOldugunuDogrular(String firstname) {
        Assert.assertTrue(dtb.aramaSonucIlkElement.getText().contains(firstname));
    }

}
