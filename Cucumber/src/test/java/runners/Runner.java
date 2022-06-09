package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@heroku",
        dryRun = false
)

public class Runner {
    /* bir framework'de bir tek Runner class;i yeterli olabilir
        Runner class'inda class body'sinde hic bir sey olmaz
        Runner class'imizi onemli yapan 2 adet annotation vardir
        @RunWith(Cucumber.class) annotation Runner class'ina calisma ozelligi katar
        Bu annotation oldugu icin Cucumber framework 'umuzde Junit kullanmayi tercih ediyoruz

        features : Runner dosyasinin feature dosyalarini nereden bulacagini tarif eder
        glue : step definitions dosyalarini nerede bulacagimizi gosterir
        tags : o an hangi tag'i calistirmak istiyorsak onu belli eder

        dryRun : iki secenek var
        dryRun = true; yazdigimizda testimizi calistirmadan sadece eksik adimlari bize verir
        dryRun = false: yazdigimizda testimizi
     */
}
