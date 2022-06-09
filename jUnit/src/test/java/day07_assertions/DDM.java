package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DDM {

//Go to https://the-internet.herokuapp.com/dropdown
//1.Create method selectByIndexTest and Select Option 1 using index
//2.Create method selectByValueTest Select Option 2 by value
//3.Create method selectByVisibleTextTest Select Option 1 value by visible text
//4.Create method printAllTest Print all dropdown value
//5.Create method printFirstSelectedOptionTest Print first selected option
//6.Find the size of the dropdown,
// Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }

    @Test
    public void selectByIndexTest() throws InterruptedException {
        //1.Create method selectByIndexTest and Select Option 1 using index
        //1.Locate the dropdown
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        //2.Create a select object
        Select select = new Select(dropdown);
        //3.Select any option by using index - NOTE that index starts from 0
        Thread.sleep(5000);//not must
        select.selectByIndex(1);//Option 1
        Thread.sleep(5000);
        select.selectByIndex(2);//Option 2
        Thread.sleep(5000);
        select.selectByIndex(1);//Option 1
        Thread.sleep(5000);
        select.selectByIndex(0);//Please select an option
        Thread.sleep(5000);
    }

    @Test
    public void selectByValueTest() throws InterruptedException {
        //2.Create method selectByValueTest Select Option 2 by value
        //1.Locate the dropdown
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        //2.Create a select object
        Select select = new Select(dropdown);
        //3.Select any option by using selectByValue()
        Thread.sleep(5000);
        select.selectByValue("2");//Option 2
    }

    @Test
    public void selectByVisibleTextTes() throws InterruptedException {
        //3.Create method selectByVisibleTextTest Select Option 1 value by visible text
        //1.Locate the dropdown
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        //2.Create select object
        Select select = new Select(dropdown);
        //3.Select Option 1 by using visible text
        Thread.sleep(5000);
        select.selectByVisibleText("Option 1");//Option 1 is selected
        Thread.sleep(5000);
        select.selectByVisibleText("Option 2");
        Thread.sleep(5000);
        select.selectByVisibleText("Please select an option");
    }

    @Test
    public void printAllTest() {
        //4.Create method printAllTest Print all dropdown value
        //1.Locate the dropdown
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        //2.Create select object
        Select select = new Select(dropdown);
        //3.Print all dropdown value
        List<WebElement> allOptions = select.getOptions();
        System.out.println(allOptions.size());
        for (WebElement eachOption : allOptions) {
            System.out.println(eachOption.getText());
        }
        // Verify the "Option 2" is in the dropdown
        boolean flag = false;
        for (WebElement eachOption : allOptions) {
            if (eachOption.getText().equals("Option 2")) {
                flag = true;
            }
        }
        Assert.assertTrue(flag);
    }

    @Test
    public void printFirstSelectedOptionTest() {
        //5.Create method printFirstSelectedOptionTest Print first selected option
        //1.Locate the dropdown
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        //2.Create select object
        Select select = new Select(dropdown);
        //3. get the first selected option(default) with printFirstSelectedOption()
        //If multiple options are selected, this method returns us 1st element
        // If you change another option, this returns new 1st one
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        System.out.println("Selected Option: " + firstSelectedOption.getText());//Selected Option: Please select an option

        //select Option 2
        select.selectByVisibleText("Option 2");
        System.out.println("Selected Option: " + select.getFirstSelectedOption().getText());

        //NOTE
        List<WebElement> allSelectedOption = select.getAllSelectedOptions();
        //Returns all options if multiple options are selected as List<WebElement>
        System.out.println(allSelectedOption.size());
        for (WebElement eachSelectedOption : allSelectedOption) {
            System.out.println(eachSelectedOption.getText());
        }
    }

    @Test
    public void sizeTest() {
        //6.Find the size of the dropdown,
        //1.Locate the dropdown
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        //2.Create select object
        Select select = new Select(dropdown);
        //3.Find the size of dropdown
        List<WebElement> allOptions = select.getOptions();
        int sizeOfDropDown = allOptions.size();
        System.out.println(sizeOfDropDown);

        // Print "Expected Is Not Equal Actual" if there are not 4 elements in the dropdown.
        Assert.assertEquals("Expected Is Not Equal Actual", 3, sizeOfDropDown);
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}

