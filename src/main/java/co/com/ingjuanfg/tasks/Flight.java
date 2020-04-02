package co.com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.ingjuanfg.interactions.SelectTravelocity.selectTravelocity;
import static co.com.ingjuanfg.utils.constants.TravelocityOptionsConstants.FLIGHTS_OPTION;

public class Flight implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(selectTravelocity(FLIGHTS_OPTION));
    }
}
