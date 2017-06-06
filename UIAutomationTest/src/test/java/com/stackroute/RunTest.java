package com.stackroute;
import org.junit.runner.RunWith; 
//import cucumber.junit.Cucumber; 
//import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(cucumber.api.junit.Cucumber.class) 
//@Cucumber.Options(format = {"pretty", "html:target/cucumber"})
//@CucumberOptions(features = {"src/test/resources"}, format = {"pretty", "json:target/report.json"})
@CucumberOptions(glue={"com.stackroute"}, features = {"src/test/resources"}, format = {"pretty", "json:target/report.json"})
public class RunTest {

}
