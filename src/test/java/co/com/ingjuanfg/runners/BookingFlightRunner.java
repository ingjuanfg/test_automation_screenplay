package co.com.ingjuanfg.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/booking_flight.feature",
    glue = "co.com.ingjuanfg.stepdefinitions",
    snippets = SnippetType.CAMELCASE)
public class BookingFlightRunner {}
