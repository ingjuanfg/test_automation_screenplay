package co.com.ingjuanfg.tasks;

import static co.com.ingjuanfg.userinterface.ProceedCheckoutPage.*;
import static co.com.ingjuanfg.userinterface.ShoppingCartPage.BTN_PROCEED_TO_CHECKOUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Proceed implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitUntil.the(BTN_PROCEED_TO_CHECKOUT, isVisible()),
        Click.on(BTN_PROCEED_TO_CHECKOUT),
        Click.on(CHK_TERMS_CONDITIONS),
        Click.on(BTN_PROCEED_TO_CHECKOUT),
        Click.on(BTN_PAY_BANK_WIRE),
        Click.on(BTN_CONFIRM_ORDER));
  }

  public static Performable toCheckout() {
    return instrumented(Proceed.class);
  }
}
