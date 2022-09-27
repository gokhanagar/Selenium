package engJunit.information;

public class ExtentReport {
    /*
     * *Extent Reports:
     * HTML reporting tool, it gives us HTML reports
     * It helps us to save our test steps and results
     * We can add also screenshots.
     *
     * We will create 3 objects
     * 1. ExtentReports extendReport => we need this object to start reporting.
     * extentReports.flush(); we use this method to generate and end the report
     *
     * 2.ExtentHtmlReporter extendHtmlReporter => it helps us to configuration of reports.
     * We will use it to set the path where report will be saved
     *
     * 3.ExtentTest extentTest => To add information, to add logs.
     * We will add some explanation to our test steps
     */

    /*
     * Interview Questions
     *
     * ***** How do you get report?
     * When I do manual testing, I get screenshot manually and type test steps and results
     * to a Word document, and I can upload it JIRA
     *
     * When I do automation, I use extent reports generating the reports.
     * I can configure extent report based on my project information
     * In my project we customize extend report in a way that when test case fails
     * it will screenshot automatically.
     *
     * ***** What is the advantages of extent reports?
     * Open source (free)
     * Works with different browsers and platform
     * We can customize each step
     * We can log each step
     * It can work with different frameworks, junit, testng..
     *
     *
     * ***** How extent reports generate the test report?
     * We use Maven, We added extent report dependency to our pom.xml file
     * We have a reusable class, we make configuration in this class
     *
     * ExtentReports
     * ExtentHtmlReport   ==>> for generating reports
     * ExtentTest
     *
     *ExtentReports and ExtentHtmlReport are used for adding custom information
     * such as browser, environment..
     *
     * ExtentTest => to log every step of test case => skip, fail, pass, warning ...
     *
     *
     *
     * ****** Where do you get your dependencies?
     *  We can get dependencies from company repository. I check and get the dependency
     * If I can not find the dependency which I needed, I will ask test lead, manager, technical lead...
     * */


}
