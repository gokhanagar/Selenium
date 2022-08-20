package engJunit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_GetPageSource {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        Navigate to amazon homepage
        driver.get("https://www.amazon.com");

//        Test if amazon contains “Registry” on the homepage

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        if (pageSource.contains("Registry")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.quit();

    }
}
