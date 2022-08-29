package stepDefinitions.UIStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GknPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.JSUtils.*;
import static utilities.ReusableMethods.waitFor;

public class US020 {
    GknPage admin = new GknPage();
    Faker faker = new Faker();
    static String fakeSSN;
    String fakeMail;
    String fakeFirstName;
    String fakeLastName;
    String fakeUsername;



    @Given("medunna sayfasina gider")
    public void medunnaSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
    }

    @When("Account menu ve register butonuna tikla")
    public void accountMenuVeRegisterButonunaTikla() {

        admin.accountMenu.click();
        admin.registerButton.click();
        assertEquals("Registration", admin.registrationText.getText());
    }

    @And("tum bilgileri gir ve register butonuna tikla")
    public void tumBilgileriGirVeRegisterButonunaTikla() throws InterruptedException {

        fakeMail = faker.internet().emailAddress();
        fakeFirstName = faker.name().firstName();
        fakeLastName = faker.name().lastName();
        fakeSSN = faker.idNumber().ssnValid();
        fakeUsername = faker.name().username();
        System.out.println(fakeSSN);
        System.out.println(fakeFirstName);
        System.out.println(fakeLastName);

        Actions action = new Actions(Driver.getDriver());
        action.click(admin.ssnBox).sendKeys(fakeSSN).
                sendKeys(Keys.TAB).sendKeys(fakeFirstName).
                sendKeys(Keys.TAB).sendKeys(fakeLastName).
                sendKeys(Keys.TAB).sendKeys(fakeUsername).
                sendKeys(Keys.TAB).sendKeys(fakeMail).
                sendKeys(Keys.TAB).sendKeys("56895689TG.").
                sendKeys(Keys.TAB).sendKeys("56895689TG.").perform();

        clickElementByJS(admin.finalRegisterButton);

    }

    @And("account menu ve sign in butonuna tikla")
    public void accountMenuVeSignInButonunaTikla() {
        admin.accountMenu.click();
        admin.signInButton.click();

    }

    @And("admin olarak giris yap")
    public void adminOlarakGirisYap() {

        admin.usernameBox.sendKeys(ConfigReader.getProperty("adminUsername"));
        admin.passwordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        admin.secondSignIn.click();
    }

    @And("items&titles menusu ve staff bolumune tikla")
    public void itemsTitlesMenusuVeStaffBolumuneTikla() {
        admin.itemsTitlesButton.click();
        admin.staffButton.click();
    }

    @And("create a new staff butonuna tikla")
    public void createANewStaffButonunaTikla() {
        admin.createANewStaffButton.click();
    }

    @And("Gerekli bilgileri doldur ve save butonuna tikla")
    public void gerekliBilgileriDoldurVeSaveButonunaTikla() {

        assertTrue(admin.createOrEditaStaffText.isDisplayed());
        admin.useSearchSsnCheckbox.click();
        admin.staffSsnInput.sendKeys(fakeSSN);
        admin.ssnSearchUserButton.click();
        Actions action = new Actions(Driver.getDriver());


        action.click(admin.phoneBox).sendKeys("541-789-5632").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress()).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys("USA").sendKeys(Keys.TAB).sendKeys("California").perform();

        clickElementByJS(admin.saveButtonStaff);
    }

    @And("Administration ve user management butonuna tikla")
    public void administrationVeUserManagementButonunaTikla()  {
        admin.administrationButton.click();
        admin.userManagementButton.click();

    }

    @And("id butonuna tikla ve ilgili ssn icin view bolumune tikla")
    public void idVeIlgiliSsnIcinViewBolumuneTikla() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(admin.id));
        clickElementByJS(admin.id);

        waitFor(2);
        addBorderWithJS(admin.viewButonu,"thick solid #0000FF");
        clickElementByJS(admin.viewButonu);

    }

    @Then("tum bilgileri dogrula ve geri don")
    public void tumBilgileriDogrulaVeGeriDon()  {
        waitFor(2);

        System.out.println(admin.userFirstName.getText());
        System.out.println(admin.userLastName.getText());

        assertEquals(fakeFirstName,admin.userFirstName.getText());
        assertEquals(fakeLastName,admin.userLastName.getText());
        assertEquals(fakeMail,admin.userEmail.getText());

    }


    @And("id butonuna tikla ve ilgili ssn icin edit bolumune tikla")
    public void idButonunaTiklaVeIlgiliSsnIcinEditBolumuneTikla() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(admin.id));
        admin.id.click();
        waitFor(2);
        addBorderWithJS(admin.editButtonUMP,"thick solid #0000FF");
        clickElementByJS(admin.editButtonUMP);
    }

    @Then("kullaniciyi aktif et ve ADMIN, USER PATIENT, STAFF ve PHYSICIAN olarak atandigini dogrular")
    public void kullaniciyiAktifEtVeADMINUSERPATIENTSTAFFVePHYSICIANOlarakAtandiginiDogrular() {

        clickElementByJS(admin.editCheckBox);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(admin.profilesMenu));
        Select select = new Select(admin.profilesMenu);

        select.selectByValue("ROLE_ADMIN");
        select.selectByValue("ROLE_USER");
        select.selectByValue("ROLE_PATIENT");
        select.selectByValue("ROLE_STAFF");
        select.selectByValue("ROLE_PHYSICIAN");

        clickElementByJS(admin.saveButtonUMP);

        wait.until(ExpectedConditions.elementToBeClickable(admin.id));
        admin.id.click();
        waitFor(2);
        admin.id.click();
        waitFor(2);
        admin.id.click();
        waitFor(2);


        for (int i = 0; i < admin.satirUzunlugu.size(); i++){

            if(admin.satirUzunlugu.get(6).getText().contains("ROLE_ADMIN")){

                assertTrue(admin.userProfilePatient.isDisplayed());
                assertTrue(admin.userProfilePhysician.isDisplayed());
                assertTrue(admin.userProfileUser.isDisplayed());
                assertTrue(admin.userProfileStaff.isDisplayed());
                assertTrue(admin.userProfileAdmin.isDisplayed());

            }
        }


    }


    @Then("id butonu, ilgili ssn icin delete bolumune tikla ve silindigini dogrula")
    public void idButonuIlgiliSsnIcinDeleteBolumuneTiklaVeSilindiginiDogrula() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(admin.id));
        admin.id.click();

        clickElementByJS(admin.deleteButtonUMP);
        waitFor(2);
        clickElementByJS(admin.deleteConfirmButtonUMP);



        
    }
}
