package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

import static org.bouncycastle.cms.RecipientId.password;

public class HMCStepDefinitions {
    HMCPage hmcPage = new HMCPage();
    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        hmcPage.loginButonu.click();
    }

    @And("gecerli username girer")
    public void gecerliUsernameGirer() {
        hmcPage.usernameKutusu.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    }

    @And("gecerli password girer")
    public void gecerliPasswordGirer() {
        hmcPage.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    }

    @And("login butonuna basar")
    public void loginButonunaBasar() {
        hmcPage.loginButonu2.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfayaGirisYaptiginiKontrolEder() {
        Assert.assertTrue(hmcPage.hotelManagement.isDisplayed());
    }


    @And("gecersiz password {string} girer")
    public void gecersizPasswordGirer(String invalidPassword) {

        hmcPage.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
    }

    @Then("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {

        Assert.assertTrue(hmcPage.loginButonu2.isDisplayed());
    }

    @And("gecersiz username {string} girer")
    public void gecersizUsernameGirer(String invalidUsername) {
        hmcPage.usernameKutusu.sendKeys(ConfigReader.getProperty(invalidUsername));
    }

    @And("gecersiz username olarak {string} girer")
    public void gecersizUsernameOlarakGirer(String invalidUsername) {
        hmcPage.usernameKutusu.sendKeys(invalidUsername);

    }

    @And("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String invalidPassword) {
        hmcPage.passwordKutusu.sendKeys(invalidPassword);
    }
}
