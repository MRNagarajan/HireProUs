package runnerfiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"Features/hirepros_CommonLogin.feature", "Features/hirepros_Configurations.feature", "Features/hirepros_NewServices.feature", "Features/hirepros_Recruitment.feature"}, glue = {"Hireprostepdef"}, plugin = {
"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },tags="@SmokeTest")

//"src/test/resources/featurefile/hirepros_Configurations.feature"


public class runner {

}
@RunWith(Cucumber.class)

 

