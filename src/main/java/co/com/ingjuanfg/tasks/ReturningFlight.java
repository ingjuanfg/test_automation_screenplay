package co.com.ingjuanfg.tasks;

import static co.com.ingjuanfg.user_interfaces.SelectFlightsPage.BTN_SELECT_FARE_FLIGHT_2;
import static co.com.ingjuanfg.user_interfaces.SelectFlightsPage.BTN_SELECT_FLIGHT_2;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.ingjuanfg.interactions.Close;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ReturningFlight implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitUntil.the(BTN_SELECT_FARE_FLIGHT_2, isVisible()),
        Click.on(BTN_SELECT_FLIGHT_2),
        Check.whether(BTN_SELECT_FARE_FLIGHT_2.resolveFor(actor).isClickable())
            .andIfSo(Click.on(BTN_SELECT_FARE_FLIGHT_2))
            .otherwise(Close.popUps()));
  }
}
