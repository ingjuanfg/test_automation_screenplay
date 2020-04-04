package co.com.ingjuanfg.interactions;

import static co.com.ingjuanfg.user_interfaces.HomePage.BTN_CALENDAR_NEXT_MONTHS;
import static co.com.ingjuanfg.user_interfaces.HomePage.BTN_DEPARTURE_DATE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.ingjuanfg.questions.DesiredDate;
import co.com.ingjuanfg.utils.date.DateManager;
import java.text.ParseException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

public class SelectDate implements Interaction {

  private String date;
  private String year;
  private String month;
  private String day;

  public SelectDate(String date) throws ParseException {
    this.date = date;
    this.year = DateManager.getYear(date);
    this.month = Integer.toString(DateManager.getMonth(date));
    this.day = Integer.toString(DateManager.getDay(date));
  }

  @Override
  public <T extends Actor> void performAs(T actor) {

    try {
      actor.attemptsTo(
          Check.whether(DesiredDate.isVisible(date))
              .andIfSo(Click.on(BTN_DEPARTURE_DATE.of(year, month, day)))
              .otherwise(Click.on(BTN_CALENDAR_NEXT_MONTHS), new SelectDate(date)));
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  public static Performable ofDeparture(String date) {
    return instrumented(SelectDate.class, date);
  }
}
