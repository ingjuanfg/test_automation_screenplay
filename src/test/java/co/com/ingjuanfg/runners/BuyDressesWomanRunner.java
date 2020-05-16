package co.com.ingjuanfg.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/buy_dresses_woman.feature",
    glue = "co.com.ingjuanfg.stepdefinitions",
    snippets = SnippetType.CAMELCASE)
public class BuyDressesWomanRunner {}
