package fr.slm.doc.avenue.test.acceptance;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:src/test/resources/report"}, features = {"src/test/resources"})
public class AllAcceptanceTests {
}
