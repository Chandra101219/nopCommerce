package testRunnerClasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		//features= {".//Feature_Files/"},
		//features= {".//Feature_Files/Register.feature"},
		//features= {".//Feature_Files/SearchProduct.feature"},
		//features= {".//Feature_Files/AddAddress.feature"},
		//features= {".//Feature_Files/LoginDDTExcel.feature"},
		//features= {".//Feature_Files/Register.feature",".//Feature_Files/Login.feature"},
		features= {".//Feature_Files/Register.feature",".//Feature_Files/SearchProduct.feature"},
		//features= {"@target/rerun.txt"},
		glue="stepDefinitionClasses",
		plugin= {"pretty", "html:reports/myreport.html", 
				  "rerun:target/rerun.txt",
				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},
				
		dryRun=false,    // checks mapping between scenario steps and step definition methods
		monochrome=true,    // to avoid junk characters in output
		publish=true   // to publish report in cucumber server
		//tags="@sanity"  // this will execute scenarios tagged with @sanity
		//tags="@regression"
		//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
		//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
		//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
					
			    )

public class Test_run_1 {
	
	

}
