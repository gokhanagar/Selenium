package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

import java.time.Duration;
import java.util.List;

public class Q07_DropDown extends TestBase {
    // go to url : https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/
    //-->Task1 Find Dropdown on Multi Selection
    //-->Task2 Find  all Dropdown Elements on page
    //-->Task3 printout DropDown Elements' number
    //-->Task4 choose dropdown elements and printout dropdown elements' name  until choise 6


    @Test
    public void test(){
        // go to url : https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

        //-->Task1 Find Dropdown on Multi Selection
        driver.findElement(By.xpath("//input[@id ='justAnInputBox']")).click();

        //-->Task2 Find  all Dropdown Elements on page
        List<WebElement> dropList = driver.findElements(By.xpath("//span[@class ='comboTreeItemTitle']"));

        //-->Task3 printout DropDown Elements' number
        System.out.println("dropListteki elementlerin sayisi :" +dropList.size()); //dropListteki elementlerin sayisi :45

        System.out.println("********");

        //-->Task4 choose dropdown elements and printout dropdown elements' name

        for (int i = 0; i < dropList.size(); i++) {
            String text = dropList.get(i).getText();
            System.out.println("text = " + text);

            if(text.equals("choice 6")){
                dropList.get(i).click();
                break;
            }
        }
    }

}
