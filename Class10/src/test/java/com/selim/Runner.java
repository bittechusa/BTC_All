package com.selim;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/bittech/Documents/workspace/BTC009/Class10/login.feature" ,tags={"@tag1"}, plugin = {
        "pretty:target/prettyReport.txt", "html:target/cucumber.html", "json:target/cucumber.json"})
public class Runner {

}
