package co.com.ingjuanfg.stepdefinitions;

import static co.com.ingjuanfg.utils.constants.TravelocityOptionsConstants.DEPARTING;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import co.com.ingjuanfg.interactions.OpenBrowser;
import co.com.ingjuanfg.interactions.SelectDateCalander;
import co.com.ingjuanfg.tasks.Search;
import co.com.ingjuanfg.tasks.Car;
import co.com.ingjuanfg.tasks.SearchFlight;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingFlightStepDefinition {

  @Given("^that (.*) searchs the flight options$")
  public void thatTheUserWantsToLookSomeFlights(String nameActor) {
    theActorCalled(nameActor).wasAbleTo(OpenBrowser.withSpecificUrl(),
            Search.flight(),
            SearchFlight.informationFlight("LAX","LAS","9/6/2020","9/8/2020")


    );
  }

  @When("^he selects the flight$")
  public void heSelectsTheFlight() {}

  @Then("^he should see the ticket$")
  public void heShouldSeeTheTicket() {}
}
