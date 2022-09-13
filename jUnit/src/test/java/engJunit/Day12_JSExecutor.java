package engJunit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Day12_JSExecutor extends TestBase {
    @Test
    public void jsExecutorTest() throws InterruptedException {

        driver.get("https://www.carettahotel.com/");
        Thread.sleep(3000);

//        1.Creating js executor object
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        2. use js executor object to add your action

//                                                      //tag[@attrubute='value']
//                                                      * == all, .='TEXT ON THE PAGE'
        WebElement ourRooms = driver.findElement(By.xpath("//*[.='Our Rooms']"));
        js.executeScript("arguments[0].scrollIntoView(true);",ourRooms);


        Thread.sleep(3000);
        WebElement email = driver.findElement(By.xpath("//span[.='info@carettahotel.com']"));
        js.executeScript("arguments[0].scrollIntoView(true);",email);

        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//input[@type='submit']")));

    }



}
