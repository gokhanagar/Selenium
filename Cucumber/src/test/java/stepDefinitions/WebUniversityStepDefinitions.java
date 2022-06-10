package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class WebUniversityStepDefinitions {

    WebUniversityPage uni = new WebUniversityPage();

    @Then("{string} kadar asagi iner")
    public void kadar_asagi_iner(String string) {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).perform();
    }

    @And("login portala tiklar")
    public void loginPortalaTiklar() {
        uni.loginPortalButton.click();
    }

    @And("diger windowa gecer")
    public void digerWindowaGecer() {
        ReusableMethods.switchToWindow("WebDriver | Login Portal");
    }

    @And("username {string} yazar")
    public void usernameYazar(String username) {
        uni.username.sendKeys(username);
    }

    @And("password {string} yazar")
    public void passwordYazar(String password) {
        uni.password.sendKeys(password);
    }

    @And("Login butonuna tiklar")
    public void loginButonunaTiklar() {
        uni.loginButton.click();
    }

    @And("popup yazisinin {string} oldugunu test eder")
    public void popupYazisininOldugunuTestEder(String expectedText) {
        String actualText = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @And("popupi ok ile kapatir")
    public void popupiOkIleKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("ilk sayfaya doner")
    public void ilkSayfayaDoner() {
        ReusableMethods.switchToWindow("WebDriverUniversity.com");
    }

    @And("ilk sayfaya dondugunu test eder")
    public void ilkSayfayaDondugunuTestEder() {
        Assert.assertTrue(uni.loginPortalButton.isDisplayed());
    }
}
