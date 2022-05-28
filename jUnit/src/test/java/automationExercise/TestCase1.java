package automationExercise;

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

public class TestCase1 {
    //1. Launch browser
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test() {
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("https://www.automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//html[@lang='en']"));
        Assert.assertTrue(homePage.isDisplayed());

        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();

        //5. Verify 'New User Signup!' is visible
        WebElement newUserSignup = driver.findElement(By.xpath("//*[text()='New User Signup!']"));
        Assert.assertTrue(newUserSignup.isDisplayed());

        //6. Enter name and email address
        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("gokhanagar");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("gokhanagar5@gmail.com");

        //7. Click 'Signup' button
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement eAI = driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        Assert.assertTrue(eAI.isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("//input[@type='radio']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");

        WebElement dayDDM = driver.findElement(By.xpath("//select[@data-qa='days']"));
        Select opt1 = new Select(dayDDM);
        opt1.selectByVisibleText("25");

        WebElement monthDDM = driver.findElement(By.xpath("//select[@data-qa='months']"));
        Select opt2 = new Select(monthDDM);
        opt2.selectByVisibleText("August");

        WebElement yearDDM = driver.findElement(By.xpath("//select[@data-qa='years']"));
        Select opt3 = new Select(yearDDM);
        opt3.selectByVisibleText("1991");

        //10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("//input[@type='checkbox']"));

        //11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        driver.findElement(By.xpath("//input[@data-qa='first_name']")).sendKeys("gokhan");
        driver.findElement(By.xpath("//input[@data-qa='last_name']")).sendKeys("agar");
        driver.findElement(By.xpath("//input[@data-qa='company']")).sendKeys("wallstreet");
        driver.findElement(By.xpath("//input[@data-qa='address']")).sendKeys("turkey");
        driver.findElement(By.xpath("//input[@data-qa='address2']")).sendKeys("turkey");

        WebElement countryDDM = driver.findElement(By.xpath("//select[@data-qa='country']"));
        Select opt4 = new Select(countryDDM);
        opt4.selectByVisibleText("Singapore");

        driver.findElement(By.xpath("//input[@data-qa='state']")).sendKeys("Sentosa");
        driver.findElement(By.xpath("//input[@data-qa='city']")).sendKeys("Sentosa");
        driver.findElement(By.xpath("//input[@data-qa='zipcode']")).sendKeys("684965");
        driver.findElement(By.xpath("//input[@data-qa='mobile_number']")).sendKeys("05459632475");

        //13. Click 'Create Account button'
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        WebElement accountCreated = driver.findElement(By.xpath("//*[text()='Account Created!']"));
        Assert.assertTrue(accountCreated.isDisplayed());

        //15. Click 'Continue' button
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();

        //16. Verify that 'Logged in as username' is visible
        WebElement loggedInAsUsername = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[9]/a"));
        Assert.assertTrue(loggedInAsUsername.isDisplayed());

        //17. Click 'Delete Account' button
        driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();


    }


}
