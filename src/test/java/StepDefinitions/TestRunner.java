package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/resources/Features", glue = {"StepDefinitions"},
monochrome = true,
        plugin = {"pretty","html:target/htmlReports"},
tags = "@handy")
public class TestRunner {

}
