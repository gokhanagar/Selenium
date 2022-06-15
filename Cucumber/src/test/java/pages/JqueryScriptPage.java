package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class JqueryScriptPage {
    public JqueryScriptPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class=\"mdl-tabs__ripple-container mdl-js-ripple-effect\"])[2]")
    public WebElement ikinciEmoji;

    @FindBy(xpath = "//div[@id=\"nature\"]//img[@class=\"emoji\"]")
    public List<WebElement> emojiler;

    @FindBy(xpath = "//input[@id=\"text\"]")
    public WebElement text;
}
