package stepDefinitions.APIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojos.Appointment;

import static org.junit.Assert.assertEquals;
import static utilities.ReusableMethods.generateToken1;

public class US0010 {
    Response response;

    @Given("user given api {string}")
    public void userGivenApi(String url) {

        RestAssured.baseURI = url;
    }

    @When("user sends a Get request to {string}")
    public void userSendsAGetRequestTo(String endpoint) {

        RestAssured.basePath = endpoint;
        response = RestAssured.given().
                header("Authorization", "Bearer " + generateToken1("DoktorTeam50", "m.team50"))
                .when().get();
        response.prettyPrint();

    }


    @Then("user validates {string}{string}, {string}, {string}, {string}")
    public void userValidates(String id, String patientId, String startDate, String endDate, String status) {
        Appointment actualData = response.as(Appointment.class);

        assertEquals(Integer.parseInt(id), actualData.getId());
        assertEquals(Integer.parseInt(patientId), actualData.getPatient().getId());
        assertEquals(startDate, actualData.getStartDate());
        assertEquals(endDate, actualData.getEndDate());
        assertEquals(status, actualData.getStatus());


    }
}
