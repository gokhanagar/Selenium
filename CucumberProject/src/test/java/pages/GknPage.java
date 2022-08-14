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

    @FindBy(xpath ="//li[@id='entity-menu']")
    public WebElement myPages;

    @FindBy(xpath="(//a[@class='dropdown-item'])[1]")
    public WebElement myAppointments;

    @FindBy(xpath="//a[@href='/appointment-update/171188']")
    public WebElement editButton;

    @FindBy(xpath = "//h2[@id=\"appointment-heading\"]")
    public WebElement myAppointmentsYazisi;

    @FindBy(xpath = "//input[@id='fromDate']")
    public WebElement fromDate;

    @FindBy(xpath = "//input[@id='toDate']")
    public WebElement toDate;





















}
