package tests.new_practice.practice04;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P07_WriteExcel {
    //Data isimli excel dosyasına yeni kullanıcı adı ve password ekliyelim
    String dosyaYolu ="C:\\Users\\Lenovo\\OneDrive\\Masaüstü\\data.xlsx";
    FileInputStream fis;
    Workbook workbook;
    FileOutputStream fos;
    @Test
    public void test01() throws IOException {
        fis = new FileInputStream(dosyaYolu);
        workbook = WorkbookFactory.create(fis);
        workbook.getSheet("Sayfa1").createRow(3).createCell(0).setCellValue("2. Kullanıcı Bilgileri");
        workbook.getSheet("Sayfa1").createRow(4).createCell(0).setCellValue("email");
        workbook.getSheet("Sayfa1").createRow(5).createCell(0).setCellValue("password");
        workbook.getSheet("Sayfa1").getRow(4).createCell(1).setCellValue("abc@gmail.com");
        workbook.getSheet("Sayfa1").getRow(5).createCell(1).setCellValue("abcabc");
        fos = new FileOutputStream(dosyaYolu);
        workbook.write(fos);
    }

    @Test
    public void test02() throws IOException {
        fis = new FileInputStream(dosyaYolu);
        workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet("Sayfa1");
        Row row = sheet.getRow(3);
        Cell cell = row.getCell(0);
        row.removeCell(cell);
        fos = new FileOutputStream(dosyaYolu);
        workbook.write(fos);
    }
}
