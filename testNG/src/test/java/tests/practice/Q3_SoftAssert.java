package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.SauceDemoPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q3_SoftAssert  {

    /*
     * Navigate to  https://www.saucedemo.com/
     * Enter the user name  as standard_user
     * Enter the password as   secret_sauce
     * Click on login button
     *     T1 : Choose price low to high with soft Assert
     *     T2 : Verify item prices are sorted from low to high with hard Assert
     */


    @Test
    public void test01() {
        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        //* Navigate to  https://www.saucedemo.com/
        Driver.getDriver().get(ConfigReader.getProperty("saucedemoUrl"));

        //* Enter the user name  as standard_user
        sauceDemoPage.userNameElementi.sendKeys(ConfigReader.getProperty("sauceDemoCorrectUserName"));

        //* Enter the password as   secret_sauce
        sauceDemoPage.passwordElementi.sendKeys(ConfigReader.getProperty("sauceDemoCorrectPassword"));

        //* Click on login button
        sauceDemoPage.loginButton.click();

        //T1 : Choose price low to high with soft Assert
        Select select = new Select(sauceDemoPage.ddmNameAToZ);
        select.selectByVisibleText("Price (low to high)");

        //T1 : Verify item prices are sorted from low to high with soft Assert
        String actual = select.getFirstSelectedOption().getText();
        String expected = "Price (low to high)";
        String actual2 = Driver.getDriver().findElement(By.className("active_option")).getText();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actual,expected);
        softAssert.assertEquals(actual2,expected);

        Driver.closeDriver();
    }

    /*
    @Test
    public void test02(){

        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        //* Navigate to  https://www.saucedemo.com/
        Driver.getDriver().get(ConfigReader.getProperty("saucedemoUrl"));

        //* Enter the user name  as standard_user
        sauceDemoPage.userNameElementi.sendKeys(ConfigReader.getProperty("sauceDemoCorrectUserName"));

        //* Enter the password as   secret_sauce
        sauceDemoPage.passwordElementi.sendKeys(ConfigReader.getProperty("sauceDemoCorrectPassword"));

        //* Click on login button
        sauceDemoPage.loginButton.click();

        // Choose price low to high with soft Assert
        Select select = new Select(sauceDemoPage.ddmNameAToZ);
        select.selectByVisibleText("Price (low to high)");

        //T2 : Verify item prices are sorted from low to high with hard Assert
        String actualSelectedTitle = select.getFirstSelectedOption().getText();
        String expectedSelectedTitle = "Price (low to high)";
        Assert.assertEquals(actualSelectedTitle, expectedSelectedTitle, "secilen option dogru degil");

        Driver.closeDriver();

    }
*/
}
