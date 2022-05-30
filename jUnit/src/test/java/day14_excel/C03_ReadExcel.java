package day14_excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.IOException;

public class C03_ReadExcel extends TestBase {

    @Test
    public void readExcelTesti() throws IOException {

        //input olarak verilen
        //satirNo, sutunNo, degerlerini parametre olarak alip
        // O cell'deki datayi String olarak bana donduren bir method olusturun.

        int satirNo = 4;
        int sutunNo = 4;

        //donen String'in Cezayir oldugunu test edin
        String expectedData = "Cezayir";

        String actualData = banaDataGetir(satirNo - 1, sutunNo - 1); //cunku excel index ile calisir
        Assert.assertEquals(expectedData, actualData);


    }

    public static String banaDataGetir(int satirIndex, int sutunIndex) throws IOException {

        String istenenData = "";
        String dosyaYolu = "src/test/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        istenenData = workbook.getSheet("Sayfa1").
                getRow(satirIndex).getCell(sutunIndex).toString();

        return istenenData;

    }


}
