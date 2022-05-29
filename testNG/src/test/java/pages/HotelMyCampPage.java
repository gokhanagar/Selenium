package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class HotelMyCampPage {

    public HotelMyCampPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement loginKutusu;

    @FindBy(id="UserName")
    public WebElement userNameTexti;

    @FindBy(id ="Password")
    public WebElement passwordTexti;

    @FindBy(xpath="//span[@class='username username-hide-on-mobile']")
    public WebElement userNameAfterLogin;

    @FindBy(xpath="//a[@href='/Admin/Account/Logoff']")
    public WebElement logOutButton;

    @FindBy(id = "divMessageResult")
    public WebElement girisYapilamadiElementi;




}
