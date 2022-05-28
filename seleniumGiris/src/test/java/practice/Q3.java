package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3 {
    public static void main(String[] args) {

        // ...Exercise3...
        //fill the date
        //choose your profession -> Automation Tester
        //choose your tool -> Selenium Webdriver
        //choose your continent -> Antartica
        //choose your command  -> Browser Commands
        //click submit button

        System.setProperty("webdriver.chrome.driver", "src/recources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().deleteAllCookies();// bu sitede ise yaramadı..
        driver.findElement(By.xpath("//a[@id ='cookieChoiceDismiss']")).click(); //cerezleri kabul ettim..
        //fill the firstname
        driver.findElement(By.name("firstname")).sendKeys("Elif");
        //fill the lastname
        driver.findElement(By.name("lastname")).sendKeys("Celik");
        //check the gender
        driver.findElement(By.xpath("//input[@id ='sex-1']")).click();
        //check the experience
        driver.findElement(By.id("exp-2")).click();
        //fill the date
        driver.findElement(By.id("datepicker")).sendKeys("16/05/2022");
        //choose your profession -> Automation Tester
        driver.findElement(By.id("profession-1")).click();
        //choose your tool -> Selenium Webdriver
        driver.findElement(By.id("tool-2")).click();
        //choose your continent -> Antartica
        driver.findElement(By.xpath("//option[.='Antartica']")).click();
        //choose your command  -> Browser Commands
        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();
        //click submit button
        driver.findElement(By.xpath("//button[@id='submit']")).click();


    }
}
