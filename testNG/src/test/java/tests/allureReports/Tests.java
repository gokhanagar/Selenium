package tests.allureReports;

import io.qameta.allure.*;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.DHtmlGoodiesPage;
import tests.utilities.Driver;

public class Tests {



    @Test(description="drag and drop")
    @Description("drag and drop")
    @Epic("EP001")
    @Feature("Feature1: Checking functions")
    @Story("Verify drag and drop functions")
    @Severity(SeverityLevel.CRITICAL)
    public void test() {
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        DHtmlGoodiesPage dhtmlpage = new DHtmlGoodiesPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(dhtmlpage.Oslo,dhtmlpage.Norway).
                dragAndDrop(dhtmlpage.Stockholm,dhtmlpage.Sweden).
                dragAndDrop(dhtmlpage.washington,dhtmlpage.UnitedStates).
                dragAndDrop(dhtmlpage.Copenhagen,dhtmlpage.Denmark).
                dragAndDrop(dhtmlpage.Seoul, dhtmlpage.southKorea).
                dragAndDrop(dhtmlpage.Madrid,dhtmlpage.Spain).
                dragAndDrop(dhtmlpage.Roma,dhtmlpage.Italy).perform();

    }
























}
