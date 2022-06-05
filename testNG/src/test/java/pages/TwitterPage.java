package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.utilities.Driver;

public class TwitterPage {

    public TwitterPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@dir='auto'])[5]")
    public WebElement signUpWithPhoneOrEmailButton;

    @FindBy(xpath = "//input[@autocapitalize='sentences']")
    public WebElement nameElementi;

    @FindBy(xpath = "//input[@name='phone_number']")
    public WebElement phoneNumberElementi;

    @FindBy(xpath = "(//select[@aria-invalid='false'])[1]")
    public WebElement monthDDM;

    @FindBy(xpath = "(//select[@aria-invalid='false'])[2]")
    public WebElement dayDDM;

    @FindBy(xpath = "(//select[@aria-invalid='false'])[3]")
    public WebElement yearDDM;

    @FindBy(xpath = "(//div[@dir='auto'])[10]")
    public WebElement nextButton;



















}
