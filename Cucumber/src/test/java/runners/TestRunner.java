package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@pr1",
        dryRun = false
)

public class TestRunner {
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
