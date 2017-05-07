package bdd.secondClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/bittech/Documents/workspace/BTC009/Class10/facebookLogin.feature",tags={"@smoke ,@reg"},plugin = {
        "pretty:Report/prettyReport.txt", "html:Report/cucumber", "json:Report/cucumber.json"})


public class Runner {

}
