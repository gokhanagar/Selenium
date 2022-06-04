package tests.practice;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DhtmlGoodiesPage;
import tests.day22_crossBrowser.utilities.ConfigReader;
import tests.day22_crossBrowser.utilities.Driver;

public class Q5_DragAndDrop  {
    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.

    @Test
    public void test() {
        DhtmlGoodiesPage dhtmlGoodiesPage = new DhtmlGoodiesPage();
        Actions action = new Actions(Driver.getDriver());
        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        Driver.getDriver().get(ConfigReader.getProperty("dhtmlgoodiesUrl"));

        // Fill in capitals by country.
        action.dragAndDrop(dhtmlGoodiesPage.romeDragElementi, dhtmlGoodiesPage.italyDropElementi)
        .dragAndDrop(dhtmlGoodiesPage.madridDragElementi, dhtmlGoodiesPage.spainDropElementi)
        .dragAndDrop(dhtmlGoodiesPage.osloDragElementi, dhtmlGoodiesPage.norwayDropElementi)
        .dragAndDrop(dhtmlGoodiesPage.seoulDragElementi, dhtmlGoodiesPage.southKoreaDropElementi)
        .dragAndDrop(dhtmlGoodiesPage.washingtonDragElementi, dhtmlGoodiesPage.unitedStatesDropElementi)
        .dragAndDrop(dhtmlGoodiesPage.copenhagenDragElementi, dhtmlGoodiesPage.denmarkDropElementi)
        .dragAndDrop(dhtmlGoodiesPage.stockholmDragElementi, dhtmlGoodiesPage.swedenDropElementi).perform();

        Driver.closeDriver();


    }


}