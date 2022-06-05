package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.utilities.Driver;

public class N11Page {

    public N11Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='dn-slide-deny-btn']")
    public WebElement closeCookie;

    @FindBy(xpath = "//span[@title='Mağazalar']")
    public WebElement magazalarElementi;

    @FindBy(xpath = "//a[@class = 'active']")
    public WebElement magazalariGorElementi;

    @FindBy(xpath = "(//*[text()='Tüm Mağazalar'])[1]")
    public WebElement tumMagazalarElementi;


}
