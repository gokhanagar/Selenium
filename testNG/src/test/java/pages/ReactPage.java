package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.day22_crossBrowser.utilities.Driver;

import java.util.List;

public class ReactPage {

    public ReactPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//p[@class = 'sc-124al1g-4 eeXMBo']")
    public List<WebElement> urunlerIsimListesi;

    @FindBy(xpath= "//p[@class='sc-124al1g-6 ljgnQL']")
    public List<WebElement> urunFiyatListesi;



















}
