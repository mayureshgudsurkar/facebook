package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		    features = {"facebookLogin/Lgin.feature"},
		    glue = {"com.StepDefination"},
		    dryRun=false,
		    monochrome=true
		    
		
		
		
		
		
		)





public class TestRunner {

}
