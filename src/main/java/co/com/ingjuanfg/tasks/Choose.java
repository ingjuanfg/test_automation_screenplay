package co.com.ingjuanfg.tasks;

import co.com.ingjuanfg.interactions.Close;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.ingjuanfg.user_interfaces.SelectFlightsPage.BTN_SELECT_FARE_FLIGHT;
import static co.com.ingjuanfg.user_interfaces.SelectFlightsPage.BTN_SELECT_FLIGHT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Choose implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SELECT_FLIGHT),
                Check.whether(BTN_SELECT_FARE_FLIGHT.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(BTN_SELECT_FARE_FLIGHT)),
                WaitUntil.the(BTN_SELECT_FLIGHT, isVisible()),
                Click.on(BTN_SELECT_FLIGHT),
                Check.whether(BTN_SELECT_FARE_FLIGHT.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(BTN_SELECT_FARE_FLIGHT)).otherwise(
                        Close.popUps()
                )
        );
    }

    public static Performable theSpecificFlight() {
        return instrumented(Choose.class);
    }
}
