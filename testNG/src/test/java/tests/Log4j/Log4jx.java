package tests.Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import tests.utilities.Driver;



public class Log4jx {




    Logger logger = LogManager.getLogger(Log4jx.class.getName());

    @Test
    public void log4JTest() {
        logger.info("Opening the URL");
        Driver.getDriver().get("https://www.carettahotel.com/");

        logger.info("Clicking on Login Button");
        Driver.getDriver().findElement(By.linkText("Log in")).click();

        logger.fatal("Fatal Log"); // prints by default with no configuration
        logger.error("Error Log"); //ERROR by default with no configuration
        logger.debug("Debug Log");



        //log klasorunun icine file gelmesi lazim ama gelmiyo
    }
}
