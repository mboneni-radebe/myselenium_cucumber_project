package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        
		features = "src/test/resources/Features", //location of feature file
		glue = {"stepdef"},
        plugin = { "pretty","html:target/cucumber-reports.html"},
		tags  ="@datadriven"
		
      
        
        
)
public class TestRunner extends AbstractTestNGCucumberTests{

}
