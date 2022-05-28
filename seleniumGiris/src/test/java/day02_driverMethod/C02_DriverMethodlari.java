package day02_driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/recources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        System.out.println("actual title : " + driver.getTitle());
        System.out.println("actual url : " + driver.getCurrentUrl());

        driver.close();

    }
}
