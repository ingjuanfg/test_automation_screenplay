package co.com.ingjuanfg.tasks;

import static co.com.ingjuanfg.user_interfaces.BookingFlight.BTN_CONTINUE_BOOKING;
import static co.com.ingjuanfg.user_interfaces.BookingFlight.LBL_PAGE_TITLE_REVIEW;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.ingjuanfg.interactions.Change;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Booking implements Task {
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Change.toTheTab(),
        WaitUntil.the(LBL_PAGE_TITLE_REVIEW, isVisible()),
        Click.on(BTN_CONTINUE_BOOKING));
  }

  public static Performable theSelectedFlight() {
    return instrumented(Booking.class);
  }
}
