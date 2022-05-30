package day14_excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.IOException;

public class C02_ReadExcel extends TestBase {


    public void readExcel() throws IOException {


        //7. Dosya yolunu bir String degiskene atayalim
        String dosyaYolu = "src/test/resources/ulkeler.xlsx";

        //8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis = new FileInputStream(dosyaYolu);

        //9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        Workbook workbook = WorkbookFactory.create(fis);

        //10. WorkbookFactory.create(fileInputStream)


        //11. Worksheet objesi olusturun workbook.getSheetAt(index)


        //12. Row objesi olusturun sheet.getRow(index)


        //13. Cell objesi olusturun row.getCell(index)
        String actualData = workbook.getSheet("Sayfa1").
                getRow(3).getCell(3).toString();


    }


}
