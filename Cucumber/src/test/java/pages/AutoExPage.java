package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExPage {
    public AutoExPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement newUserSignupTextElement;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement newUserSignupNameBox;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement newUserSignupEmailBox;

    @FindBy(xpath = "//button[text()='Signup']")
    public WebElement signupButton;

    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement enterAccountInfoTextElement;

    @FindBy(xpath = "//input[@value='Mr']")
    public WebElement acountInfoMrRadioButton;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement acountCreatedTextBox;

    @FindBy(xpath = "//a[text()='Continue']")
    public WebElement acountCreatedContinueButton;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement userNameElement;

    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteAccountElement;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginYourAccountEmailBox;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginYourAccountPasswordBox;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//h2[.='Login to your account']")
    public WebElement loginYourAccountTextBox;

    @FindBy(xpath = "//p[.='Your email or password is incorrect!']")
    public WebElement emailOrPasswordIncorrectText;

    @FindBy(xpath = "//a[.=' Logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//p[.='Email Address already exist!']")
    public WebElement emailAdressExistTextElement;




}
