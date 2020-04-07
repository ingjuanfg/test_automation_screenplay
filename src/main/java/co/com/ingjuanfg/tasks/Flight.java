package co.com.ingjuanfg.tasks;

import co.com.ingjuanfg.interactions.SelectDateCalander;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static co.com.ingjuanfg.interactions.SelectTravelocity.selectTravelocity;
import static co.com.ingjuanfg.user_interfaces.FlightPage.*;
import static co.com.ingjuanfg.utils.constants.TravelocityOptionsConstants.DEPARTING;
import static co.com.ingjuanfg.utils.constants.TravelocityOptionsConstants.FLIGHTS_OPTION;
import static co.com.ingjuanfg.utils.constants.TravelocityOptionsConstants.RETURNING;

public class Flight implements Task {
    private Map<String, String> detailsFlight;

    public Flight(Map<String, String> detailsFlight) {
        this.detailsFlight = detailsFlight;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                selectTravelocity(FLIGHTS_OPTION),
                Enter.theValue(detailsFlight.get("originCity")).into(TXT_FLYING_FROM),
                Click.on(OPT_AIRPORT.of(detailsFlight.get("flyingFrom"))),
                Enter.theValue(detailsFlight.get("destinyCity")).into(TXT_FLYING_TO),
                Click.on(OPT_AIRPORT.of(detailsFlight.get("flyingTo"))),
                SelectDateCalander.selectDateFligth(DEPARTING,detailsFlight.get("departingDate")),
                SelectDateCalander.selectDateFligth(RETURNING,detailsFlight.get("returningDate"))
        );
    }
}
