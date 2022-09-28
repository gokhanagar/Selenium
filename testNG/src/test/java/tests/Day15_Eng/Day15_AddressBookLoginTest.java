package tests.Day15_Eng;

import org.testng.annotations.Test;
import pages.AddressBookLoginPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;


public class Day15_AddressBookLoginTest {


    AddressBookLoginPage addressBookLoginPage = new AddressBookLoginPage();
    @Test
    public void loginTest(){
        Driver.getDriver().get(ConfigReader.getProperty("address_url"));
//        addressBookLoginPage.username.sendKeys("testtechproed@gmail.com");
//        addressBookLoginPage.password.sendKeys("Test1234!");

        addressBookLoginPage.username.sendKeys(ConfigReader.getProperty("address_username"));
        addressBookLoginPage.password.sendKeys(ConfigReader.getProperty("address_pass"));
        addressBookLoginPage.loginButton.click();

//        Driver.closeDriver();
    }

}
