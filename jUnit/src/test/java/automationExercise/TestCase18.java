package automationExercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TestCase18 extends TestBase {


    @Test
    public void test() throws InterruptedException {

        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");

        //3. Verify that categories are visible on left side bar
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='left-sidebar']")).isDisplayed();

        // 4. Click on 'Women' category
        driver.findElement(By.xpath("//a[@data-parent='#accordian']")).click();

        //5. Click on any category link under 'Women' category, for example: Dress
        driver.findElement(By.xpath("//a[@href='/category_products/2']")).click();

        //6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
        driver.findElement(By.xpath("//div[@class='breadcrumbs']")).isDisplayed();
        WebElement womenProductElement = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        String actualData = womenProductElement.getText();
        String expectedData = "WOMEN - TOPS PRODUCTS";
        Assert.assertEquals(expectedData, actualData);

        //7. On left side bar, click on any sub-category link of 'Men' category
        driver.findElement(By.xpath("(//a[@data-toggle='collapse'])[2]")).click();
        driver.findElement(By.xpath("//a[@href='/category_products/3']")).click();

        //8. Verify that user is navigated to that category page
        driver.findElement(By.xpath("//div[@class='breadcrumbs']")).isDisplayed();


    }


}
