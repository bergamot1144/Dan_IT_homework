package aqa_hw_12.step_definitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/GoToOfficialBrandWebsite.feature",
        glue = "aqa_hw_12/step_definitions"

)
public class CucumberRunner {

}
