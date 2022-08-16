package screenShot;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class ScreenOfSpecificElements extends TestBase {

    //screenshot of google image

    @Test
    public void screenShotTest() throws IOException {
        driver.get("https://www.google.com");
        WebElement googleLogo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        File logoImage = googleLogo.getScreenshotAs(OutputType.FILE);

        //Save the image to path
        File finalPath = new File("C:\\Users\\gokha\\IdeaProjects\\jUnit\\target\\classes/googleLogo.png");
        FileUtils.copyFile(logoImage,finalPath);




    }
















}
