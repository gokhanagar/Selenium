package engJunit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class Day10_Screenshots extends TestBase {




    @Test
    public void screenshotTest() throws Exception {
        driver.get("https://www.google.com");
//        create a reusable method
        takeScreenShot();
//        locating input, typing tesla cybertruck, and clicking enter
        driver.findElement(By.name("q")).sendKeys("tesla cybertruck"+ Keys.ENTER);
        takeScreenShot();
    }
    /*
    * How do do capture screenshot in your automation framework?/How do you get screenshot in selenium?
    * I use getScreenshotas method to capture teh screenshot.
    * Actually we have a reusable methods to capture the screenshot
    *
    * */
}
