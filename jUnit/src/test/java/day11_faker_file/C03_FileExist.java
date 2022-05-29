package day11_faker_file;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_FileExist extends TestBase {

    @Test
    public void test01() {

        System.out.println(System.getProperty("user.dir"));
        //bana icinde oldugum projenin dosya yolunu(path) verir

        System.out.println(System.getProperty("user.home"));
        //C:\Users\gokha yani benim bilgisayarimin bana ozel kismini verdi
        //C:\Users\gokha\IdeaProjects\com.Batch59jUnit\src\test\java\day05_jUnit
        //"C:\Users\gokha\OneDrive\Desktop\text.txt"

        String dosyaYolu = System.getProperty("user.home") + "\\OneDrive\\Desktop\\text.txt";
        System.out.println(dosyaYolu);

        /*
        Bilgisayarimizdaki bir dosyanin varligini test etmek icin once o dosyaya ulasmamis gerekir
        Java'da dosyaya erisim icin dosya yoluna (path) ihtiyac vardir
        Her bilgisayarin kullanici adi farli olacagindan masaustu dosya yolu da birbirinden farkli olacaktir
        Testlerimizin tum bilgisayarlarda calismasi icin dosya yolunu DINAMIK yapmak zorundayiz

        Bunun icin her bilgisayarim birbirinden farkli olan yolunu bulmak icin
        */
        String farkliKisim = System.getProperty("user.home");

        // herkesin bilgisayarinda ortak olan kisim ise
        String ortakKisim = "\\OneDrive\\Desktop\\text.txt";

        String masaUstuDosyaYolu = farkliKisim + ortakKisim;
        System.out.println(masaUstuDosyaYolu);
        System.out.println(Files.exists(Paths.get(masaUstuDosyaYolu)));

        Assert.assertTrue(Files.exists(Paths.get(masaUstuDosyaYolu)));


    }


}
