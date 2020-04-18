package co.com.ingjuanfg.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Map;
import net.serenitybdd.screenplay.Performable;

public class Search {

  public static Performable flight(Map<String, String> detailsFlight) {
    return instrumented(Flight.class, detailsFlight);
  }

  public static Performable car() {
    return instrumented(Car.class);
  }
}
