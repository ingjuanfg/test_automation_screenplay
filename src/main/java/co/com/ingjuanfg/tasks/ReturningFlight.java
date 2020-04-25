package co.com.ingjuanfg.tasks;

import co.com.ingjuanfg.interactions.Close;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.ingjuanfg.user_interfaces.SelectFlightsPage.BTN_SELECT_FARE_FLIGHT;
import static co.com.ingjuanfg.user_interfaces.SelectFlightsPage.BTN_SELECT_FLIGHT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ReturningFlight implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
