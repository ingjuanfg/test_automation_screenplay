package co.com.ingjuanfg.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BookingFlightStepDefinition {

  @Before
  public void prepareStage() {
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("^that the User wants to look some flights$")
  public void thatTheUserWantsToLookSomeFlights() {

  }

  @When("^He selects the flight$")
  public void heSelectsTheFlight() {

  }

  @Then("^He should see the ticket$")
  public void heShouldSeeTheTicket() {
      
  }
}
