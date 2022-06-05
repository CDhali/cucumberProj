package runners;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	//features= {"src\\test\\java\\features\\TechFiosLoging.feature","src\\test\\java\\features\\OtherLoging.feature"},
	
	features= {"classpath:features"},               // it will access all the path from features class.
	glue="steps",                                  // that means the package name. w class your steps are in..
	tags="@logScenario1",                            // to run a specific Scenario inside the 1000 Scenario....
	monochrome= true,                              // pretty and monochrome working together..... its always ganna be true.
	dryRun= false,                                 //if is true it will not run the code
	plugin= {
			"pretty",
			"html:target/cucumber",                 // i want html file which is i want to save in targert/cucumber.
			"json:target/cucumber.json"
	
	}       // 
	
	
	// type of file u want...
	 )

public class LogingRunner {

}
//Regression is the same tags for calling drifferent feature at the same time... 