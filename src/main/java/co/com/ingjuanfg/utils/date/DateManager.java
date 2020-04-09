package co.com.ingjuanfg.utils.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

public class DateManager {

  @NotNull
  private static Calendar getCalendar(String date) throws ParseException {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date dateObject = simpleDateFormat.parse(date);
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(dateObject);
    return calendar;
  }

  public static String getYear(String date) throws ParseException {
    Calendar calendar = getCalendar(date);
    return String.valueOf(calendar.get(Calendar.YEAR));
  }

  public static String getMonth(String date) throws ParseException {
    Calendar calendar = getCalendar(date);
    return String.valueOf(calendar.get(Calendar.MONTH));
  }

  public static String getDay(String date) throws ParseException {
    Calendar calendar = getCalendar(date);
    return String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
  }
}
