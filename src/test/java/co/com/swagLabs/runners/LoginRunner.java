package co.com.swagLabs.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Login.feature",
        glue = {"co.com.swagLabs.stepdefinitions"},
        tags = {"@AutenticacionExitosa"},
        snippets = SnippetType.CAMELCASE
)

public class LoginRunner {
}
