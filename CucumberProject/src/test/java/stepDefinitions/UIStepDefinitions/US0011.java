package stepDefinitions.UIStepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.GknPage;

import static utilities.ReusableMethods.waitFor;

public class US0011 {
    GknPage editPage = new GknPage();
    @And("Hasta bilgilerini dogrula")
    public void hastaBilgileriniDogrula() throws InterruptedException {

        System.out.println(editPage.startDateEditPage.getText());
        System.out.println(editPage.endDateEditPage.getText());

        waitFor(1);
        //Assert.assertEquals("169761", editPage.idDoctorEditPage.getText());
        Assert.assertEquals("16/08/22 03:00", editPage.startDateEditPage.getText());
        Assert.assertEquals("16/08/22 04:00", editPage.endDateEditPage.getText());


    }
}
