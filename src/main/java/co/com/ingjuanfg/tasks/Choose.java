package co.com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.ingjuanfg.user_interfaces.SelectFlightsPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Choose implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SELECT_FLIGHT),
                Click.on(BTN_SELECT_FARE_FLIGHT),
                WaitUntil.the(BTN_SELECT_FLIGHT, isVisible()),
                Click.on(BTN_SELECT_FLIGHT),
                WaitUntil.the(BTN_SELECT_FARE_FLIGHT, isVisible()),
                Click.on(BTN_SELECT_FARE_FLIGHT));
    }

    public static Performable theSpecificFlight(){
        return instrumented(Choose.class);
    }
}
