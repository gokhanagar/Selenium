package engJunit;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Day08_FileExist {

    @Test
    public void isExistTest(){
//        Pick a file on your desktop
//        My file: logo.jpeg on the desktop
//        I will check if the file exist
        String homeDirectory = System.getProperty("user.home");
        System.out.println(homeDirectory);
//        WINDOWS EXAMPLE : C:\Users\Acer
//        MAC EXAMPLE : /Users/Lenovo

//     Path of the image
        String pathOfFile = homeDirectory+"/Desktop/logo.jpeg";
//        String pathOfFile = homeDirectory+"\\Desktop\\logo.jpeg";   //Windows

        System.out.println(pathOfFile);///Users/techproed/Desktop/logo.jpeg

//        And verify if that file exist on your computer or not
        boolean isFileExist = Files.exists(Paths.get(pathOfFile));
        Assert.assertTrue(isFileExist);//Pass is exist, Fail is not exist

    }

    @Test
    public void secondWay(){
        String filePath ="/Users/techproed/Desktop/logo.jpeg";
//        Is there is a file whose name is logo.jpeg on Desktop, then this pass; or else this fails
        boolean isFileExist = Files.exists(Paths.get(filePath));
        Assert.assertTrue(isFileExist);
    }
}
