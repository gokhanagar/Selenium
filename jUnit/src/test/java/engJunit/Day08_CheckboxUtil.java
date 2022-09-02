package engJunit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Day08_CheckboxUtil extends TestBase {

    @Test
    public void checkboxTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        Thread.sleep(3000);
        selectCheckBox(checkbox1,true);

        Thread.sleep(3000);
        selectCheckBox(checkbox2,true);

//        RESULT : I should see all boxed are checked


    }

}
