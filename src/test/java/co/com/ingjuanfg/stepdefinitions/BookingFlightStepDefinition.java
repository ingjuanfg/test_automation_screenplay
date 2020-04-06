package co.com.ingjuanfg.stepdefinitions;

import co.com.ingjuanfg.interactions.OpenBrowser;
import co.com.ingjuanfg.interactions.SelectDateCalander;
import co.com.ingjuanfg.tasks.Search;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;

import static co.com.ingjuanfg.user_interfaces.HomePage.TXT_DATE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class BookingFlightStepDefinition {

  @Given("^that (.*) searchs the flight options$")
  public void thatTheUserWantsToLookSomeFlights(String nameActor, Map<String, String> detailsFlight) {
    theActorCalled(nameActor).wasAbleTo(
            OpenBrowser.withSpecificUrl(),
            Search.flight(detailsFlight)
    );
  }

  @When("^he selects the flight$")
  public void heSelectsTheFlight() {}

  @Then("^he should see the ticket$")
  public void heShouldSeeTheTicket() {}
}
