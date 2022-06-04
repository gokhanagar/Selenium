package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.day22_crossBrowser.utilities.Driver;

public class WebDriverUniversityPage {


    public WebDriverUniversityPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//*[text()='CLICK ME!'])[4]")
    public WebElement clickMeOfJSConfirmBox;

    @FindBy(xpath = "//p[@id='confirm-alert-text']")
    public WebElement jsConfirmBoxAlertCancelledText;

    @FindBy(xpath = "(//*[text()='CLICK ME!'])[1]")
    public WebElement clickMeOfJSAlertBox;


}
