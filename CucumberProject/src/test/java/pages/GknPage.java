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

    @FindBy(xpath = "//tbody//tr[1]//td")
    public List<WebElement> satirUzunlugu;

    @FindBy(xpath = "//textarea[@id=\"appointment-prescription\"]")
    public WebElement prescription;

    @FindBy(xpath = "//textarea[@id=\"appointment-description\"]")
    public WebElement description;

    @FindBy(xpath= "//li[@id='admin-menu']")
    public WebElement administrationButton;

    @FindBy(xpath="//a[@href='/admin/user-management']")
    public WebElement userManagementButton;

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement accountMenu;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement secondSignIn;

    @FindBy(xpath="(//a[@class='dropdown-item'])[2]")
    public WebElement registerButton;

    @FindBy(xpath = "//*[text()='Registration']")
    public WebElement registrationText;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssnBox;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement newPasswordBox;

    @FindBy(xpath = "//input[@id='secondPassword']")
    public WebElement newPasswordConfirmationBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement finalRegisterButton;

    @FindBy(xpath = "//a[@href=\"/login\"]")
    public WebElement signInButton;

    @FindBy(xpath="//li[@id='entity-menu']")
    public WebElement itemsTitlesButton;

    @FindBy(xpath = "//a[@href='/staff'][1]")
    public WebElement staffButton;

    @FindBy(id = "jh-create-entity")
    public WebElement createANewStaffButton;

    @FindBy(xpath = "//h2[.='Create or edit a Staff']")
    public WebElement createOrEditaStaffText;

    @FindBy(id = "searchSSN")
    public WebElement staffSsnInput;

    @FindBy(id = "useSSNSearch")
    public WebElement useSearchSsnCheckbox;

    @FindBy(xpath = "//button[text()='Search User']")
    public WebElement ssnSearchUserButton;

    @FindBy(xpath="//input[@id='staff-phone']")
    public WebElement phoneBox;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButtonStaff;

    @FindBy(xpath="//thead//th[1]")
    public WebElement id;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[1]")
    public WebElement viewButonu;

    @FindBy(xpath = "(//dl[@class='jh-entity-details']//dd)[1]")
    public WebElement userName;

    @FindBy(xpath = "(//dl[@class='jh-entity-details']//dd)[2]")
    public WebElement userFirstName;

    @FindBy(xpath = "(//dl[@class='jh-entity-details']//dd)[3]")
    public WebElement userLastName;

    @FindBy(xpath = "(//dl[@class='jh-entity-details']//dd)[4]")
    public WebElement userEmail;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement editCheckBox;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement editButtonUMP;

    @FindBy (xpath = "//select[@id=\"authorities\"]")
    public WebElement profilesMenu;

    @FindBy(xpath="//button[@class='btn btn-primary']")
    public WebElement saveButtonUMP;

    @FindBy(xpath="(//span[@class='badge badge-info'])[1]")
    public WebElement userProfilePatient;

    @FindBy(xpath="(//span[@class='badge badge-info'])[2]")
    public WebElement userProfilePhysician;

    @FindBy(xpath="(//span[@class='badge badge-info'])[3]")
    public WebElement userProfileUser;

    @FindBy(xpath="(//span[@class='badge badge-info'])[4]")
    public WebElement userProfileStaff;

    @FindBy(xpath="(//span[@class='badge badge-info'])[5]")
    public WebElement userProfileAdmin;

    @FindBy(xpath="(//a[@class='btn btn-danger btn-sm'])[1]")
    public WebElement deleteButtonUMP;

    @FindBy(xpath="(//button[@type='button'])[24]")
    public WebElement deleteConfirmButtonUMP;





}
