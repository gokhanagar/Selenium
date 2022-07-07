package tests.Log4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class Day14_Log4j {

    private static Logger logger = LogManager.getLogger(Log4j.class.getName());
    @Test
    public void log4JDemo(){

        logger.info("Info Log");
        logger.debug("Debug Log");
        logger.error("Error Log");
        logger.fatal("Fatal Log");
        logger.warn("Warn Log");

        //1. Change the LEVEL to trace to see ALL LOGS
        //2. Log the information on a file
        //3. Do all there for the tests package ONLY



    }























}
