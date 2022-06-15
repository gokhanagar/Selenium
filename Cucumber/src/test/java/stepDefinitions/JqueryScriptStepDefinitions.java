package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.JqueryScriptPage;
import utilities.Driver;

public class JqueryScriptStepDefinitions {


    JqueryScriptPage jsPage = new JqueryScriptPage();

    @Then("tum ikinci emoji ogelerini tikla")
    public void tum_ikinci_emoji_ogelerini_tikla() {

        WebElement iframe = Driver.getDriver().findElement(By.xpath("//iframe[@id='emoojis']"));
        Driver.getDriver().switchTo().frame(iframe);

        jsPage.ikinciEmoji.click();
        for (int i = 0; i < jsPage.emojiler.size(); i++) {
            jsPage.emojiler.get(i).click();
        }

    }

    @Then("ana iframe'e geri don")
    public void ana_iframe_e_geri_don() {
        Driver.getDriver().switchTo().parentFrame();

    }

    @Then("formu doldur ve ugula butonuna tikla")
    public void formu_doldur_ve_ugula_butonuna_tikla() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        actions.click(jsPage.text).sendKeys("merhaba")
                .sendKeys(Keys.TAB)
                .sendKeys("2")

                .sendKeys(Keys.TAB)
                .sendKeys(":)")

                .sendKeys(Keys.TAB)
                .sendKeys("bilmiyorum")

                .sendKeys(Keys.TAB)
                .sendKeys("selcuk")

                .sendKeys(Keys.TAB)
                .sendKeys("yeryuzu")

                .sendKeys(Keys.TAB)
                .sendKeys("aksam")

                .sendKeys(Keys.TAB)
                .sendKeys("sabah")

                .sendKeys(Keys.TAB)
                .sendKeys("ogle")
                .sendKeys(Keys.TAB)
                .sendKeys("gece")

                .sendKeys(Keys.TAB)
                .sendKeys(":)")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE).perform();
    }




}
