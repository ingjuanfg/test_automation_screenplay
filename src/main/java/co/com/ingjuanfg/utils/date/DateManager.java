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

  public static String getYearAndMonth(String date) throws ParseException {
    Calendar calendar = getCalendar(date);
    String year = Integer.toString(calendar.get(Calendar.YEAR));
    String month = new SimpleDateFormat("MMM", Locale.ENGLISH).format(calendar.getTime());
    return month + " " + year;
  }

  public static String getYear(String date) throws ParseException {
    Calendar calendar = getCalendar(date);
    return Integer.toString(calendar.get(Calendar.YEAR));
  }

  public static int getMonth(String date) throws ParseException {
    Calendar calendar = getCalendar(date);
    return calendar.get(Calendar.MONTH);
  }

  public static int getDay(String date) throws ParseException {
    Calendar calendar = getCalendar(date);
    return calendar.get(Calendar.DAY_OF_MONTH);
  }
}
