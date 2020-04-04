package co.com.ingjuanfg.tasks;

import static co.com.ingjuanfg.user_interfaces.HomePage.INPUT_DATE;
import static co.com.ingjuanfg.utils.constants.TravelocityOptionsConstants.DEPARTURE_DATE_INPUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.ingjuanfg.interactions.SelectDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Choose implements Task {

  private String date;

  public Choose(String date) {
    this.date = date;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(INPUT_DATE.of(DEPARTURE_DATE_INPUT)), SelectDate.ofDeparture(date));
  }

  public static Choose departureDate(String date) {
    return instrumented(Choose.class, date);
  }
}
