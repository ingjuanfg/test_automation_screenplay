package co.com.ingjuanfg.stepdefinitions;

import co.com.ingjuanfg.interactions.OpenBrowser;
import co.com.ingjuanfg.tasks.Create;
import co.com.ingjuanfg.tasks.SelectProduct;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static co.com.ingjuanfg.interactions.Cart.viewMyShoppingCart;
import static co.com.ingjuanfg.tasks.Buy.proceedToCheckout;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyDressesWomanStepDefinition {

    @Given("^that (.*) selects the following dresses$")
    public void thatTheUserSelectsDress(String nameActor, List<Map<String,String>> nameProduct) {
        theActorCalled(nameActor).wasAbleTo(
                OpenBrowser.withSpecificUrl(),
                SelectProduct.toBuy(nameProduct)
        );
    }

    @When("^She goes to the cart$")
    public void sheGoesCart() {
        theActorInTheSpotlight().attemptsTo(
                viewMyShoppingCart(),
                proceedToCheckout()
        );
    }

    @And("^creates a profile to buy$")
    public void heSelectsTheFlight() {
        theActorInTheSpotlight().attemptsTo(
                Create.account()
        );
    }

    @Then("^She should see a confirmation message$")
    public void heShouldSeeTheTicket() {
    }
}