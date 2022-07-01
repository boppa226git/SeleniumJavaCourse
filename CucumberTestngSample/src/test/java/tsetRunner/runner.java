package tsetRunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
//@CucumberOptions(tags = "", features=".//Features/Job2.feature",
@CucumberOptions(tags = "", features=".//Features/",
 glue = "stepDefinitions")
 
public class runner extends AbstractTestNGCucumberTests {
 
}




/*

@RunWith(Cucumber.class)
@CucumberOptions
        (
        		features=".//Features/Job.feature",
                glue="stepDefinitions",
                dryRun=false,
                monochrome=true
		) 
public class runner {

} */

