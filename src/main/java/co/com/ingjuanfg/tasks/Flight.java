package co.com.ingjuanfg.tasks;

import static co.com.ingjuanfg.interactions.SelectTravelocity.selectTravelocity;
import static co.com.ingjuanfg.user_interfaces.FlightPage.*;
import static co.com.ingjuanfg.utils.constants.TravelocityOptionsConstants.*;

import co.com.ingjuanfg.interactions.SelectDate;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

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
        Click.on(INPUT_DATE.of(DEPARTURE_DATE_INPUT)),
        SelectDate.of(detailsFlight.get("departingDate")),
        Click.on(INPUT_DATE.of(RETURNING_DATE_INPUT)),
        SelectDate.of(detailsFlight.get("returningDate")));
  }
}
