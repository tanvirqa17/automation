import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:Folder_Name",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml"},
        features = "src/test/resources/features",
        glue = {"stepDefinations"},
        tags = "@TestFeature")

public class RunCukes {
    // This class will be empty
}
