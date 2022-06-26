package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.utilities.Driver;

import java.util.List;

public class AmazonPage {

    public AmazonPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    public WebElement allHamburgerMenu;

    @FindBy(xpath = "(//a[@class='hmenu-item'])[2]")
    public WebElement kindleEreadersBooksElementi;


    @FindBy(xpath = "//a[@href='/dp/B07NQKJVKR?ref_=nav_em__k_ods_eink_kke_0_2_3_2']")
    public WebElement kindleKidsElementi;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> satirSayisi;
    @FindBy(xpath = "//tbody//tr[1]//td")
    public List<WebElement> sutunSayisi;
    @FindBy(xpath = "//tbody//tr[3]//td[2]")
    public WebElement satirSutun;
    @FindBy(xpath = "//tbody//tr//td")
    public List<WebElement> hucreler;


    public static void enAltaGit() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
    }


}
