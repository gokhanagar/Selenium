package tests.allureReports;

import org.testng.annotations.Test;
import pages.AddressBookLoginPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

public class Tests {

    AddressBookLoginPage addressBookLoginPage = new AddressBookLoginPage();
    @Test
    public void loginTest(){
        Driver.getDriver().get(ConfigReader.getProperty("address_url"));

        addressBookLoginPage.username.sendKeys(ConfigReader.getProperty("address_username"));
        addressBookLoginPage.password.sendKeys(ConfigReader.getProperty("address_pass"));
        addressBookLoginPage.loginButton.click();

//        Driver.closeDriver();
    }
























}
