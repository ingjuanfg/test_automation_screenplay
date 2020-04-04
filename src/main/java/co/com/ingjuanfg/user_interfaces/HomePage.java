package co.com.ingjuanfg.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {
  public static final Target BTN_TRAVEL_OPTIONS =
      Target.the("Button to select travelocity options")
          .locatedBy("//button[@id='tab-{0}-tab-hp']");

  public static final Target BTN_DEPARTURE_DATE =
      Target.the("Date of departure")
          .locatedBy(
              "//button[@class='datepicker-cal-date' and @data-year='{0}' and @data-month='{1}' and @data-day='{2}']");

  public static final Target INPUT_DATE =
      Target.the("Input to select departure and returning date")
          .locatedBy("//input[@id='flight-{0}-hp-flight']");

  public static final Target TXT_CALENDAR_YEAR_MONTH =
      Target.the("Text of Year and Month shown in the calendar")
          .locatedBy("//caption[@class='datepicker-cal-month-header']");

  public static final Target BTN_CALENDAR_NEXT_MONTHS =
      Target.the("The button to show next months")
          .locatedBy("//button[contains(@class,'btn-secondary next')]");
}
