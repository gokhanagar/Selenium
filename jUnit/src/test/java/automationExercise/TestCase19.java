package automationExercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TestCase19 extends TestBase {

    @Test
    public void test() throws InterruptedException {

        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");

        //3. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();

        //4. Verify that Brands are visible on left side bar
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Brands']")).isDisplayed();

        //5. Click on any brand name
        driver.findElement(By.xpath("//*[text()='Polo']")).click();

        //6. Verify that user is navigated to brand page and brand products are displayed
        driver.findElement(By.xpath("/html/body")).isDisplayed();
        driver.findElement(By.xpath("//h2[@class = 'title text-center']")).isDisplayed();

        //7. On left side bar, click on any other brand link
        driver.findElement(By.xpath("//*[text()='H&M']")).click();
        Thread.sleep(2000);

        //8. Verify that user is navigated to that brand page and can see products
        WebElement hmPageElement = driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        String expectedData = "H&M";
        String actualData = hmPageElement.getText();
        Assert.assertTrue(actualData.contains(expectedData));
        driver.findElement(By.xpath("//div[@class ='col-sm-9 padding-right']")).isDisplayed();


    }


}
