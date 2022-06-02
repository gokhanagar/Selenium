package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SauceDemoPage {

    public SauceDemoPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "user-name")
    public WebElement userNameElementi;

    @FindBy(xpath = "(//input[@class='input_error form_input'])[2]")
    public WebElement passwordElementi;

    @FindBy(xpath = "//input[@class='submit-button btn_action']")
    public WebElement loginButton;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement ddmNameAToZ;


}
