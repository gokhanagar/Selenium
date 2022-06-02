package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DhtmlGoodiesPage {

    public DhtmlGoodiesPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='box6']")
    public WebElement romeDragElementi;

    @FindBy(xpath = "//div[@id='box1']")
    public WebElement osloDragElementi;

    @FindBy(xpath = "//div[@id='box7']")
    public WebElement madridDragElementi;

    @FindBy(xpath = "//div[@id='box5']")
    public WebElement seoulDragElementi;

    @FindBy(xpath = "//div[@id='box4']")
    public WebElement copenhagenDragElementi;

    @FindBy(xpath = "//div[@id='box3']")
    public WebElement washingtonDragElementi;

    @FindBy(xpath = "//div[@id='box2']")
    public WebElement stockholmDragElementi;

    @FindBy(xpath = "//div[@id='box106']")
    public WebElement italyDropElementi;

    @FindBy(xpath = "//div[@id='box107']")
    public WebElement spainDropElementi;

    @FindBy(xpath = "//div[@id='box101']")
    public WebElement norwayDropElementi;

    @FindBy(xpath = "//div[@id='box104']")
    public WebElement denmarkDropElementi;

    @FindBy(xpath = "//div[@id='box105']")
    public WebElement southKoreaDropElementi;

    @FindBy(xpath = "//div[@id='box102']")
    public WebElement swedenDropElementi;

    @FindBy(xpath = "//div[@id='box103']")
    public WebElement unitedStatesDropElementi;


}
