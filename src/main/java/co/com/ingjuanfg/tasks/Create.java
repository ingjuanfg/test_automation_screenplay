package co.com.ingjuanfg.tasks;

import static co.com.ingjuanfg.userinterface.CreateAccountPage.*;
import static co.com.ingjuanfg.utils.strings.StringManager.generateEmail;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

public class Create implements Task {
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Enter.theValue(generateEmail()).into(TXT_EMAIL_ADDRESS),
        Click.on(BTN_TO_CREATE_ACCOUNT),
        Ensure.that(FRM_CREATE_ACCOUNT).isDisplayed());
  }

  public static Performable account() {
    return instrumented(Create.class);
  }
}
