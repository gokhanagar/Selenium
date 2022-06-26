package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.utilities.Driver;

import java.util.List;

public class GittiGidiyorPage {
    public GittiGidiyorPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@placeholder='Keşfetmeye Bak']")
    public WebElement aramaKutusu;
    @FindBy(xpath = "//span[contains(text(),'Kapat')]")
    public WebElement cookies;
    @FindBy(xpath = "//div[@class='pmyvb0-0 jCCkZh']//li")
    public List<WebElement> urunlerList;
    @FindBy(xpath = "//span[@id='sp-price-highPrice']")
    public WebElement urunfiyat;
    @FindBy(xpath = "//button[@id='add-to-basket']")
    public WebElement sepeteEkle;
    @FindBy(xpath = "//a[normalize-space()='Sepete Git']")
    public WebElement sepetegit;
    @FindBy(xpath = "//div[@class='total-price-box']")
    public WebElement sepettekiFiyat;
    @FindBy(xpath = "((//select[@class='amount'])[1]//option)[2]")
    public WebElement  urunadedi;
    @FindBy(xpath = "//i[@class='gg-icon gg-icon-bin-medium']")
    public WebElement urundelete;
    @FindBy(xpath = "//h2[contains(text(),'Sepetinizde ürün bulunmamaktadır.')]")
    public WebElement bosSepet;
    @FindBy(xpath = "//a[@title='2. sayfa']")
    public WebElement ikincisayfa;
}
