package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "Feature" // locates the .feature files in the Feature folder
 ,glue={"stepDefiniton"} // locates the step definiton file.
 ,dryRun=false // this will make sure that all steps in the feature file has matching step definition methods when set to True.
,monochrome=true // this will make the console readable
,plugin= {"pretty", "json:./Test_Results/Results.json", "junit:./Test_Results/Results.xml", "html:./Test_Results/Results.html"}
 ,tags= "@CovidAlert" // Or selects both tags and 'and not' skips particular tags

 )

public class TestRunner {

	

}
