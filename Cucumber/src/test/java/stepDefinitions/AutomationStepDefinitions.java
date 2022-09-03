package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.Driver;

public class AutomationStepDefinitions {
    AutomationPage atp= new AutomationPage();
    Faker faker= new Faker();
    Actions action= new Actions(Driver.getDriver());

    @And("user sign in linkine tiklar")
    public void userSignInLinkineTiklar() {

        atp.singInButton.click();
    }


    @And("user Create and account bolumune email adresi girer")
    public void userCreateAndAccountBolumuneEmailAdresiGirer() {
        atp.emailTextBox.sendKeys(faker.internet().emailAddress());
    }

    @And("Create and Account butonuna basar")
    public void createAndAccountButonunaBasar() {
        atp.createAccountButton.click();
    }

    @And("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void userKisiselBilgileriniVeIletisimBilgileriniGirer() {

        atp.gender.click();
        action.
                click(atp.firstName)
                .sendKeys(faker.name().firstName()+ Keys.TAB)
                .sendKeys(faker.name().lastName() +Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password() + Keys.TAB)
                .sendKeys("28" +Keys.TAB)
                .sendKeys("April" +Keys.TAB)
                .sendKeys("1993" +Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(faker.address().cityName())
                .sendKeys(Keys.TAB)
                .sendKeys("Alaska" + Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys("United States" + Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys("ALSK")
                .perform();
    }

    @And("user Register butonuna basar")
    public void userRegisterButonunaBasar() {

        atp.registerButton.click();
    }

    @Then("hesap olustugunu dogrular")
    public void hesapOlustugunuDogrular() {

        Assert.assertTrue(atp.positiveResultText.isDisplayed());
    }

    @And("email kutusuna @ isareti olmayan email adresi yazar ve enter;a tiklar")
    public void emailKutusunaIsaretiOlmayanEmailAdresiYazarVeEnterATiklar() {

        atp.emailTextBox.sendKeys("gokhanagargmail.com");
    }

    @Then("error mesajinin {string} oldugunu dogrulayin")
    public void errorMesajininOldugunuDogrulayin(String istenenKelime) {

        Assert.assertTrue(atp.negativeResultText.isDisplayed());

    }




}
