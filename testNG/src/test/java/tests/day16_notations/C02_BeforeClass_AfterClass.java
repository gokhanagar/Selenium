package tests.day16_notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.utilities.TestBase;

public class C02_BeforeClass_AfterClass extends TestBase {
    //Junit'te @BeforeClass ve @AfterClass notasyonuna sahip method lar static olmak zorundaydi.
    //TestNG bu zorunluluktan bizi kurtariyor

    /*
    TestNG bize daha fazla before ve after notasyonlari sunar diger before/after
    notasyonlari tanimlayacagimiz grup, test veya suit'den once ve sonra calisirlar
    ileride xml dosyalari ile birlikte bunu gorecegiz
     */

    @BeforeClass
    public void beforeClassMethod() {
        System.out.println("Before Class");

    }

    @AfterClass
    public void afterClassMethod() {
        System.out.println("After Class");

    }


    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void test02() {
        driver.get("http://www.bestbuy.com");
    }

    @Test
    public void techproedTesti() {
        driver.get("http://www.techproeducation.com");
    }


}
