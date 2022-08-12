package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GknPage {
    public GknPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='appointment-id']")
    public WebElement idDoctorEditPage;

    @FindBy(xpath = "(//input[@placeholder='YYYY-MM-DD HH:mm'])[1]")
    public WebElement startDateEditPage;

    @FindBy(xpath = "(//input[@placeholder='YYYY-MM-DD HH:mm'])[2]")
    public WebElement endDateEditPage;











//input[@type='text']










}
