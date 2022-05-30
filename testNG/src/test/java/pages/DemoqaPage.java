package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoqaPage {


    public DemoqaPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div[@class='card-up']")
    public WebElement elementsBolumu;

    @FindBy(xpath = "//div[@class='element-group']")
    public WebElement elementsMenusu;

    @FindBy(xpath = "//*[text()='Web Tables']")
    public WebElement webTablesButton;

    @FindBy(xpath = "//div[@class='container playgound-body']")
    public WebElement webTableSayfasi;

    @FindBy(xpath = "//div[@class='rt-tbody']")
    public WebElement tableBody;

    @FindBy(xpath = "//div[@class='rt-td']")
    public List<WebElement> tableCellList;

    @FindBy(xpath = "//div[@role='columnheader']")
    public List<WebElement> tableHeaderList;

    @FindBy(xpath = "//div[@class='rt-tr-group']")
    public List<WebElement> tableRowList;


}
