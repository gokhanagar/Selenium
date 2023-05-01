package tests.new_practice.practice03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Deneme extends TestBase {
    @Test
    public void name() throws InterruptedException {
        driver.get("http://szimek.github.io/signature_pad/");

        WebElement canvas = driver.findElement(By.tagName("canvas"));
        Actions actions = new Actions(driver).moveToElement(canvas)
                .clickAndHold();
        double yariCap =10;
        for (int i = 0; i <= 20; i++) {
            double yariCapAcisi = Math.toRadians(((double) i / 20) * 360);
            double x = Math.sin(yariCapAcisi) * yariCap;
            double y = Math.cos(yariCapAcisi) * yariCap;
            actions.moveByOffset((int) x, (int) y);
        }

        actions.release(canvas);
        actions.build().perform();

        Thread.sleep(5000);
    }
}
