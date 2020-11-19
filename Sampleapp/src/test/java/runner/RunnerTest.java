package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



/* 
 @RunWith(Cucumber.class)
 @CucumberOptions(features = {"src/test/resources/com/automatedtest/Home_page.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/home-page-html"},
        glue = {"com.automatedtest.homepage"}) 
 
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/CadastroAuto.feature"},
		 strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/CadastroAuto.json",
        "html:target/CadastroAuto-html"},
        glue = {"stepFiles"})

public class RunnerTest {
	
	

}
