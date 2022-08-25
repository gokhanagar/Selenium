package stepDefinitions.UIStepDefinitions;

import io.cucumber.java.en.And;
import pages.GknPage;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.UIStepDefinitions.US020.fakeSSN;

public class US019 {
    GknPage admin = new GknPage();

    @And("id butonuna tikla ve ilgili ssn'nin var oldugunu dogrula")
    public void idButonunaTiklaVeIlgiliSsnNinVarOldugunuDogrula() {
        admin.id.click();

        for (int i = 0; i < admin.satirUzunlugu.size(); i++) {

            if (admin.satirUzunlugu.get(2).getText().contains(fakeSSN)) {

                   assertEquals(admin.satirUzunlugu.get(2).getText(),fakeSSN);
            }
        }

    }
    

}
