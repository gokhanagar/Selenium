package tests.practice;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class DosyaOkuma {

    public static void excelOkuma(String sheetName, int row, int cell, String expectedData) throws IOException {

        String folderPath = System.getProperty("user.home") + "\\Downloads";

        File folder = new File(folderPath);

        File [] files = folder.listFiles();

        Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());

        System.out.println(files[0]);

        boolean isExist = Files.exists(Paths.get(files[0].toURI()));

        Assert.assertTrue(isExist);

        FileInputStream fis = new FileInputStream(Paths.get(files[0].toURI()).toFile());

        Workbook workbook = WorkbookFactory.create(fis);

        String actualData = workbook.getSheet(sheetName).getRow(row).getCell(cell).toString();

        System.out.println(actualData);

        Assert.assertEquals(actualData,expectedData);

        fis.close();

        Files.deleteIfExists(Paths.get(files[0].toURI()));


    }


}
