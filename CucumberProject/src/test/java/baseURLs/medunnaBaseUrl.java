package baseURLs;

import io.cucumber.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class MedunnaBaseUrl {

    public static RequestSpecification spec;
    @Before(value= "@Api")
    public void setUp(){
        spec=new RequestSpecBuilder().setBaseUri("https://medunna.com/").build();

    }
}
