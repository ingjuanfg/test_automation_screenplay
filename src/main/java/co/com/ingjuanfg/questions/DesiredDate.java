package co.com.ingjuanfg.questions;

import static co.com.ingjuanfg.user_interfaces.HomePage.TXT_CALENDAR_YEAR_MONTH;
import static co.com.ingjuanfg.utils.list.ListManager.getTargetTextList;

import co.com.ingjuanfg.utils.date.DateManager;
import java.text.ParseException;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class DesiredDate implements Question<Boolean> {

  private String date;

  public DesiredDate(String date) {
    this.date = date;
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    String dateToSelect = "";
    try {
      dateToSelect = DateManager.getYearAndMonth(date);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    List<String> actualDates = getTargetTextList(TXT_CALENDAR_YEAR_MONTH, actor);
    return actualDates.contains(dateToSelect);
  }

  public static DesiredDate isVisible(String date) {
    return new DesiredDate(date);
  }
}
