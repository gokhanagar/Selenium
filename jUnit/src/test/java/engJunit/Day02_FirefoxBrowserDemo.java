package engJunit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02_FirefoxBrowserDemo {
//    Create a new class under : FirefoxBrowserDemo
//    Create main method

    public static void main(String[] args) {
//    Set Path
        WebDriverManager.firefoxdriver().setup();

//    Create gecko driver
        WebDriver driver = new FirefoxDriver();

//    Open google home page https://www.google.com/
        driver.get("https://www.google.com/ ");

//    Maximize the window
        driver.manage().window().maximize();

//    Close/Quit the browser
        driver.quit();
    }


}
