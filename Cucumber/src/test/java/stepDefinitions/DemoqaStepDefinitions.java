package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoqaPage;
import utilities.Driver;

import java.time.Duration;

public class DemoqaStepDefinitions {
    DemoqaPage demoqaPage = new DemoqaPage();
    Actions action = new Actions(Driver.getDriver());
    @And("Alerts,Frame,Windows butonuna tiklar")
    public void alertsFrameWindowsButonunaTiklar() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        demoqaPage.alertsFrameWindowsBolumu.click();
    }

    @And("Alerts'e tiklar")
    public void alertsETiklar() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        demoqaPage.alertsWindowsMenusu.click();

    }

    @And("On button click, alert will appear after five seconds karsisindaki click me butonuna basar")
    public void onButtonClickAlertWillAppearAfterSecondsKarsisindakiClickMeButonunaBasar() {

        demoqaPage.alertWillAppearAfterFiveSecondsButton.click();
    }

    @And("Allert'in gorunur olmasini bekleyin")
    public void allertInGorunurOlmasiniBekleyin() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent( ));
    }

    @Then("Allert uzerindeki yazinin “This alert appeared after five seconds” oldugunu test edin")
    public void allertUzerindekiYazininThisAlertAppearedAfterSecondsOldugunuTestEdin() {
        String actualText = Driver.getDriver().switchTo().alert().getText();
        String expectedText = "This alert appeared after 5 seconds";
        Assert.assertEquals(expectedText,actualText);
    }

    @And("Ok yazisina tiklayarak alerti kapatin")
    public void okYazisinaTiklayarakAlertiKapatin() {

        Driver.getDriver().switchTo().alert().accept();
    }


}
