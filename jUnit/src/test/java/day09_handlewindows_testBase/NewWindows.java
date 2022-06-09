package day09_handlewindows_testBase;

import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class NewWindows extends TestBase {

    //        Open google on window 1
    //        Open amazon on window 2
    //        Open linkedin on window 3
    //        Switch between windows
    //        Switch to amazon
    //        Switch to google
    //        Switch back to linkedin

    @Test
    public void newWindow() throws InterruptedException {
        //        Open google on window 1
        driver.get("https://www.google.com");
        System.out.println("Google Title: " + driver.getTitle());
        String googleWindowHandle = driver.getWindowHandle();

        //        Open amazon on window 2
        driver.switchTo().newWindow(WindowType.WINDOW); //creates a new window and switches to that window
        driver.get("https://www.amazon.com");//opens amazon in the 2nd page
        System.out.println("Amazon Title: " + driver.getTitle());
        String amazonWindowHandle = driver.getWindowHandle();


        //        Open linkedin on window 3
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        System.out.println("LinkedIn Title: " + driver.getTitle());
        String linkedInWindowHandle = driver.getWindowHandle();

        //        Switch between windows
        //        Switch to amazon
        Thread.sleep(5000);
        driver.switchTo().window(amazonWindowHandle);
        //        Switch to google
        Thread.sleep(5000);
        driver.switchTo().window(googleWindowHandle);
        //        Switch back to linkedin
        Thread.sleep(5000);
        driver.switchTo().window(linkedInWindowHandle);

    }
}
