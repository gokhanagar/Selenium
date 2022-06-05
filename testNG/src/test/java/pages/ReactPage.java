package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.utilities.Driver;

import java.util.List;

public class ReactPage {

    public ReactPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//p[@class='sc-124al1g-4 eeXMBo']")
    public List<WebElement> urunlerIsim;

    @FindBy(xpath = "//p[@class='sc-124al1g-6 ljgnQL']")
    public List<WebElement> urunFiyat;

    @FindBy(xpath = "//button[@class='sc-124al1g-0 jCsgpZ'][normalize-space()='Add to cart']")
    public List<WebElement> Addtocart;

    @FindBy(xpath = "//span[normalize-space()='X']")
    public WebElement sepetiKapat;

    @FindBy(xpath = "//div[@class='sc-1h98xa9-2 fGgnoG']")
    public WebElement sepetimButton;

    @FindBy(xpath = "//p[@class='sc-1h98xa9-9 jzywDV']")
    public WebElement subTotal;

    @FindBy(xpath = "//button[normalize-space()='Checkout']")
    public WebElement Checkout;


}
