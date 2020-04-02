package co.com.ingjuanfg.interactions;

import static co.com.ingjuanfg.user_interfaces.HomePage.BTN_TRAVEL_OPTIONS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

public class SelectTravelocity implements Interaction {
  private String option;

  public SelectTravelocity(String option) {
    this.option = option;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(BTN_TRAVEL_OPTIONS.of(option)));
  }

  public static Performable selectTravelocity(String option) {
    return instrumented(SelectTravelocity.class, option);
  }
}
