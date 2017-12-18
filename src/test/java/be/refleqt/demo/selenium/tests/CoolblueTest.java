package be.refleqt.demo.selenium.tests;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/",
        glue="be.refleqt.demo.selenium.steps",
        plugin={"pretty", "json:target/cucumber/json/coolblue.json"}
)
public class CoolblueTest {
}
