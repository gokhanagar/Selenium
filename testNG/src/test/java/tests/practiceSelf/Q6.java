package tests.practiceSelf;

import org.testng.annotations.Test;
import pages.AddressBookLoginPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;


public class Q6 {


    AddressBookLoginPage addressBookLoginPage = new AddressBookLoginPage();

    @Test
    public void loginTest() {
        Driver.getDriver().get(ConfigReader.getProperty("addressUrl"));

        addressBookLoginPage.username.sendKeys(ConfigReader.getProperty("addressUsername"));
        addressBookLoginPage.password.sendKeys(ConfigReader.getProperty("addressPass"));
        addressBookLoginPage.loginButton.click();


    }

}
