package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href=\"/home\"]")
    public WebElement homeButton;

    @FindBy(xpath = "//li[@id=\"account-menu\"]")
    public WebElement accountMenu;

    @FindBy(xpath = "//a[@href=\"/login\"]")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@name=\"username\"]")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement signInButton2;

}