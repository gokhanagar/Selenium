package engJunit;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Day08_Actions3 extends TestBase {
/*
* We may need to scroll the pages
* When the page is long, or element is not displayed properly b/c element is at the buttom of the page
* Then we have to scroll the page
* With Actions class, we can scroll down,up,left,right
*
*
*
* */
    @Test
    public void scrollUpDown() throws InterruptedException {
        driver.get("https://www.amazon.com");

        Thread.sleep(3000);

//        1. To scroll pages, we can use Actions class or Javascript Executor
        Actions actions = new Actions(driver);
//        2. Use actions to scroll the page
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

//        ARROW_DOWN : scrolling a little bit
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
//        ARROW_DOWN
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();


//        Scrolling up
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);


//        ARROW_UP: scrolling a little bit
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_UP).perform();
//        ARROW_UP
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_UP).perform();

    }
}
