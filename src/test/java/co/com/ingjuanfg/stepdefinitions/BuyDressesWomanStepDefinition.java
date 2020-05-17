package co.com.ingjuanfg.stepdefinitions;

import static co.com.ingjuanfg.tasks.Buy.proceedToCheckout;
import static co.com.ingjuanfg.tasks.SelectProduct.selectProductToBuy;
import static co.com.ingjuanfg.userinterface.ConfirmOrderPage.LBL_ORDER_CONFIRMATION;
import static net.serenitybdd.screenplay.actors.OnStage.*;

import co.com.ingjuanfg.interactions.OpenBrowser;
import co.com.ingjuanfg.interactions.View;
import co.com.ingjuanfg.tasks.Create;
import co.com.ingjuanfg.tasks.FillOut;
import co.com.ingjuanfg.tasks.Proceed;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.ensure.Ensure;

public class BuyDressesWomanStepDefinition {

  @Given("^that (.*) selects the following dresses$")
  public void thatTheUserSelectsDress(String nameActor, List<Map<String, String>> nameProduct) {
    theActorCalled(nameActor)
        .wasAbleTo(OpenBrowser.withSpecificUrl(), selectProductToBuy(nameProduct));
  }

  @When("^She goes to the cart$")
  public void sheGoesCart() {
    theActorInTheSpotlight().attemptsTo(View.myShoppingCart(), proceedToCheckout());
  }

  @And("^creates a profile to buy$")
  public void SheCreatesProfileBuy(Map<String, String> personalInformation) {
    theActorInTheSpotlight()
        .attemptsTo(Create.account(), FillOut.form(personalInformation), Proceed.toCheckout());
  }

  @And("^creates a profile to buy clothes$")
  public void SheCreatesProfileBuyClothes(List<Map<String, String>> personalInformation) {
    theActorInTheSpotlight()
        .attemptsTo(Create.account(), FillOut.form(personalInformation), Proceed.toCheckout());
  }

  @And(
      "^creates a profile with that information: (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
  public void SheCreatesProfileBuyClothesString(
      String title,
      String firstName,
      String lastName,
      String password,
      String dayBirth,
      String monthBirth,
      String yearBirth,
      String company,
      String address,
      String city,
      String state,
      String postalCode,
      String additionalInfo,
      String homePhone,
      String mobilePhone,
      String alias) {
    theActorInTheSpotlight()
        .attemptsTo(
            Create.account(),
            FillOut.form(
                title,
                firstName,
                lastName,
                password,
                dayBirth,
                monthBirth,
                yearBirth,
                company,
                address,
                city,
                state,
                postalCode,
                additionalInfo,
                homePhone,
                mobilePhone,
                alias),
            Proceed.toCheckout());
  }

  @And("^creates her profile to buy$")
  public void sheCreatesHerProfile() {
    theActorInTheSpotlight().attemptsTo(Create.account(), FillOut.form(), Proceed.toCheckout());
  }

  @Then("^she should see the message (.*) as confirmation message$")
  public void heShouldSeeTheTicket(String confirmationMessage) {
    withCurrentActor(Ensure.that(LBL_ORDER_CONFIRMATION).text().contains(confirmationMessage));
  }
}
