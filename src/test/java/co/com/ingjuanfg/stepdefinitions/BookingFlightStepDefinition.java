package co.com.ingjuanfg.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import co.com.ingjuanfg.interactions.OpenBrowser;
import co.com.ingjuanfg.tasks.Search;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.Map;

public class BookingFlightStepDefinition {

  @Given("^that (.*) searchs the flight options$")
  public void thatTheUserWantsToLookSomeFlights(
      String nameActor, Map<String, String> detailsFlight) {
    theActorCalled(nameActor)
        .wasAbleTo(OpenBrowser.withSpecificUrl(), Search.flight(detailsFlight));
  }

  @When("^he selects the flight$")
  public void heSelectsTheFlight() {}

  @Then("^he should see the ticket$")
  public void heShouldSeeTheTicket() {}
}
