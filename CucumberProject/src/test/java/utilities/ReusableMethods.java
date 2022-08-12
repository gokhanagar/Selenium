package utilities;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pages.HomePage;
import java.util.HashMap;
import java.util.Map;
import static baseURLs.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class ReusableMethods {
        public static void adminLogin() {
        HomePage homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        homePage.accountMenu.click();
        waitFor(1);
        homePage.signInButton.click();
        homePage.usernameBox.sendKeys(ConfigReader.getProperty("adminUsername"));
        homePage.passwordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        homePage.signInButton2.click();
    }

    public static void doctorLogin() {
        HomePage homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        homePage.accountMenu.click();
        waitFor(1);
        homePage.signInButton.click();
        homePage.usernameBox.sendKeys(ConfigReader.getProperty("doctorUsername"));
        homePage.passwordBox.sendKeys(ConfigReader.getProperty("doctorPassword"));
        homePage.signInButton2.click();
    }

    public static void staffLogin() {
        HomePage homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        homePage.accountMenu.click();
        waitFor(1);
        homePage.signInButton.click();
        homePage.usernameBox.sendKeys(ConfigReader.getProperty("staffUsername"));
        homePage.passwordBox.sendKeys(ConfigReader.getProperty("staffPassword"));
        homePage.signInButton2.click();
    }

    public static void customerLogin() {
        HomePage homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        homePage.accountMenu.click();
        waitFor(1);
        homePage.signInButton.click();
        homePage.usernameBox.sendKeys(ConfigReader.getProperty("customerLogin"));
        homePage.passwordBox.sendKeys(ConfigReader.getProperty("customerPassword"));
        homePage.signInButton2.click();
    }

    public static String generateToken() {
        //setting the base url and path params
        spec.pathParams("first", "api", "second", "authenticate");

        //setting the expected data since we have less data, we can use map to store the data, else use pojo
        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("password", "vusalgasimov");
        expectedData.put("rememberMe", true);
        expectedData.put("username", "vusalgasimov");

        //setting the request body and getting the response
        Response response = given().spec(spec).contentType(ContentType.JSON).body(expectedData).when().post("/{first}/{second}");
        response.prettyPrint();
        JsonPath json = response.jsonPath();


        return json.getString("id_token");

    }

    public static String generateToken1(String username,String password){

        Map<String,Object>map = new HashMap<String,Object>();
        map.put("username", username);
        map.put("password", password);
        map.put("rememberme", true);

        String endPoint = "https://www.medunna.com/api/authenticate";

        Response response = given().contentType(ContentType.JSON).body(map).when().post(endPoint);

        JsonPath token = response.jsonPath();

        return token.getString("id_token");
    }

    //==============Hard Wait==============
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
