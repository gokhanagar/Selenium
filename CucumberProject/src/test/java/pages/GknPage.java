package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GknPage {
    public GknPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//li[@id='entity-menu']")
    public WebElement myPages;

    @FindBy(xpath="(//a[@class='dropdown-item'])[1]")
    public WebElement myAppointments;

    @FindBy(xpath="//a[@href='/appointment-update/169761']")
    public WebElement editButton;

    @FindBy(xpath = "//h2[@id=\"appointment-heading\"]")
    public WebElement myAppointmentsYazisi;

    @FindBy(xpath = "//input[@id='fromDate']")
    public WebElement fromDate;

    @FindBy(xpath = "//input[@id='toDate']")
    public WebElement toDate;

    @FindBy(xpath = "//span[text()='Create or Edit an Appointment']")
    public WebElement createOrEditAnAppointment;

    @FindBy(xpath = "//select[@id=\"appointment-status\"]")
    public WebElement status;

    @FindBy(xpath = "//textarea[@id=\"appointment-anamnesis\"]")
    public WebElement anamnesis;

    @FindBy(xpath = "//textarea[@id=\"appointment-treatment\"]")
    public WebElement treatment;

    @FindBy(xpath = "//textarea[@id=\"appointment-diagnosis\"]")
    public WebElement diagnosis;

    @FindBy(xpath = "//button[@id=\"save-entity\"]")
    public WebElement save;

    @FindBy(xpath = "//tbody//tr[1]//td")
    public List<WebElement> ilkHasta;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement anamnesisError;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[2]")
    public WebElement treatmentError;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[3]")
    public WebElement diagnosisError;

    @FindBy(xpath = "//table//thead//th")
    public List<WebElement> baslikBilgileri;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> hastaBilgileri;

    @FindBy(xpath = "//tbody//tr//td")
    public List<WebElement> tumBilgilerSutun;

    @FindBy(xpath = "//tbody//td[1]")
    public List<WebElement> sutunUzunlugu;

    @FindBy(xpath = "//textarea[@id=\"appointment-prescription\"]")
    public WebElement prescription;

    @FindBy(xpath = "//textarea[@id=\"appointment-description\"]")
    public WebElement description;





















}
