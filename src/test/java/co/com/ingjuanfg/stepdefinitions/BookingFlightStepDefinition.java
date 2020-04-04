package co.com.ingjuanfg.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.ingjuanfg.interactions.OpenBrowser;
import co.com.ingjuanfg.tasks.Choose;
import co.com.ingjuanfg.tasks.Search;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingFlightStepDefinition {

  @Given("^that (.*) searchs the flight options$")
  public void thatTheUserWantsToLookSomeFlights(String nameActor) {
    theActorCalled(nameActor)
        .wasAbleTo(OpenBrowser.withSpecificUrl(), Search.flight(), Search.car());
  }

  @When("^he selects the flight on (.*)$")
  public void heSelectsTheFlight(String date) {
    theActorInTheSpotlight().attemptsTo(Choose.departureDate(date));
  }

  @Then("^he should see the ticket$")
  public void heShouldSeeTheTicket() {}
}
