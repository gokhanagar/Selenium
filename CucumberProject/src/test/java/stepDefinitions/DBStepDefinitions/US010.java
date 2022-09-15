package stepDefinitions.DBStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utilities.DBUtils.*;

public class US010 {
    String query = "select * from appointment";
    String fileName1 = "src/test/resources/testdata/AppointmentId.txt";
    String fileName2 = "src/test/resources/testdata/AppointmentSD.txt";
    String fileName3 = "src/test/resources/testdata/AppointmentED.txt";
    String fileName4 = "src/test/resources/testdata/AppointmentS.txt";

    //DB ile baglanti kur
    @Given("Kullanici database ile baglanti kurar")
    public void kullaniciDatabaseIleBaglantiKurar() {

        createConnection();
    }

    //Query tanimla
    @When("Kullanici query tanimlar")
    public void kullaniciQueryTanimlar() {

        System.out.println(getColumnNames(query) + "\n");
    }

    // Randevu datalarina ulas ve kaydet
    @And("Kullanici randevu bilgilerine ulasir ve kaydeder")
    public void kullaniciRandevuBilgilerineUlasirVeKaydeder() {

        System.out.println("===============ID LIST===============");
        List<Object> idList = getColumnData(query, "id");
        System.out.println(idList + "\n");
        WriteToTxt.saveAppointmentIds(fileName1, idList);

        System.out.println("===============START DATE LIST===============");
        List<Object> startDateList = getColumnData(query, "start_date");
        System.out.println(startDateList + "\n");
        WriteToTxt.saveAppointmentStartDate(fileName2, startDateList);

        System.out.println("===============END DATE LIST===============");
        List<Object> endDateList = getColumnData(query, "end_date");
        System.out.println(endDateList + "\n");
        WriteToTxt.saveAppointmentEndDate(fileName3, endDateList);

        System.out.println("===============STATUS LIST===============");

        List<Object> statusList = getColumnData(query, "status");
        System.out.println(statusList + "\n");
        WriteToTxt.saveAppointmentStatus(fileName4, statusList);

    }

    // Randevu datalarini dogrula
    @Then("Kullanici DB ile randevu bilgilerini {string}, {string},{string},{string} dogrular")
    public void kullaniciDBIleRandevuBilgileriniDogrular(String patientId, String startDate, String endDate, String status) {

        List<Object> actualAppointmentIDs = ReadTxt.returnAppointmentIDsList(fileName1);
        List<Object> expectedAppointmentIDs = new ArrayList<Object>();
        expectedAppointmentIDs.add(169761);
        assertTrue("ID UYUSMUYOR", actualAppointmentIDs.containsAll(expectedAppointmentIDs));

        List<Object> actualAppointmentStartDate = ReadTxt.returnAppointmentStartDateList(fileName2);
        List<Object> expectedAppointmentStartDate = new ArrayList<>();
        expectedAppointmentStartDate.add("2022-08-16T00:00:00Z");
        assertFalse("START DATE UYUSMUYOR", actualAppointmentStartDate.containsAll(expectedAppointmentStartDate));

        List<Object> actualAppointmentEndDate = ReadTxt.returnAppointmentEndDateList(fileName3);
        List<Object> expectedAppointmentEndDate = new ArrayList<>();
        expectedAppointmentEndDate.add("2022-08-16T01:00:00Z");
        assertFalse("END DATE UYUSMUYOR", actualAppointmentEndDate.containsAll(expectedAppointmentEndDate));

        List<Object> actualAppointmentStatus = ReadTxt.returnAppointmentStatusList(fileName4);
        List<Object> expectedAppointmentStatus = new ArrayList<>();
        expectedAppointmentStatus.add("PENDING");
        Assert.assertTrue("STATUS UYUSMUYOR", actualAppointmentStatus.containsAll(expectedAppointmentStatus));

    }
}
