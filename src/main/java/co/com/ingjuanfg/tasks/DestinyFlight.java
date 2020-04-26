package co.com.ingjuanfg.tasks;

import static co.com.ingjuanfg.user_interfaces.SelectFlightsPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class DestinyFlight implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitUntil.the(IMG_PROGRESS_BAR, isNotVisible()),
        Click.on(BTN_SELECT_FLIGHT),
        Check.whether(BTN_SELECT_FARE_FLIGHT.resolveFor(actor).isVisible())
            .andIfSo(Click.on(BTN_SELECT_FARE_FLIGHT)));
  }
}
