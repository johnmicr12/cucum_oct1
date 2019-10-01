package testbatchrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="stepdef",plugin= {"json:target/casestudy_cucumber-json-report.json"})
public class TRunner {

}