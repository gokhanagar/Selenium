package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class GridStepDef {

    WebDriver driver;
    @Given("user is on the application_URL with chrome")
    public void userIsOnTheApplication_URLWithChrome() throws MalformedURLException {
      driver = new RemoteWebDriver(new URL("http://192.168.1.5:4444"), new ChromeOptions());
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.manage().window().maximize();
      driver.get("https://www.bluerentalcar.com/");
    }

    @And("verify the title of the page is {string}")
    public void verifyTheTitleOfThePageIs(String title) {
        String actualTitle = driver.getTitle();
        String expectedTitle = title;
        assertEquals(expectedTitle,actualTitle);

    }

    @Then("close the remote driver")
    public void closeTheRemoteDriver() {

        driver.quit();
    }

    @Given("user is on the application_URL with firefox")
    public void userIsOnTheApplication_URLWithFirefox() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.1.5:4444"), new FirefoxOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.bluerentalcar.com/");

    }

}