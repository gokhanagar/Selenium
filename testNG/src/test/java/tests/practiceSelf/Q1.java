package tests.practiceSelf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoqaPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

import java.util.List;


public class Q1 {

    @Test
    public void test() {
        DemoqaPage demoqaPage = new DemoqaPage();

        // 1.  https://demoqa.com/  adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));

        // 2.  'Elements' i tiklayin
        demoqaPage.elementsBolumu.click();

        // 3.  Sol tarafta 'Elements' cubugunun goruntulendigini dogrulayin
        Assert.assertTrue(demoqaPage.elementsMenusu.isDisplayed());

        // 4.  'Web Tables' kısmını tiklayin
        demoqaPage.webTablesButton.click();

        // 5.  Web Tables sayfasinin acildigini ve table body'sinin gorunur oldugunu dogrulayin
        Assert.assertTrue(demoqaPage.webTableSayfasi.isDisplayed());
        Assert.assertTrue(demoqaPage.tableBody.isDisplayed());

        // 6.  Table'da kac data (cell) oldugunu konsolda yazdırın.
        System.out.println(demoqaPage.tableCellList.size());

        // 7.  Table’daki başlıkları konsolda yazdırın.
        for (WebElement each : demoqaPage.tableHeaderList) {
            System.out.println(each.getText());
        }

        // 8.  Table'da kac satir oldugunu  konsolda yazdırın.
        System.out.println(demoqaPage.tableRowList.size());

        // 9.  Table'da bulunan satirlari konsolda yazdırın.
        for (WebElement each : demoqaPage.tableRowList) {
            System.out.println(each.getText());
        }

        // 10. Table'da kac sutun oldugunu  konsolda yazdırın.
        System.out.println(demoqaPage.tableHeaderList.size());

        // 11. Ikinci sutundaki tum elementleri konsolda yazdırın.
        List<WebElement> ikinciSutunElementler = Driver.getDriver().findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-td'][2]"));
        for (WebElement each : ikinciSutunElementler) {
            System.out.println(each.getText());
        }
        // 12. Department basligindaki tum elementleri(sutun) konsolda yazdırın.
        int departmentNum = 0;
        for (int i = 0; i < demoqaPage.tableHeaderList.size(); i++) {
            if (demoqaPage.tableHeaderList.get(i).getText().equals("Department")) {
                departmentNum = i;
            }
        }
        List<WebElement> departmentElementList = Driver.getDriver().findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-td'][" + (departmentNum + 1) + "]"));
        for (WebElement each : departmentElementList) {
            System.out.println(each.getText());
        }
        // 13. Tabloda "Age" i 45 olan kisinin First Name'ini yazdirin
        int firstNameNum = 0;
        for (int i = 0; i < demoqaPage.tableHeaderList.size(); i++) {
            if (demoqaPage.tableHeaderList.get(i).getText().equals("First Name")) {
                firstNameNum = i;
            }
        }
        int ageNum = 0;
        for (int i = 0; i < demoqaPage.tableHeaderList.size(); i++) {
            if (demoqaPage.tableHeaderList.get(i).getText().equals("Age")) {
                ageNum = i;
            }
        }

        List<WebElement> ageElementList = Driver.getDriver().findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-td'][" + (ageNum + 1) + "]"));
        int rowNum = 0;
        for (int i = 0; i < ageElementList.size(); i++) {
            if (ageElementList.get(i).getText().equals("45")) {
                rowNum = i;
            }
        }

        WebElement nameAge45 = Driver.getDriver().findElement(By.xpath("//div[@class='rt-tr-group'][" + (rowNum + 1) + "]//div[@class='rt-td'][" + (firstNameNum + 1) + "]"));
        System.out.println(nameAge45.getText());


        Driver.closeDriver();


    }


}