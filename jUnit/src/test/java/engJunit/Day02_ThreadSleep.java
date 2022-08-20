package engJunit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_ThreadSleep {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
//        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//WIN
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        //WAIT FOR 5 SECOND=5000 MILLISECOND
        Thread.sleep(5000);

        driver.get("https://www.amazon.com/");

        //WAIT FOR 10 SECONDS
        Thread.sleep(10000);

        driver.quit();

        /*
         * Thread.sleep is a JAVA WAIT
         * It is not coming from selenium
         * It is a HARD WAIT
         * It means driver will wait for 5 seconds no matter what.
         * If driver do not need any wait, it will still wait exactly 5 seconds
         * Testers should avoid using Thread.sleep cause it puts unnecesary waits
         *
         * This wait throws acception so add exception to method signature or use try catch
         * */


    }

}
